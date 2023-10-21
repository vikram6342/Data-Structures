class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class CircularSinglyLinkedList:
    def __init__(self):
        self.head = None

    def Add_at_Begin(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            new_node.next = self.head
        else:
            new_node.next = self.head
            current_node = self.head
            while current_node.next != self.head:
                current_node = current_node.next
            current_node.next = new_node
            self.head = new_node

    def Add_at_end(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            new_node.next = self.head
        else:
            current_node = self.head
            while current_node.next != self.head:
                current_node = current_node.next
            current_node.next = new_node
            new_node.next = self.head

    def Add_at_intermediate(self, data, index):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            new_node.next = self.head
        else:
            position = 0
            current_node = self.head
            if position == index:
                self.Add_at_Begin(data)
            else:
                while current_node and position + 1 != index:
                    position += 1
                    current_node = current_node.next

                if current_node:
                    new_node.next = current_node.next
                    current_node.next = new_node
                else:
                    print("Index not present")

    def delete_at_begin(self):
        if self.head is None:
            return
        current_node = self.head
        while current_node.next != self.head:
            current_node = current_node.next
        current_node.next = self.head.next
        self.head = self.head.next

    def delete_at_end(self):
        if self.head is None:
            return
        current_node = self.head
        while current_node.next.next != self.head:
            current_node = current_node.next
        current_node.next = self.head

    def delete_at_intermediate(self, index):
        if self.head is None:
            return
        position = 0
        current_node = self.head
        if position == index:
            self.delete_at_begin()
        else:
            while current_node and position + 1 != index:
                position += 1
                current_node = current_node.next

            if current_node:
                current_node.next = current_node.next.next
            else:
                print("Index not present")

    def delete_by_data(self, data):
        current_node = self.head
        if current_node.data == data:
            self.delete_at_begin()
            return
        while current_node.next != self.head:
            if current_node.next.data == data:
                current_node.next = current_node.next.next
                return
            current_node = current_node.next

    def update_data(self, data, index):
        position = 0
        current_node = self.head
        while current_node and position != index:
            position += 1
            current_node = current_node.next

        if current_node:
            current_node.data = data
        else:
            print("Index not present")

    def Fetch_data(self):
        if self.head is None:
            return
        current_node = self.head
        while True:
            print(current_node.data)
            current_node = current_node.next
            if current_node == self.head:
                break

    def size(self):
        if self.head is None:
            return 0
        size = 0
        current_node = self.head
        while True:
            size += 1
            current_node = current_node.next
            if current_node == self.head:
                break
        return size

