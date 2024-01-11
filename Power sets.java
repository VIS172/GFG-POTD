class Solution
{
        public List<String> a=new ArrayList<>();
    public List<String> AllPossibleStrings(String s)
    {
        // Code here\
        String ans="";
        findsubsequences(s,ans);
        Collections.sort(a);
        a.remove("");
        return a;
    }
       public void findsubsequences(String s,
                                         String ans)
    {
        if (s.length() == 0) {
            a.add(ans);
            return;
        }
 
        // We add adding 1st character in string
        findsubsequences(s.substring(1), ans + s.charAt(0));
 
        // Not adding first character of the string
        // because the concept of subsequence either
        // character will present or not
        findsubsequences(s.substring(1), ans);
    }
}