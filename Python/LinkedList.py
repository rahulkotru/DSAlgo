class Node:
    data=None
    next_node=None

    def __init__(self,data):
        self.data = data
        

    def __repr__(self):
        return"<Node data:%s>" %self.data


class LinkedList:

    def __init__(self):
        self.head = None

    def isEmpty(self):
        return self.head ==None

    def size(self):
        current=self.head
        count=0
        while current:
            count +=1
            current =current.next_node
        return count

    def print_traversal(self):
        if self.head is None:
            print("Linked List is Empty")
        else:
            n=self.head
            while n is not None:
                print(n.data,"-->",end=" ")
                n=n.next_node
