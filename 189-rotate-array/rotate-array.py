class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def helper(l,r,arr):
            while l<r:
                arr[l],arr[r]=arr[r],arr[l]
                l+=1
                r-=1
        k=k%len(nums)
        helper(0,len(nums)-1,nums)
        helper(0,k-1,nums)
        helper(k,len(nums)-1,nums)
        
        
        