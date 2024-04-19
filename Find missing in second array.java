class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<m;i++){
            set.add(b[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(!set.contains(a[i])){
                ans.add(a[i]);
            }
        }
        return ans;
    }
}