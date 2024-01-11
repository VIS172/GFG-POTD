class Solution{
    static void Print(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> l,ArrayList<Integer> a,int t,int index){
        if(index == a.size()){
            if(t == 0){
                ans.add(new ArrayList<>(l));
            }
            return;
        }
        //include
        if(a.get(index) <= t){
            l.add(a.get(index));
            Print(ans,l,a,t-a.get(index),index);
            l.remove(l.size() - 1);
        }
        //exclude
        Print(ans,l,a,t,index+1);
    }
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B){
        // add your code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(A);
        A = new ArrayList<>(set);
        Collections.sort(A);
        Print(ans,new ArrayList<>(),A,B,0);
        return ans;
    }
}