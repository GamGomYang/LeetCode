class Node:
    def __init__(self, key, value):
        self.key = key
        self.value = value
        self.prev = None
        self.next = None

class LRUCache:

    def __init__(self, capacity: int):
        self.capacity = capacity
        self.cache = {}  

        self.head = Node(0, 0)  
        self.tail = Node(0, 0)  
        self.head.next = self.tail
        self.tail.prev = self.head

    def _remove(self, node: Node):
        prev = node.prev
        nxt = node.next
        prev.next = nxt
        nxt.prev = prev

    def _add_to_front(self, node: Node):
        node.prev = self.head
        node.next = self.head.next
        self.head.next.prev = node
        self.head.next = node

    def get(self, key: int) -> int:
        if key not in self.cache:
            return -1

        node = self.cache[key]

        self._remove(node)
        self._add_to_front(node)

        return node.value

    def put(self, key: int, value: int) -> None:
        if key in self.cache:

            node = self.cache[key]
            node.value = value
            self._remove(node)
            self._add_to_front(node)
        else:

            node = Node(key, value)
            self.cache[key] = node
            self._add_to_front(node)

        
            if len(self.cache) > self.capacity:
                lru = self.tail.prev  
                self._remove(lru)
                del self.cache[lru.key]
