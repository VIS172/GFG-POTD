class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        List<String>a=new ArrayList<>();
        List<Character>ds=new ArrayList<>();
        int n=s.length();
        func(0,n,s,ds,a);
        Collections.sort(a);
        return a;
    }
    public void func(int ind,int n,String s,List<Character>ds,List<String>a){
        if(ind>=n){
            String p="";
            for(int i=0;i<ds.size();i++){
                p+=ds.get(i);
            }
           if(p.length()>0){
            a.add(p);}
            return ;
        }
        ds.add(s.charAt(ind));
        func(ind+1,n,s,ds,a);
        ds.remove(ds.size()-1);
        func(ind+1,n,s,ds,a);
    }
}