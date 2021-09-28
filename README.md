### Setting up the environment
* Open MySQL 
  * Create new connection and db (optionally) 
  * Open and execute create_employee_table.sql file from sql package
* In application_context.xml file setting up bean dataSource
  * Line 34 position 54-63: change host 
  * Line 34 position 64-68: change port
  * Line 35 and 36: change value of name and password
* In resources package change line 3 by your path to log file 
* Run application with Tomcat 9.0.52
