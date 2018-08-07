
a=[]
length=int(input("no of elements"))
def insert():
    global length
    for i in range(0,length):
        element=int(input(" "))
        a.append(element)

def sort():
    global length
    for j in range(0,length):
        key=j
        while key>0 and a[key]<a[key-1]:
            temp=a[key+1]
            a[key+1]=a[key]
            a[key]=temp
            key=key-1
    
        
def display():
    global length
    for i in range(0,length):
        print(a[i])


insert()
sort()
display()

            
        
