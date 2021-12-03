class community:    
  def __init__(myself, name, year):  #Here I mentioned myself rather than self  
    myself.name = name    
    myself.year = year    
    
  def myfunc(myself):    
    print("Hello World")           
    
p1 = community("C# corner",2019)    
p1.myfunc()  
print("Wellcome to ", p1.name, + p1.year) #Accessing object variables 