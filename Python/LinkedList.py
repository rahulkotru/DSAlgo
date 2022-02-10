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
            print("Null")
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
    def add_after(self,data,x):
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
    def add_before(self,data,x):
        if self.head==None:
            print("Empty list")
            return
        if self.head.data==x:
            new_node=Node(data)
            new_node.next_node=self.head
            self.head=new_node
            return
        n=self.head
        while n.next_node is not None:
            if n.next_node.data==x:
                break
            n=n.next_node
        if n.next_node is None:
            print("Node not found")
        else:
            new_node=Node(data)
            new_node.next_node=n.next_node
            n.next_node=new_node




Link=LinkedList()
Link.add_end(4)
Link.add_beginning(8)
Link.add_after(5,4)
Link.add_before(9,5)
Link.print_traversal()