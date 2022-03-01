class Solution:
    def getPermutation(self, n: int, k: int) -> str:
        nums = [str(i) for i in range(1, n+1)]
        factorial = [1]
        for i in range(1, n):
            factorial.append(factorial[-1] * i)
        k -= 1
        res = []
        for i in range(n):
            index = k // factorial[n-i-1]
            res.append(nums[index])
            nums.remove(nums[index])
            k -= index * factorial[n-i-1]
        return ''.join(res)