class Solution:
    def compress(self, chars: List[str]) -> int:
        res=[]
        i=0
        while i<len(chars):
            c=1
            while i+c<len(chars) and chars[i]==chars[i+c]:
                c+=1
            res.append(chars[i])
            if c>1:
                for digit in str(c):
                    res.append(digit)
            i+=c
        chars[:]=res
        return len(chars)