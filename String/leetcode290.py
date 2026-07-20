class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        words = s.split()

        if len(words) != len(pattern):
            return False

        pattern_dic = {}
        word_dic = {}


        for p , w in zip(pattern, words):
            if p in pattern_dic and pattern_dic[p] != w:
                return False
            if w in word_dic and word_dic[w] != p :
                return False
            
            pattern_dic[p] = w
            word_dic[w] = p


        return True