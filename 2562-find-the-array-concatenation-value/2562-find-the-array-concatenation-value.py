class Solution:
    def findTheArrayConcVal(self, nums: List[int]) -> int:
        answer = 0
        left, right = 0, len(nums) - 1
        while left < right:
            answer += int(str(nums[left]) + str(nums[right]))
            left, right = left + 1, right - 1
        if left == right:
            answer += nums[left]
        return answer
        