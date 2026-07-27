from collections import Counter
from collections import defaultdict
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        dict1 = defaultdict(list)
        dict2 = defaultdict(list)


        for index , word in enumerate(s):
            dict1[word].append(index)

        for index, word in enumerate(t):
            dict2[word].append(index)



        return list(dict1.values()) == list(dict2.values())
        