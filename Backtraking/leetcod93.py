class Solution:
    def restoreIpAddresses(self, s: str) -> List[str]:

        result = []

        def dfs(start , path ):
            if len(path) == 4:
                if start == len(s):
                    result.append(".".join(path))
                return
            
            for i in range(start ,min(start+3 , len(s))):
                part = s[start : i + 1]
                if len(part) >1 and part[0] == "0":
                    break

                if int(part) > 255:
                    break

                path.append(part)
                dfs(i+1 , path)
                path.pop()

        dfs(0,[])

        return result                 
                