class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        c=sorted(set(nums1).intersection(set(nums2)))
        return c