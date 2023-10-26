#IMPLEMENTATION OF CIRCULAR QUEUE
#REAR - INSERT
#FRONT - DELETE
class circular_queue:
    def __init__(self,size):
        self.size=size
        self.c_queue=[None]*size
        self.front=-1
        self.rear=-1
    def enqueue(self,element):
        if(self.front==-1 and self.rear==-1):
            self.front=0
            self.rear=0
            self.c_queue[self.rear]=element
            print(element,"is added to the circular queue")
        elif((self.rear+1)%self.size==self.front):
            print("circular queue is full!!")
        else:
            self.rear=(self.rear+1)%self.size
            self.c_queue[self.rear]=element
            print(element,"is added to the circular queue")
    def dequeue(self):
        if(self.front==-1 and self.rear==-1):
            print("circular queue is empty!!")
        elif(self.front==self.rear):
            print("the dequeued element is:",self.c_queue[self.front])
            self.front=-1
            self.rear=-1
        else:
            print("the dequeued element is:",self.c_queue[self.front])
            self.front=(self.front+1)%self.size
    def display(self):
        if(self.front==-1 and self.rear==-1):
            print("circular queue is empty!!")
        else:
            print("the circular queue is:")
            i=self.front
            while(i!=self.rear):
                print(self.c_queue[i])
                i=(i+1)%self.size
            print(self.c_queue[self.rear])
