import mysql.connector as connector


class DBHelper:
    def  __init__(self):
        self.con = connector.connect(host='localhost',
                                     port='3306',
                                     user='root',
                                     password='root',
                                     database='pythontest')
        query='create table if not exists demo(id  int primary_key,userName varchar(100), phone varchar(12), email varchar(100))'
        cur=self.con.cursor()
        cur.execute(query)
        print("created") 




# main code creating an object 

helper=DBHelper()

