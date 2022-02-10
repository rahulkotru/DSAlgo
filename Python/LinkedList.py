from os import link
from tkinter import N


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
    def add_beginning(self,data):
        new_node=Node(data)
        new_node.next_node=self.head
        self.head=new_node
    def add_end(self,data):
        new_node=Node(data)
        if self.head is None:
            self.head=new_node
        else:
            n-self.head
            while n.next_node is not None:
                n=n.next_node
                n.next_node=new_node
    def add_after(self,data):
        n=self.head
        while n is not None:
            if x==n.data:
                break
            n=n.next_node
            if n is None:
                print("Node is not present in Linked List") 
            else:
                new_node=Node(data)
                new_node.next_node=n.next_node
                n.next_node=new_node


Link=LinkedList()
Link.add_end(4)
Link.print_traversal()