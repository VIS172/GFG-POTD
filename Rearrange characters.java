class Pair implements Comparable<Pair>{
    char ch;
    int freq;
    Pair(char c,int f){
        ch = c;
        freq = f;
    }
    public int compareTo(Pair obj){
        return obj.freq-this.freq;
    }
}
class Solution
{
	public static String rearrangeCharacters(String str) {
	    //create a hashmap 
	    HashMap<Character,Integer> fmap = new HashMap<>();
	    for(int i =0;i<str.length();i++){
	        char ch = str.charAt(i);
	        fmap.put(ch,fmap.getOrDefault(ch,0)+1);
	    }
	    PriorityQueue<Pair> pq = new PriorityQueue<>();
	    for(char ch:fmap.keySet()){
	        pq.add(new Pair(ch,fmap.get(ch)));
	    }
	   StringBuilder ans=new StringBuilder();
	    Pair prevPair = new Pair('#',-1);
	    while(pq.size()>0){
	        //remove
	        Pair p = pq.remove();
	        //get data
	        char ch = p.ch;
	        //add character in a string
	        ans.append(p.ch);
	        //decreae the frequency
	        p.freq = p.freq-1;
	        if(prevPair.freq>0){
	            pq.add(prevPair);
	        }
	            prevPair = p;
	    }
	    //if  ans string length is not equal to original string length
	   if(ans.length()!=str.length())return "-1";
	    return ans.toString();
	}
}