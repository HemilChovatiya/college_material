def calculation(a):
    def addition(b):
        return a+b
    return addition
value=calculation(21)
print(value(23))



