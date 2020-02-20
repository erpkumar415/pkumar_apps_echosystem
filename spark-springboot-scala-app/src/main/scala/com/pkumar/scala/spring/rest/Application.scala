package com.pkumar.scala.spring.rest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import java.io.File

@SpringBootApplication
class Application

object Application extends App {
	SpringApplication.run(classOf[Application]);

	println("Pkumar Spark Scala My First APP")

	val sparkConf = new SparkConf()
	sparkConf.setAppName("Pkumar Spark Scala My First APP")
	sparkConf.setMaster("local") 

	val sc = new SparkContext(sparkConf)
	val dataArr=Array(9,77,33,44,56,78,23,45,6,7,77,9,77,33,44,56,78,23,45,6,7,77)
	//1. created RDD using parallelize method sequence
	val dataRdd= sc.parallelize(dataArr, 2)

	println("created RDD using parallelize method sequence . Array Count :",dataRdd.count())
	dataRdd.foreach(f=>println("RDD Value ARRAY ",f))


	//2. created RDD using textFile method sequence
	val csvDataUser="E:/developerWork/devSpark/externalResources/users_data.csv"
	val rddUserData= sc.textFile(csvDataUser, 3)

	println("created RDD using textFile method -- rddUserData")
	println("Row Count in users_data.csv  :",rddUserData.count())
	println("rddUserData first ",rddUserData.first())
	rddUserData.first()

}



