package com.pkumar.scala.spark.app.config


class WebSecurityConfig(val configureParam: String) {

  def configure() = {
    println("WebSecurityConfig...",configureParam)
  }


}