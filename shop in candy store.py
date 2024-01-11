class Solution:

    def candyStore(self, candies, N, K):
        candies.sort()
        minCost = 0
        buy = 0
        free = N - 1

        while buy <= free:
            minCost += candies[buy]
            buy += 1
            free -= K

        maxCost = 0
        buy = N - 1
        free = 0

        while buy >= free:
            maxCost += candies[buy]
            buy -= 1
            free += K

        return [minCost, maxCost]