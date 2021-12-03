class dog:   
    name='Dommy'  
    age='4'  
    def show(self):   
        print (self.name)  
        print (self.age)   
d1 = dog()   
# Use getattr instead of d1.name   
print (getattr(d1,'name'))  
    
# returns true if object has attribute   
print (hasattr(d1,'name'))   
    
# sets an  attribute    
setattr(d1,'height',152)   
    
# returns the value of attribute name height   
print (getattr(d1,'height'))  
    
# delete the attribute   
delattr(dog,'age')