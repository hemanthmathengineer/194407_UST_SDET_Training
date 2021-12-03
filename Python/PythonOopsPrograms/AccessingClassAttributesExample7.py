class dog:     
    name='Dommy'  #Class attribute 1  
    age='4'       #Class attribute 2  
    count=0       #Class atrribute 3  
          
    def show(self):     
        self.name    
        self.age  
        dog.count+=1  
d1 = dog()  
d1.show()  
d1.show()  
print("The Dog name is:",d1.name)   #Accessing class attribute name  
print("The Dog Age is:",d1.age)     #Accessing class attributes age  
print("Count:",d1.count)            #Accessing class attribute count