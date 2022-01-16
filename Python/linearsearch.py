def linear_search(list,target):
    for i in range(0,len(list)):
        if(list[i])==target:
            return i
        return None

def verify(index):
    if index is not None:
        print("Target not found ",index)
    else:
        print("Target found")

numbers=[1,2,3,4,5,6,7]
result=linear_search(numbers,4)
verify(result)
