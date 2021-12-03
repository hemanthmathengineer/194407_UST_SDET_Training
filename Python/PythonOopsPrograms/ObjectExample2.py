class employee:  
    salutation="Wellcome All"   #class instance attribute  
      
    def __init__(self):    
        self.Name = 'Kokila'      
        self.Id = 101      
    def display(self):          #class instance method  
        print("Employee Name: %s \nId: %d" %(self.Name, self.Id))      
Emp=employee()                    
print(Emp.salutation)           #call instance attribute  
Emp.display()