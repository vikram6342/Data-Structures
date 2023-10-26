class stack():
    def __init__(self):
        self.stack=[]
    def push(self,ele):
        self.stack.append(ele)
        print(ele,"is pushed into stack")
    def pop(self):
        if self.stack:
            print("popped element is:",self.stack[-1])
            self.stack.pop()
        else:
            print("stack is empty!!")
    def top(self):
        if not self.stack:
            print("stack is empty nothing in top")
        else:
            print("top of stack is:",self.stack[-1])
    def size(self):
        print("size of stack is:",len(self.stack))
    def isempty(self):
        if self.stack:
            print("stack is not empty")
        else:
            print("stack is empty")
    def display(self):
        print("stack is:",self.stack)
