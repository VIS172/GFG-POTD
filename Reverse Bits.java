class Solution {
    static Long reversedBits(Long x) {
        // code here
        long ans = 0;
        for(int i = 0; i < 32; i++) {
            ans = ans << 1; // moving all the bits (left shift by 1) to add the bit from the given number.
            ans = ans | (x & 1); // setting the bit thats in the last position of the given number.
            x = x >> 1; // right shift the given number to remove the last bit.
        }
        return (Long) ans;
    }
}