from queue import Queue

class Solution:
    def rev(self, q):
        ans = Queue()
        for i in (list(q.queue))[::-1]: ans.put(i)
        return ans

