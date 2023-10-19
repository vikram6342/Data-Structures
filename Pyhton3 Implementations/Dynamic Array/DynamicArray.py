from ctypes import py_object

class Dynamic_Array:
    
    def __init__(self):
        self.pos = 0
        self.capacity = 1
        self.array = self.MakeArray(self.capacity)
        
    def __getitem__(self, ind) -> int:
        if not self.isValid(ind):
            raise IndexError(f"invalid index {ind} \nplease provide a valid index")
        return self.array[ind]
    
    def __setitem__(self, ind, val) -> int:
        if not self.isValid(ind):
            raise IndexError(f"invalid index {ind} \nplease provide a valid index")
        
        self.array[ind] = val
        
    def __len__(self):
        return self.pos
    
        
    def __repr__(self):
        string = "["
        for i in range(self.pos):
            string += str(self.array[i])
            if i != self.pos - 1:
                string += ','
        string += "]"
        return string
    
    
    
    def isValid(self, ind) -> bool:    
        return 0 <= ind < self.pos
    
    def _checkSize(self) -> None:
        if self.pos * 2 >= self.capacity:
            self.capacity *= 2
            temp = self.MakeArray(self.capacity)
            for i in range(self.pos):
                temp[i] = self.array[i]
            self.array = temp
    
            
    def add_at_end(self, val : int) -> None:
        self.array[self.pos] = val
        self.pos += 1
        self._checkSize()
    
    def MakeArray(self, capacity):
        return (capacity * py_object)()
    
    
A = Dynamic_Array()

print(len(A))
