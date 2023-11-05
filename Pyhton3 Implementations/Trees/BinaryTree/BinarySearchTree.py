class BinarySearchTree:
    def __init__(self):
        self.root = None

    class Node:
        def __init__(self, value):
            self.value = value
            self.left = None
            self.right = None
            
    def insert(self, key):
        if self.root is None:
            self.root = self.Node(key)
        else:
            self._insert_recursive(self.root, key)

    def _insert_recursive(self, current_node, key):
        if key < current_node.value:
            if current_node.left is None:
                current_node.left = self.Node(key)
            else:
                self._insert_recursive(current_node.left, key)
        else:
            if current_node.right is None:
                current_node.right = self.Node(key)
            else:
                self._insert_recursive(current_node.right, key)
    
    def binary_search_(self,key):
        self.binary_search_rec(self.root,key)

    def binary_search_rec(self,root, key):

        if root is None:
            print("NO")
            return 0

        if key == root.value:
            print("YES")
            return 0
        elif key > root.value:
            self.binary_search_rec(root.right,key)
        else:
            self.binary_search_rec(root.left,key)
        


    def delete(self, key):
        self.root = self._delete_recursive(self.root, key)

    def _delete_recursive(self, current_node, key):
        if current_node is None:
            return current_node
        if key < current_node.value:
            current_node.left = self._delete_recursive(current_node.left, key)
        elif key > current_node.value:
            current_node.right = self._delete_recursive(current_node.right, key)
        else:
            if current_node.left is None:
                return current_node.right
            elif current_node.right is None:
                return current_node.left
            current_node.value = self.find_min_r(current_node.right)
            current_node.right = self._delete_recursive(current_node.right, current_node.value)
        return current_node

    def find_min_r(self,root):
        current = root
        while current.left:
            current = current.left
        return current.value
    
    def display(self):
        self.display_helper(self.root, 0)

    def display_helper(self, node, level):
        if node is None:
            return

        self.display_helper(node.right, level + 1)

        if level != 0:
            for i in range(level - 1):
                print("|        ", end="")
            print("|------->" + str(node.value))
        else:
            print(node.value)
        
        self.display_helper(node.left, level + 1)

    def height(self):
        return self._height_recursive(self.root)

    def _height_recursive(self, current_node):
        if current_node is None:
            return 0
        left_height = self._height_recursive(current_node.left)
        right_height = self._height_recursive(current_node.right)
        return 1 + max(left_height, right_height)
    
    def find_min(self):
        current = self.root
        while current.left:
            current = current.left
        return current.value
    
    def find_max(self):
        current = self.root
        while current.right:
            current = current.right
        return current.value

tree=BinarySearchTree()
tree.insert(6)
tree.insert(5)
tree.insert(4)
tree.insert(7)
tree.insert(9)
tree.insert(10)
tree.insert(2)
tree.display()
print(tree.height())
print(tree.find_max())
print(tree.find_min())
tree.binary_search_(4)
tree.binary_search_(10)
tree.binary_search_(2)
tree.binary_search_(1)
tree.binary_search_(33)
tree.binary_search_(9)


