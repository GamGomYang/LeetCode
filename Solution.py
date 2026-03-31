from collections import defaultdict

class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:


        ransom_result = defaultdict(int)
        magazine_result = defaultdict(int)

        for a in ransomNote :
            ransom_result[a] += 1

        for b in magazine:
            magazine_result[b] +=1 


        for c in ransom_result:
            if magazine_result[c] != ransom_result[c] :
                return False


        return True


        