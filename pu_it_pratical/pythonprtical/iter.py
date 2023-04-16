import itertools
iter = itertools.permutations(["a","b","c"])
print(list(iter))
#output  [('a', 'b', 'c'), ('a', 'c', 'b'), ('b', 'a', 'c'), ('b', 'c', 'a'), ('c', 'a', 'b'), ('c', 'b', 'a')]
iter=itertools.groupby(["Hemil","Hemil","raj","raj","raj","arj"])
print(list(iter))