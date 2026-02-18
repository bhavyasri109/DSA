class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        n=len(nums)
        left=0
        right=n-1
        def lef(nums,target,left,right):
            ans=-1
            while(left<=right):
                mid=(left+right)//2
                if nums[mid]==target:
                    ans=mid
                    right=mid-1
                elif nums[mid]>target:
                    right=mid-1
                else:
                    left=mid+1
            return ans
        def righ(nums,target,left,right):
            ans=-1
            while(left<=right):
                mid=(left+right)//2
                if nums[mid]==target:
                    ans=mid
                    left=mid+1
                elif nums[mid]>target:
                    right=mid-1
                else:
                    left=mid+1
            return ans
        j=lef(nums,target,left,right)
        k=righ(nums,target,left,right)
        return [j,k]
            