class Solution

{

    //Function to check if a string is Pangram or not.

    public static boolean checkPangram (String str) {

 

        str = str.replaceAll("\\s", "").toLowerCase();

 

        //Creating HashSet that will store the unique Characters only and then we check if it's size is equals to total number of alphabets.

        HashSet<Character> hs = new HashSet<>();

 

        for (char c : str.toCharArray()) {

            if (Character.isLetter(c)) {

                hs.add(c);

            }

        }

        return hs.size() == 26; //returns true if condition is true else returns false

    }

}