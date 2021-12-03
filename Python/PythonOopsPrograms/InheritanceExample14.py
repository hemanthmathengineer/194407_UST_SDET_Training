#Accessing parent class constructors from child classes

class Animal:
    
    def __init__(self, name, category, age):
        self.name = name
        self.category = category
        self.age = age
    
    def show_animal_details(self):
        print("The name of animal is ", self.name)
        print("The category of animal is ", self.category)
        print("The age of animal is ", self.age)
class Cat(Animal):
    
    def __init__(self, name, category, age, paws):
        super().__init__(name, category, age)
        self.number_of_paws = paws
        print("A cat has", self.number_of_paws , "paws")
        
class Butterfly(Animal):
    
    def __init__(self, name, category, age, paws):
        super().__init__(name, category, age)
        self.number_of_wings = paws
        print("A butterfly has", self.number_of_wings, "wings")
        
class Fish(Animal):
    
    def __init__(self, name, category, age, paws):
        super().__init__(name, category, age)
        self.number_of_fins = paws
        print("A fish has", self.number_of_fins, "fins")
cat = Cat("cat","mammal",5, 4)
cat.show_animal_details()
fish = Fish("fish","bony_fish", 10, 4)
fish.show_animal_details()
butterfly = Butterfly("butterfly","insect", 10, 4)
butterfly.show_animal_details()