class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups={}
        for word in strs:
            key = str(sorted(word))
            if key not in groups:
                groups[key]=[word]
            else:
                groups[key].append(word)
        res=list(groups.values())
        return res
