class Solution
{
    //Function to find sum of all possible substrings of the given string.
    public static long sumSubstrings(String s)
    {
   	    int n = s.length();
        long mod = 1000000007;
        long result = 0;
        long multiplier = 1; // To keep track of 10^i

        for (int i = n - 1; i >= 0; i--) {
            long num = Long.parseLong(s.substring(i, i + 1)); // Single digit number at position i
            long contribution = (num * (i + 1) * multiplier) % mod; // Contribution of this digit
            result = (result + contribution) % mod; // Add contribution to result
            multiplier = (multiplier * 10 + 1) % mod; // Update multiplier for next position
        }
        return result;
    }
}