class Solution:
    def isPalindrome(self, s: str) -> bool:
        cleanedstr=""
        for i in s:
            if i.isalnum():
                cleanedstr+=i.lower()
        return cleanedstr==cleanedstr[::-1]