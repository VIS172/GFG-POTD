class Solution {
    public int grayToBinary(int n) {
        int num = 0;
while (n != 0) {
num ^= n;
n >>= 1;
}
return num;
}
}