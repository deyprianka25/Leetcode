class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        cnt = ans = 0
        m = {0:-1}
        for i, n in enumerate(nums):
            cnt += (n*2 - 1)
            if cnt in m: ans = max(ans, i - m[cnt])
            else: m[cnt] = i
        return ans
        
        