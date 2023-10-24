"""
Binary Search algorithm on Linked List

This algorithm is used to search for an element in a linked list 
using the binary Search algorithm

Time Complexity as ususal for linear search O(n)

"""



class Node:
    def __init__(self, val, next):
        self.val = val
        self.next = next

class LinkedList:
    def __init__(self):
        self.head = None
    
    def ins_beg(self,val):
        if self.head == None:
            self.head = Node(val, None)
        else:
            self.head = Node(val, self.head)
    
    def display(self):
        iter = self.head
        while iter:
            print(iter.val," ->", end = "")
            iter = iter.next

def LinearSearch(list, target):
    i = 1
    while list:
        if list.val == target:
            return f"found at {i}"
        else:
            list = list.next
            i += 1
    return f"Not found"



a = LinkedList()
a.ins_beg(3)
a.ins_beg(2)
a.ins_beg(5)
a.ins_beg(1)
print(LinearSearch(a.head, 5))
