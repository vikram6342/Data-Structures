class Node:
    def __init__(self,data):
        self.data=data
        self.next=None

class Singly_Linked_List:

    def __init__(self):
        self.head=None

    def Add_at_Begin(self,data:any) ->list:
        new_node=Node(data)
        if self.head is None:
            self.head=new_node
        else:
            new_node.next=self.head
            self.head=new_node
        return 
    
    def Add_at_end(self,data:any) ->list:
        new_node=Node(data)
        if self.head is None:
            self.head=new_node
        else:
            current_node=self.head
            while(current_node.next):
                current_node=current_node.next
            current_node.next=new_node
        return 
    
    def Add_at_intermediate(self,data:any,index:int) ->list:
        new_node=Node(data)
        if self.head is None:
            self.head=new_node
        else:
            position=0
            current_node=self.head
            if position==index:
                self.Add_at_Begin(data)
            else:
                while(current_node !=None and position+1 != index):
                    position+=1
                    current_node=current_node.next

                if current_node != None:
                    new_node.next=current_node.next
                    current_node.next=new_node
                else:
                    print("index not present")
        return 
    
    def delete_at_begin(self):
        if self.head is None:
            return 
        self.head=self.head.next

    def delete_at_end(self):
        if self.head is None:
            return
        else:
            current_node=self.head
            while(current_node.next.next != None):
                current_node=current_node.next

            current_node.next=None
        return
    
    def delete_at_intermediate(self,index:int):
        if self.head is None:
            return
        else:
            position=0
            current_node=self.head
            if position==index:
                self.delete_at_begin()
            else:
                while(current_node !=None and position+1 != index):
                    position+=1
                    current_node=current_node.next

                if current_node != None:
                    current_node.next=current_node.next.next
                else:
                    print("index not present")
            return
        
    def delete_by_data(self,data:any):
        current_node=self.head
        while(current_node != None and current_node.next.data!=data):
            current_node=current_node.next
        if (current_node != None):
            current_node.next=current_node.next.next
        else:
            return
        
    def update_data(self,data:any,index:int):
        position=0
        current_node=self.head
        if position==index:
            current_node.data=data
        else:
            while(current_node !=None and position != index):
                position+=1
                current_node=current_node.next

            if current_node != None:
                current_node.data=data
            else:
                print("index not present")
        return 

    def Fetch_data(self):
        if (self.head is None):
            return 0
        else:
            current_node=self.head
            while(current_node):
                print(current_node.data)
                current_node=current_node.next
            return 0
    
    def size(self):
        if (self.head is None):
            return 0
        else:
            size=0
            current_node=self.head
            while(current_node):
                size+=1
                current_node=current_node.next
            return size
