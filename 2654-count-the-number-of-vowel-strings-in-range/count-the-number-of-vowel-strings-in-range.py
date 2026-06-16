class Solution:
    def vowelStrings(self, words: List[str], left: int, right: int) -> int:
        c=0
        for i in range(left,right+1):
            if words[i][0] in 'aeiou' and words[i][-1] in 'aeiou':
                c+=1
        return c