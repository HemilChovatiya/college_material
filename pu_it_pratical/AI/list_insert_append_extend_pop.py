list_items=['Hemil', 'Jay', 'Avadh', [5, 6, 8, 9], 'Tirth', 'Romit']
print(list_items)
#insert
print('insert ronak in list')
list_items.insert(1,'ronak')
print(list_items)

#append
print('append list')
list_items_object = ['table','furniture']
list_items.append(list_items_object)
print(list_items)

#extend
print('Extend list')
list_items_object = ['table','furniture']
list_items.extend(list_items_object)
print(list_items)

#pop delete item in list
print('delete item in list')
list_items.pop(5)
print(list_items)