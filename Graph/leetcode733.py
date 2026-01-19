from collections import deque

class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:      
        if not image: return []

        row, col = len(image), len(image[0])
        original = image[sr][sc]

        if original == color: return image

        directions = [[-1,0], [1,0], [0,-1], [0,1]]
        q = deque()
        q.append((sr,sc))

        image[sr][sc] = color
        while q:
            r, c = q.popleft()
            
            for dr, dc in directions:
                nr, nc = r + dr, c + dc

                if 0 <= nr < row and 0 <= nc < col and image[nr][nc] == original:
                    image[nr][nc] = color
                    q.append((nr, nc))

        return image