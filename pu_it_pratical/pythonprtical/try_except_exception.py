#eg 1
a=int(input("Enter a Value : "))
b=int(input("Enter b Value : "))
try:
      div=a/b
      c = [21, 22, 23, 20]
      stu_name = int(input("Enter Index : "))
      print(c[stu_name])
except ZeroDivisionError:   # Inbuilt error
    print("Division by 0 is not possible")
except IndexError:
     print("Enter Index between 0-3")
except NameError:

except TypeError:

except ValueError:
    print("Oops!  That was no valid number.  Try again...")
else:       print(div)
finally:    print("This is the end of the program")


