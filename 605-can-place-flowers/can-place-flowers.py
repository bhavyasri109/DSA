class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        c=0
        for i in range(len(flowerbed)):
            if flowerbed[i]==1:
                continue
            if i==0:
                if len(flowerbed)==1 or flowerbed[i+1]==0:
                    c+=1
                    flowerbed[i]=1
            elif i==len(flowerbed)-1:
                if flowerbed[i-1]==0:
                    c+=1
                    flowerbed[i]=1
            elif flowerbed[i-1]==0 and flowerbed[i]==0 and flowerbed[i+1]==0:
                c+=1
                flowerbed[i]=1
        return c>=n