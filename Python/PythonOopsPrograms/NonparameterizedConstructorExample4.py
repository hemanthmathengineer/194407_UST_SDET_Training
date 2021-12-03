#Nonparameterized constructor, we cannot pass any arguments by its parameter.
 
#It's also known as a simple default constructor and has only one argument that is a reference to the instance being constructed.
class Csharpcorner:  
    community=""  
    def __init__(self):  #constructor declared without any arguments
        self.community="Welcome to C# corner"  
  
    def display(self):  
        print(self.community)  
obj=Csharpcorner()       #Constructor automatically execute by the object creation
obj.display() 

#Here, we declared a class named Csharpcorner and the constructor. The constructor doesn't contain any passing arguments. When we execute the “obj=Csharpcorner” statement, the default constructor will execute.