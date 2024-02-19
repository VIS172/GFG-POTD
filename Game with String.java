class Solution{
    static int minValue(String s, int k){
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(Character c: map.keySet()) {
            pq.add(map.get(c));
        }
        
        int count = 0;
        while(count!=k) {
            int num = pq.remove();
            num--;
            if(num>0) {
                pq.add(num);
            }
            count++;
        }
        
        int sum = 0;
        
        while(!pq.isEmpty()) {
            sum+= (int)Math.pow(pq.remove(),2);
        }
        
        return sum;
    }
}