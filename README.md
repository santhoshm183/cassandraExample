# cassandraExample
overview 

 Example - connect Cassandra with Spring boot rest.

This Example demostrate how to connect to cassandra with spring boot rest api.

1. we need to install cassandra
2. start cassandra 
	go to :E:\santhosh Doc\software\apache-cassandra-3.11.6\bin
	cmd: casssandra.bat
3. to open cqlsh
	go to : E:\santhosh Doc\software\apache-cassandra-3.11.6\bin
	cmd : cqlsh.bat
4. to see all the namespace 
	cmd: cqlsh> DESCRIBE keyspaces;
5. to use namespace 
	cmd: cqlsh> use collage;
	     cqlsh:collage>
6. cqlsh:collage> select * from Courses;

 id   | name
------+------------------
 MA04 | cassandra-dev-04
 MA03 |   cassandra-tool
 MA01 |    cassandra-dev
 MA02 |    cassandra-sql



To test 
open browser : http://localhost:8081/course/getCourse/MA04

out put : {"id":"MA04","name":"cassandra-dev-04"}
