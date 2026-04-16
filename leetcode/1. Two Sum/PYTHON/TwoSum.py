from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        longitud = len(nums)
        combinacion = []
        for i in range(longitud):
            for j in range(longitud):
                if i == j:
                    continue
                if nums[i] + nums[j] == target:
                    combinacion.append(i)
                    combinacion.append(j)
                    return combinacion
        return combinacion
        
a = Solution()
print(a.twoSum([1,2,3,4],7))
