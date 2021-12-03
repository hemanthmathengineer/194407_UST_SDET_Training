#__dict__ :To holding the class namespace
#__doc__: To give the class documentation string or None, if #ff0000
#__name__ :It gives the class name
#__module__ :Itprovide module name in which the class is defined
#__bases__ : To give the bases of the class

class collors:  
    'This is a sample class called collors'  
    collorCount=0  
    def __int__(self,red,yellow):  
        self.red = red  
        self.yellow = yellow  
        collorCount+=1  
    def displayCount(self):  
        print("Tottal collorCount %d" %collors.collorCount)  
    def displayfruit(self):  
        print("Red:", self.red, "Yellow:",self.yellow)  
  
print("collors.__doc__:",collors.__doc__)  
print("Collos.__name__:", collors.__name__)  
print("collors.__module__:", collors.__module__)  
print("collors.__bases__:", collors.__bases__)  
print("collors.__dict__:", collors.__dict__) 