"""
Binary Search algorithm on Linked List

This algorithm is used to search for an element in a linked list 
using the binary Search algorithm

Eventhough the algorithm uses binary search whose complexity is O(logn)
this algorithm turns out to be O(n) since the middle element has to be
found by traversing half the linked list

"""



class Node:
    def __init__(self,val, link = None):
        self.val = val
        self.link = link
class LinkedList:
    def __init__(self):
        self.head = None
        self.end = None

    def insEnd(self, val : int):
        if self.head == None:
            self.head = Node(val)
            self.end = self.head
        else:
            self.end.link = Node(val)
            self.end = self.end.link

    def display(self):
        temp = self.head
        while temp != None:
            print(f"{self.head.val} ->", end = " ")
            temp = temp.link

class Search:
    def __init__(self, head, end):
        self.head = head
        self.end = end

    def calcMid(self):
        
        slow, fast = self.head, self.head.link  #Assuming the linked list has atleast one node
        while fast != None:
            if fast.link == None:
                break
            else:
                fast = fast.link.link
                slow = slow.link
        return slow
    

    def binarySearch(self, target : int) -> str:
        while self.head != self.end:
            mid = self.calcMid()
            if mid.val == target:
                return "Found the element"
                return
            elif mid.val > target:
                self.end = mid
                self.end.link = None
            else:
                self.head = mid.link
        if self.head.val == target:
            return "Element found"
        return "Element not found"


a = LinkedList()
a.insEnd(1)
a.insEnd(22)
a.insEnd(33)
a.insEnd(44)
a.display()

s = Search(a.head, a.end)
s.binarySearch(26)
