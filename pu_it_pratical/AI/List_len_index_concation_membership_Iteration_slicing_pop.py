list_name = ['Hemil','Jay','Avadh',[5,6,8,9],'Tirth','Romit']
print('Nested list')
print(list_name)            #nested list
print('length of list')
print(len(list_name))   #printing length of list 

print(list_name)   #printing original list
list_name.pop(1)   #delete value at index 1 
print('after deleting value at index 1')
print(list_name)   #printing list after pop

list_items = ['raj','krish']
print('Concatenation of 2 list')
print(list_name+list_items)    #Concatenation of 2 list

print('Membership')
if "Tirth" in list_name:
  print("Yes, 'Tirth' is member the list") # printing the membership of the list

#Iteration
print('Iteration')
i = 0
while i < len(list_name):
  print(list_name[i])
  i = i + 1

#indexing
print('Indexing the list items')
print(list_name[3])

#Slicing
print('Slicing')
print(list_name[0:3])



