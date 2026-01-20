from collections import deque

class Solution:
    def decodeString(self, s: str) -> str:

        stack = []
        current_str = ""
        current_num = 0 

        for x in s:

            if x.isdigit():
                current_num = current_num *10 + int(x)
            elif x == '[':
                stack.append((current_str, current_num))
                current_str = ""
                current_num = 0
            elif x == ']':
                prev_str , num = stack.pop()
                current_str = prev_str + current_str * num

            else:
                current_str += x

        return current_str           

        