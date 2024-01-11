class Solution{
    static String patternFill(String s){
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        while(j<s.length()){
            if(s.charAt(i)!=s.charAt(j)){
                char ch=s.charAt(i);
                int count=0;
                while(s.charAt(i)!=s.charAt(j)){
                    i++;
                    count++;
                }
                sb.append(count);
                sb.append(ch);
            }
            else{
                j++;
            }
        }
        
        return sb.toString();

    }
    static String lookandsay(int n) {
        String[] sequence=new String[n];
        sequence[0]="1";
        for(int i=1;i<n;i++){
            String prev=sequence[i-1];
            sequence[i]=patternFill(prev+"-");
        }
        return sequence[n-1];
    }
}