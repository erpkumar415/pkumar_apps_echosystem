package com.pkumar.scala.spark.app.entity

import scala.beans.BeanProperty
import java.util.Set
import java.io.Serializable

class Users extends Serializable {

  var id: Long = _

  @BeanProperty
  var username: String = _

  @BeanProperty
  var password: String = _

  @BeanProperty
  var enabled: Boolean = _

}