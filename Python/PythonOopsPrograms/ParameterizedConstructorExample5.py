# we can initialize an object with some values while declaring. In python, the first argument considers as a reference to the instance known as the “self” keyword.


class fruits:  
    total=0  
    def __init__(self,fno,fname,fcolor):  #Constructor declared with number of arguments
        self.fno=fno  
        self.fname=fname  
        self.fcolor=fcolor  
        fruits.total+=1  
    def displaytotal(self):  
        print("No:",self.fno,"Fruite Name:",self.fname,",Fruite color:",self.fcolor)  
    def displayfruit(self):  
        print("No:",self.fno,"Fruite Name:",self.fname,",Fruite color:",self.fcolor)  
f1=fruits(1,"Apple","Red") 
f2=fruits(2,"lemon","Yellow")  
f1.displaytotal()    
f2.displayfruit()    
print("Total Number of Fruites %d" % fruits.total)