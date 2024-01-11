class Solution {
    public static String kthPermutation(int n,int k) {
    
       
       ArrayList<Integer> nums = new ArrayList<>();
       for(int i = 1; i <= n; i++){
           nums.add(i);
       }
       
       int factorial = 1;
       for(int i=1; i<nums.size(); i++) factorial *= i;
       
       k = k-1;
       String ans = "";
       
       while(true){
           ans += nums.get(k/factorial);
           nums.remove(k/factorial);
           
           if(nums.size() == 0) return ans;
           
           k = k % factorial;
           factorial = factorial / nums.size();
       }
       
       
    }
    
    
}