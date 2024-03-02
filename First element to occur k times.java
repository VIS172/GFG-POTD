class Solution
{
    public int firstElementKTime(int n, int k, int[] a) { 
        //Base case
        if(k == 0)return -1;
        if(a.length == 0)return -1;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        return Arrays.stream(a)
                     .filter(num ->{ 
                          map.put(num, map.getOrDefault(num,0)+1);
                          return map.get(num) == k;
                          })
                          .findFirst()
                          .orElse(-1);
    } 
}
//TC : O(N);
//SC : O(N);