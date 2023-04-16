
import mysql.connector

cnx = mysql.connector.connect(user='root', password='mysql',
                              host='localhost',
                              database='hemil')
cursor = cnx.cursor()
query = ("SELECT * from sale;")
cursor.execute(query)

for x in cursor:
  print(x)

cursor.close()
cnx.close()