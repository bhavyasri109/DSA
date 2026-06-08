class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_price=prices[0]
        max_pro=0
        for i in range(len(prices)):
            max_pro=max(max_pro,prices[i]-min_price)
            min_price=min(min_price,prices[i])
        return max_pro