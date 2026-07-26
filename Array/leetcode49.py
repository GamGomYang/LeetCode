class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:


        hash = {}

        for word in strs:

            key = "".join(sorted(word))

            if key not in hash:
                hash[key] = []

            hash[key].append(word)

        return list(hash.values())