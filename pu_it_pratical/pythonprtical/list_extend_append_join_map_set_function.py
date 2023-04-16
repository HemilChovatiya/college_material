a = [1, 2, 3,4]
b = [5, 6, 7]
a.extend(b)
print(a)   #output [1, 2, 3, 4, 5, 6, 7]
a.append(b)
print(a)    #output [1, 2, 3, 4, 5, 6, 7, [5, 6, 7]]
print(list(set([1,2,3,4,3,4,5,6]))) #output [1, 2, 3, 4, 5, 6]

a = ['c', 'o', 'r', 'o', 'n', 'a', 'v', 'i', 'r', 'u', 's']

V = str(input())
N = int(input())
x = ""

for i in range(0, N):
    print(i)
    b = ""
    x = ""
    b = str(input())

    p = 0
    l = 0
    l = len(b)

    while(b[p] in a):
        x = 'POSITIVE'
        if p < (l - 1):
            p = p + 1
            x = 'NEGATIVE'

    print(x)


