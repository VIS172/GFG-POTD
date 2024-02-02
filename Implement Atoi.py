class Solution:
    def atoi(self, s):
        a = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'}
        l = s[0]
        if l == '-':
            sign = -1
            start_index = 1
        else:
            sign = 1
            start_index = 0
        result = 0
        for i in range(start_index, len(s)):
            if s[i] in a:
                result = result * 10 + int(s[i])
            else:
                return -1
        return sign * result