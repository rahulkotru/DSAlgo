# Simple sorting algorithm which compares n elements in list
list1=[]
num=int(input("Length of array: "))
for k in range(num):
    list1.append(int(input()))

print("Unsorted array: ",list1)

for j in range(len(list1)-1,0,-1):
    for i in range(j):
        if list1[i]>list1[i+1]:
            list1[i],list1[i+1]=list1[i+1],list1[i]
            print(list1)
        else:
            print(list1)
        print()
print("Sorted List: ",list1)