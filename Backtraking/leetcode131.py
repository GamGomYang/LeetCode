class Solution:
    def partition(self, s: str) -> List[List[str]]:
        result = []
        path = []

        def is_palindrome(word):
            return word == word[::-1]

        def dfs(start):
            if start == len(s):
                result.append(path[:])
                return

            for i in range(start, len(s)):
                part = s[start:i+1]


                if not is_palindrome(part):
                    continue

                path.append(part)
                dfs(i + 1)
                path.pop()

        dfs(0)
        return result