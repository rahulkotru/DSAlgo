#Queue using List
Q=[]
Q.append(9)
Q.append(8)
Q.append(3)
Q
Q.pop(0)
Q.pop(0)
Q.pop(0)
Q.pop(0)
Q
#Queue using Modules
import collections
qu=collections.deque()
qu.appendleft(19)
qu.appendleft(8)
qu
qu.pop()
#Queue using queue
import queue
q=queue.Queue()
q.put(10)
q.put(9)
q.get()