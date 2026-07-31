from collections import Counter

class Solution:
    def minimumPushes(self, word: str) -> int:
        count = Counter(word)

        sorted_counter = sorted(count , key = lambda i : count[i] , 
                                reverse = True)
        
        word_dict = {}

        for index , i in enumerate(sorted_counter):
            word_dict[i] = word_dict.get(i , 1) + (index//8)

        total = 0

        for i in word:
            total += word_dict[i]

        return total