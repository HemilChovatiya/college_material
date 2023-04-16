# A basic code for matrix input from user
R = int(input("Enter Matrix rows:"))
C = int(input("Enter  Matrix columns:"))
# Initialize matrix
matrix = []
transpose = []
# For user input
for i in range(R):          # A for loop for row entries
    a =[]
    for j in range(C):      # A for loop for column entries
         print("Enter Matrix Number:",i,j)
         a.append(int(input()))
    matrix.append(a)
    transpose.append(a)
transpose = [[0 for i in range(R)] for j in range(C)]
# Initialize matrix
for i in range(R):
  for j in range(C):
   transpose[j][i] = matrix[i][j]   
# For printing the matrix
print("transpose")
for i in range(R):
    for j in range(C):
        print(transpose[i][j], end = " ")
    print()
