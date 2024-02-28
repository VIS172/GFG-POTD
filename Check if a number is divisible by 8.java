class Solution{
    int DivisibleByEight(String s){
        if(s.length()<=4){
            int temp=Integer.parseInt(s);
            return temp%8==0?1:-1;
        }else {
            int len=s.length();
            int temp=Integer.parseInt(s.substring(len-3));
             return temp%8==0?1:-1;
        }
    }
}