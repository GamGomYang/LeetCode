from typing import List
import random
class RandomizedSet:

    def __init__(self):
        self.arr =[]
        self.dict = {}
        return 

    def insert(self, val: int) -> bool:
        arr = self.arr
        dict = self.dict

        if val in dict:
            return False

        else:
            dict[val] = len(arr)
            arr.append(val)
            return True
        

    def remove(self, val: int) -> bool:
        dict = self.dict
        arr = self.arr 

        if val not in dict:
            return False
        else:
            index = dict[val]
            last  = arr[-1]
            

            arr[index] = last
            dict[last] = index
            del dict[val]
            arr.pop()
            
            return True


        

    def getRandom(self) -> int:
        arr = self.arr
        return random.choice(arr)

        


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()