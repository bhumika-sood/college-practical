a=[]
length=int(input("no of elements"))
def insert():
    global length
    for i in range(0,length):
        element=int(input(" "))
        a.append(element)

def search():
    global length
    j=0
    element=int(input(" element to search"))
    while(j<length):
        if(element==a[j]):
            print("element found %d" % (a[j]) )
            break
        else:
            j=j+1
    print("value not found") 
    
        
def display():
    global length
    for i in range(0,length):
        print(a[i])


insert()
search()
display()

            
