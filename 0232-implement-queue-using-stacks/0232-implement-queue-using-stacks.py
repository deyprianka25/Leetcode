class MyQueue:

    def __init__(self):
        self.stk1 = []
        self.stk2 = []
        

    def push(self, x: int) -> None:
        self.stk1.append(x)
        

    def pop(self) -> int:
        for i in range(len(self.stk1)):
            self.stk2.append(self.stk1.pop(-1))
        popped = self.stk2.pop(-1)
        for i in range(len(self.stk2)):
            self.stk1.append(self.stk2.pop(-1))
        return popped    
        

    def peek(self) -> int:
        for i in range(len(self.stk1)):
            self.stk2.append(self.stk1.pop(-1))
        peeked = self.stk2[-1]
        for i in range(len(self.stk2)):
            self.stk1.append(self.stk2.pop(-1))
        return peeked
        

    def empty(self) -> bool:
        if(len(self.stk1)==0):
            return True
        else:
            return False
        


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()