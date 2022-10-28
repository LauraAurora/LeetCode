class Solution:
    def isPalindrome(self, s: str) -> bool:

        newStr = ""

        for c in s:
            if c.isalnum():
                newStr += c.lower()     
        return newStr == newStr[::-1]

    #Time -> O(n) or O(n^2)
    #Space -> O(n) in building the string and reversing