class Solution:
    def maximizeSquareHoleArea(self, n: int, m: int, hBars: List[int], vBars: List[int]) -> int:
        
        max_height =0
        height = 1 
        max_width = 0
        width = 1
        
        hBars = sorted(hBars)
        vBars = sorted(vBars)
        h_comp = 0
        v_comp = 0
        for h in hBars:
            if h == h_comp:
                height +=1
            else:
                height =2
            h_comp = h+1
            max_height = max(max_height, height)

        for w in vBars:
            if w == v_comp:
                width +=1
            else:
                width =2
            v_comp = w+1
            max_width = max(max_width , width)

        
        length = min(max_height , max_width)

        result = length * length

        return result




