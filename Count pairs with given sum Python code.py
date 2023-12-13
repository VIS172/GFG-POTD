class Solution:
    def getPairsCount(self, arr, n, k):
        # code here
        d = {}
        count = 0
        for i in arr:
            complement = k - i
            if complement in d:
                count += d[complement]
            if i in d:
                d[i] += 1
            else:
                d[i] = 1
        return count