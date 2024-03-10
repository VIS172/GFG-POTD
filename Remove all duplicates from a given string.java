class Solution {
    String removeDuplicates(String str) {
        HashSet<Character> hs=new HashSet<>();
        StringBuilder ans=new StringBuilder();
        hs.add(str.charAt(0));
        ans.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            char ch = str.charAt(i);
            if(!hs.contains(ch)){
                ans.append(str.charAt(i));
                hs.add(str.charAt(i));
            }
        }
        return ans.toString();
    }
}