
import mysql.connector

cnx = mysql.connector.connect(user='root', password='mysql',
                              host='localhost',
                              database='hemil')
cursor = cnx.cursor()


name = str(input("Enter your first name:"))
surname = str(input("Enter your last name:"))
username = str(input("Enter your username:"))
dateofbirth = str(input("Enter your date of birth(yy-mm-dd):"))
password = str(input("Enter your password:"))
iquery = 'insert into login values('
end = ');'
cs = '","'
ics = '"'
query = (iquery+ics+name+cs+surname+cs+username+cs+dateofbirth+cs+password+ics+end)
print(query)
cursor.execute(query);
query2 = ("SELECT * FROM LOGIN;")
cursor.execute(query2)
print("Updated table is :")
for x in cursor:
 print(x)
cnx.commit()
cursor.close()
cnx.close()