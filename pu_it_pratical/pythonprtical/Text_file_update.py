a=open("python.txt","w")
a.write("This is the  first instruction")
a.write("here, we created python file..")
print(a.tell())
print(a.seek(0))
a.write("what")
a=open("python.txt","r")
print(a.read())

