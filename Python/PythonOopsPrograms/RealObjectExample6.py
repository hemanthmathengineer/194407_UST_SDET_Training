class calculation:              #Class declaration  
      
    def __init__(self,a,b):  
        self.a=a  
        self.b=b  
  
    def Add(self):  
        print(self.a+self.b)  
    def Divide(self):  
        print(self.a/self.b)  
c1=calculation(10,20)           #Declare object c1  
c2=calculation(100,50)          #Declare object c2  
c1.Add()                        #Call our Instance method Add  
c2.Divide()                     #Call our instance method Divide 