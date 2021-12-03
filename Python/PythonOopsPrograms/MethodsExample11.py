class Student:      
    # Constructor special method      
    def __init__(self, name):      
        print("This is constructor")      
        self.name = name  
    # method  
    def show(self):      
        print("Hello",self.name)      
student = Student("C# corner")  
#calling the method  
student.show()  