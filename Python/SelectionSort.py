#Sorting based on comparison
list1=[56,3,2,78,6,0]

for i in range(len(list1)-1):
    min_val=max(list1[i:])
    min_ind=list1.index(min_val)
    list1[i],list1[min_ind]=list1[min_ind],list1[i]
    print(list1)


#With user input
num=int(input("Enter the number:\n"))
list2=[input("Enter number: ") for x in range(num)]
print("unsorted list:", list2)

for i in range(len(list2)-1):
    m_ind=i
    for j in range(i+1,len(list2)):
        if list2[j]<list2[m_ind]:
            min_ind=j
        
    if list2[i]!=list2[min_ind]:
        list2[i],list2[m_ind]=list2[m_ind],list2[i]
        print(list2)

print(list2)


