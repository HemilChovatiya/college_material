def div(a,b):
    print(a/b)
def mul(a,b):
    print(a*b)
def add(a,b):
    print(a+b)
def sub(a,b):
    print(a-b)
def power(a,b):
    print(a^b)
operation=0
while operation < 6:
 print("1.div 2.mul 3.add 4.sub 5.power 6.exit")
 operation = int(input("Enter Operation No: "))
 first_no = int(input("Input 1st no : "))
 second_no = int(input("Input 2nd no : "))
 if operation == 1:
     div(first_no, second_no)
 elif operation == 2:
      mul(first_no, second_no)
 elif operation == 3:
      add(first_no, second_no)
 elif operation == 4:
      sub(first_no, second_no)      
 elif operation == 5:
      power(first_no, second_no)  