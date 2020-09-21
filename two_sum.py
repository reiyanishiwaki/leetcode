class Solution(object):
    def twoSum(self, nums, target):
        for n in range(0,len(nums)):
            for m in range(1,len(nums)):
                if nums[n]+nums[m] == target and n != m:
                    return n,m

