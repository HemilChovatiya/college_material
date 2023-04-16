even = {'null',2, 4, 6, 8};
odd = {'null',3, 5, 7};
def Union(even,odd):
    print("Union of even and odd is",even | odd)            # set union
def Intersection(even,odd):
    print("Intersection of even and odd is",even & odd)      # set intersection
def Difference(even,odd):
    print("Difference of even and odd is",even - odd)         # set difference
def Symmetric(even,odd):
    print("Symmetric difference of even and odd is",even ^ odd) # set symmetric difference
Union(even,odd)
Intersection(even,odd)
Difference(even,odd)
Symmetric(even,odd)