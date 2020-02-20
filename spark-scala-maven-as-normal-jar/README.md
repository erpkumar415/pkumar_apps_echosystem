# Springs Scala SPARK Maven Rest API                                                             
Rest API Services project in scala for Springs boot, Maven, Spring Security

This sample application illustrates how to use Spring with scala and Spark 

# Usage
To build and Start the application.

#Go to Project folder for build              
mvn spring-boot:run

# Run and Access REST API                                                                                

# Go to Project folder                                                                    
java -jar target/jarfileName.jar                                                                                     

# Access REST API URL                                                 
###Please use credential root/root                                                                                                                  
http://localhost:8080/api/users


#####################################################################

----------spark-submit----CMD for Jar with scala maven-------
spark-submit --class com.pkumar.scala.spark.app.main.KumarSparkAppDemo --master local[*]  E:\developerWork\devSpark\SpringsBootScalaSparkApp\target\pkumar-scala-spark-demo-0.0.1-SNAPSHOT.jar
-----------------------------------------------------------------------

#################################################################################################################
----------------------------------------------------------------------------
spark-submit CMD  worked fine  for maven scala project :----
spark-submit --class com.pkumar.scala.spring.rest.KumarSparkAppDemo --master local[*]  E:\developerWork\devSpark\SpringsBootScalaSparkApp\target\pkumar-scala-spark-demo-0.0.1-SNAPSHOT.jar

----------------------------spark-submit-Result output-----------------------------------
E:\developerHome\spark-2.4.5-bin-hadoop2.7\bin>spark-submit --class com.pkumar.scala.spark.app.main.KumarSparkAppDemo --master local[*]  E:\developerWork\devSpark\SpringsBootScalaSparkApp\target\pkumar-scala-spark-demo-0.0.1-SNAPSHOT.jar
20/02/20 19:36:53 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
Pkumar Spark Scala My First APP
(created RDD using parallelize method sequence . Array Count :,26)
(RDD Value ARRAY ,9)
(RDD Value ARRAY ,77)
(RDD Value ARRAY ,33)
(RDD Value ARRAY ,44)
(RDD Value ARRAY ,56)
(RDD Value ARRAY ,78)
(RDD Value ARRAY ,23)
(RDD Value ARRAY ,45)
(RDD Value ARRAY ,6)
(RDD Value ARRAY ,7)
(RDD Value ARRAY ,77)
(RDD Value ARRAY ,9)
(RDD Value ARRAY ,77)
(RDD Value ARRAY ,33)
(RDD Value ARRAY ,44)
(RDD Value ARRAY ,56)
(RDD Value ARRAY ,78)
(RDD Value ARRAY ,23)
(RDD Value ARRAY ,45)
(RDD Value ARRAY ,6)
(RDD Value ARRAY ,7)
(RDD Value ARRAY ,77)
(RDD Value ARRAY ,45)
(RDD Value ARRAY ,6)
(RDD Value ARRAY ,7)
(RDD Value ARRAY ,77)
created RDD using textFile method -- rddUserData
(Row Count in users_data.csv  :,4)
(rddUserData first ,Rajeev Kumar Singh ?,rajeevs@example.com,-9999999908,India)
20/02/20 19:36:57 WARN SparkEnv: Exception while deleting Spark temp dir: C:\Users\pankaj.kumar5\AppData\Local\Temp\spark-ff4aabfc-a5e5-4ea4-b0d9-55961a8f91a3\userFiles-b7dbf947-de8d-42a2-81b1-b7e8e46dca5e
java.io.IOException: Failed to delete: C:\Users\<userId>\AppData\Local\Temp\spark-ff4aabfc-a5e5-4ea4-b0d9-55961a8f91a3\userFiles-b7dbf947-de8d-42a2-81b1-b7e8e46dca5e\pkumar-scala-spark-demo-0.0.1-SNAPSHOT.jar
        at org.apache.spark.network.util.JavaUtils.deleteRecursivelyUsingJavaIO(JavaUtils.java:144)
---------------------------Result output----END------------------------------------------------------------

#############################################################################################

