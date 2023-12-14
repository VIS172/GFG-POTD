class Solution:
    def trappingWater(self, arr, n):
        """
        Calculate the amount of water that can be trapped between the bars.
        
        :param arr: List of bar heights.
        :param n: Number of bars.
        :return: Amount of trapped water.
        """
        if n <= 1:
            return 0

        left_max = self.calculate_left_max(arr, n)
        right_max = self.calculate_right_max(arr, n)

        return self.calculate_trapped_water(arr, left_max, right_max, n)

    def calculate_left_max(self, arr, n):
        left_max = [0] * n
        left_max[0] = arr[0]
        
        for i in range(1, n):
            left_max[i] = max(left_max[i-1], arr[i])
        
        return left_max

    def calculate_right_max(self, arr, n):
        right_max = [0] * n
        right_max[n-1] = arr[n-1]
        
        for i in range(n-2, -1, -1):
            right_max[i] = max(right_max[i+1], arr[i])
        
        return right_max

    def calculate_trapped_water(self, arr, left_max, right_max, n):
        res = 0

        for i in range(n):
            res += min(left_max[i], right_max[i]) - arr[i]
        
        return res