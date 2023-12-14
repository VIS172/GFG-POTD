
//User function Template for Java
class Solution{
    static int findPlatform(int arr[], int dep[], int n){
        Pair[] pp = new Pair[n];
        int res=1;
        
        for(int i=0;i<n;i++)
            pp[i] = new Pair(arr[i],dep[i]);
        
        Arrays.sort(pp,(a,b)->a.a-b.a);
        ArrayList<Pair> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            helper(list,pp[i]);
            res = list.size();
        }
        
        return res;
    }
    
    static void helper(ArrayList<Pair> list,Pair p){
        for(int i=0;i<list.size();i++){
            if(list.get(i).d < p.a){
                list.set(i,p);
                return;
            }
        }
        list.add(p);
    }
    
}

class Pair{
    int a;
    int d;
    Pair(int x,int y){
        a = x;
        d = y;
    }
}