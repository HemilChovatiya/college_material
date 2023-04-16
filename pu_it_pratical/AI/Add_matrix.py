R = int(input("Enter Matrix rows:"))
C = int(input("Enter  Matrix columns:"))
matrix1 = []                                                    # Initialize matrix
# For user input
for i in range(R):          # A for loop for row entries
    a1 =[]
    for j in range(C):      # A for loop for column entries
         print("Enter Matrix1 Number:",i,j)
         a1.append(int(input()))
    matrix1.append(a1)
matrix2 = []			# Initialize matrix
# For user input
for i in range(R):          # A for loop for row entries
    a2 =[]
    for j in range(C):      # A for loop for column entries
         print("Enter Matrix2 Number:",i,j)
         a2.append(int(input()))
    matrix2.append(a2)    
print("Addition of 2 Matrix ",R,"*",C)	# For printing the matrix
for i in range(R):
    for j in range(C):
        print(matrix1[i][j]+matrix2[i][j], end = " ")
    print()
