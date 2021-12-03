class X:
    
    def print_text(self):
        self.var = 10
        print("This is parent class")

class Y(X):
    pass
x = X()
x.print_text()
print(x.var)