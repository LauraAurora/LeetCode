class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left = 0 
        right = 1
        profit = 0
        
        if not prices:
            return 0
        
        while right < len(prices):
            current = prices[right] - prices[left]
            if prices[left]  < prices[right]:
                profit = max(current, profit)
            else: 
                left = right
            right += 1
        return profit
