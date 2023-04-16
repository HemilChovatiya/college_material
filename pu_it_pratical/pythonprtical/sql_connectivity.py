
import mysql.connector

cnx = mysql.connector.connect(user='system', password='mysql',
                              host='localhost')
cursor = cnx.cursor()
query = ("SELECT * from deposit;")
cursor.execute(query)

for x in cursor:
  print(x)

cursor.close()
cnx.close()