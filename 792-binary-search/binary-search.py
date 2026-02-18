class Solution:
    def search(self, nums: List[int], target: int) -> int:
        n=len(nums)
        left=0
        right=n-1
        flag=0
        while(left<=right):
            mid=(left+right)//2
            if(nums[mid]==target):
                flag=1
                return mid
            elif nums[mid]>target:
                right=mid-1
            else:
                left=mid+1
        if flag==0:
            return -1
            

        