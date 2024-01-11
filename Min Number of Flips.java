class Solution {
    public int minFlips(String S) {
        // Code here
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i=i+2){
            sb.append("0");
            sb.append("1");
        }
        StringBuilder sbs=new StringBuilder();
        for(int i=0;i<S.length();i=i+2){
            sbs.append("1");
            sbs.append("0");
        }
        String s1=sb.toString();
        String s2=sbs.toString();
        int count=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) != s1.charAt(i)){
                count++;
            }
        }
        int count2=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) != s2.charAt(i)){
                count2++;
            }
        }
        return Math.min(count,count2);
    }
}