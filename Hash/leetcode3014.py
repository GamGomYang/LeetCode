
class Solution:
    def minimumPushes(self, word: str) -> int:

        count= set()

        for w in word:
            count.add(w)

        total = 0
        for i in range( len(count)):
            if i < 8 :
                total+=1
            elif i<16:
                total+=2
            elif i<24:
                total += 3
            else:
                total +=4

        return total





                    