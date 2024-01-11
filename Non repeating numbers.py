class Solution:
    def singleNumber(self, nums):
        d = {}
        for i in nums:
            if i not in d:
                d[i] = 1
            else:
                d[i] += 1
                
        l = []
        for i in d:
            if d[i] == 1:
                l.append(i)
            if(len(l)==2):
                break
            
        return sorted(l)