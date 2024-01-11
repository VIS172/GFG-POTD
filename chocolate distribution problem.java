class Solution
{
    public long findMinDiff (ArrayList<Integer> list, int n, int m)
    {
        
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int diff = Integer.MAX_VALUE;
        int count  =  0;
        for(int i=0;i<n;i++){
            count++;
            
            if(count == m){
                max = list.get(i);
                min = list.get(i-m+1);
                diff = Math.min(diff,(max-min));
                count--;
            }
            
        }
        
        return diff;
        
      
    }
}