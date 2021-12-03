class Animal:
    
    def animal_details(self):
        self.name = "Animal"
        self.category = "Mammal"
        self.age = 0
    
    def show_animal_details(self):
        print("The name of parent class is ", self.name)

class Cat(Animal):
    
    def cat_details(self):
        self.number_of_paws = 4
        print("A cat has", self.number_of_paws , "pawns")
        
cat = Cat()
cat.animal_details()
cat.show_animal_details()
print(cat.category)
print(cat.age)
cat.cat_details()
        
class Butterfly(Animal):
    
    def butterfly_details(self):
        self.number_of_wings = 8
        print("A butterfly has", self.number_of_wings, "wings")
butterfly = Butterfly()
butterfly.animal_details()
butterfly.show_animal_details()
print(butterfly.category)
print(butterfly.age)
butterfly.butterfly_details()

class Fish(Animal):
    def fish_details(self):
        self.number_of_fins = 4
        print("A fish has", self.number_of_fins, "fins")

fish = Fish()
fish.animal_details()
fish.show_animal_details()
print(fish.category)
print(fish.age)
fish.fish_details()