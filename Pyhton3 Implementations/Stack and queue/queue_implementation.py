class queue():
    def __init__(self,size):
        self.size=size
        self.queue=[None]*self.size
        self.front=self.rear=-1

    def enqueue(self,element):
        if(self.front==-1 and self.rear==-1):
            self.front=0
            self.rear=0
            self.queue[self.rear]=element
            print(element,"added into queue")
        elif(self.rear+1>=self.size):
            print("queue is full!!")
        else:
            self.rear+=1
            self.queue[self.rear]=element
            print(element,"added into queue")

    def dequeue(self):
        if self.front==-1:
            print("queue is empty")
        elif(self.front==self.rear):
            print("the dequeued element is:",self.queue[self.front])
            self.queue[self.front]=None
            self.front=self.rear=-1
        else:
            print("the dequeued element is:",self.queue[self.front])
            self.queue[self.front]=None
            self.front+=1

    def size_of_queue(self):
        print("size of queue is:",self.size)

    def front_ele(self):
        print("front of the queue is:",self.queue[self.front])

    def isempty(self):
        if self.front==-1 and self.rear==-1:
            print("queue is empty")
        else:
            print("queue is not empty")

    def display(self):
        print("the queue is:")
        i=self.front
        while(i<self.size):
            print(self.queue[i])
            i+=1
