class BinaryTree:
    def __init__(self):
        self.root = None

    class Node:
        def __init__(self, value):
            self.value = value
            self.left = None
            self.right = None

    def populate(self):
        value = int(input("Enter the value for root Node:"))
        self.root = self.Node(value)
        self.populate_helper(self.root)

    def populate_helper(self, node):
        left = input(f"Enter the left value for {node.value}:")
        if left!="none":
            node.left = self.Node(left)
            self.populate_helper(node.left)

        right = input(f"Enter the right value for {node.value}:")
        if right !="none":
            node.right = self.Node(right)
            self.populate_helper(node.right)

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

    def in_order_traversal(self):
        result = []
        self._in_order_recursive(self.root, result)
        print("IN ORDER TRAVERSAL")
        print(result) 
    
    def _in_order_recursive(self, current_node, result):
        if current_node:
            self._in_order_recursive(current_node.left, result)
            result.append(current_node.value)
            self._in_order_recursive(current_node.right, result)


    def pre_order_traversal(self):
        result = []
        self._pre_order_recursive(self.root, result)
        print("PRE ORDER TRAVERSAL")
        print(result) 
    
    def _pre_order_recursive(self, current_node, result):
        if current_node:
            result.append(current_node.value)
            self._pre_order_recursive(current_node.left, result)
            self._pre_order_recursive(current_node.right, result)


    def post_order_traversal(self):
        result = []
        self._post_order_recursive(self.root, result)
        print("POST ORDER TRAVERSAL")
        print(result) 
    
    def _post_order_recursive(self, current_node, result):
        if current_node:
            self._post_order_recursive(current_node.left, result)
            self._post_order_recursive(current_node.right, result)
            result.append(current_node.value)
        
    def level_order_traversal(self):
        result = []
        root=self.root
        self.level_order_traversal_(root, result)
        print("LEVEL ORDER TRAVERSAL")
        print(result) 

    def level_order_traversal_(self,root,result):
        if root is None:
            return
        
        queue = [root]  

        while queue:
            node = queue.pop(0) 

            result.append(node.value)  

            if node.left:
                queue.append(node.left)
            if node.right:
                queue.append(node.right)

        return result

    # def find_min_max(self):
    #     return self.find_min_max_rec(self.root)
    
  
    # def find_min_max_rec(self, root):
    #     if root is None:
    #         return float('inf'), float('-inf')

    #     left_min, left_max = self.find_min_max_rec(root.left)
    #     right_min, right_max = self.find_min_max_rec(root.right)

    #     min_val = min(root.value, left_min, right_min)
    #     max_val = max(root.value, left_max, right_max)

    #     return min_val, max_val




# Example usage:
if __name__ == "__main__":
    tree = BinaryTree()
    tree.populate()
    tree.display()
    tree.in_order_traversal()
    tree.post_order_traversal()
    tree.pre_order_traversal()
    tree.level_order_traversal()
