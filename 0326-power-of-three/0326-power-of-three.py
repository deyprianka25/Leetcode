class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        '''if (n <= 0):
            return False
        if (n % 3 == 0):
            return isPowerOfThree(n // 3)
        if (n == 1):
            return True
        return False'''
        if n == 1:
            return True
        if n == 0 or n % 3 != 0:
            return False
        return self.isPowerOfThree(n/3)
        