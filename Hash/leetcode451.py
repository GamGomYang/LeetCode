class Solution:
    def frequencySort(self, s: str) -> str:

        dict = {}

        for i in s:
            dict[i] = dict.get(i , 0) +1


        sorted_char = sorted(
            dict , 
            key=lambda i : dict[i],
            reverse = True
        )

        result = ""

        for word in sorted_char:
            result += word*dict[word]

        return result


