#Fastest sorting algorithm
def pivot_place(list1,first,last):
    pivot=list1[first]
    left=first+1
    right=last
    while True:
        while left<=right and list1[left]<=pivot:
            left=left+1
        while left<=right and list1[right]>=pivot:
            right=right-1
            if right<left:
                break
            else:
                list1[left],list1[right]=list1[right],list1[left]
        list1[first],list1[right]=list1[right],list1[first]
        return right