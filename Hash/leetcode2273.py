class Solution:
    def removeAnagrams(self, words: List[str]) -> List[str]:

        hash = {}
        result = []

        for word in words:
            key = "".join(sorted(word))


            if result:
                prev_key = "".join(sorted(result[-1]))

                if key == prev_key:
                    continue
                
            result.append(word)


        return result

