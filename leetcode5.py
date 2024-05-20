class Solution:
    def longestPalindrome(self, s:str)-> str:
        def expand(left,right):
            while left >= 0 and right < len(s) and s[left] == s[right]:
                left -= 1
                right +=1
            return s[left+1:right]
        
             
        if len(s)<2:
            return s
        
        longest_palindrome =""

        for i in range(len(s)):
            palindrome1 = expand(i,i)
            palindrome2 = expand(i,i+1)

            longest_palindrome = max(longest_palindrome,palindrome1,palindrome2,key=len)


        return longest_palindrome
       