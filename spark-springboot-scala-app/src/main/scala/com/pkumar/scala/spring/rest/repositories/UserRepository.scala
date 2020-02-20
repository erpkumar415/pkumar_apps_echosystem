package com.pkumar.scala.spring.rest.repositories

import org.springframework.stereotype.Repository
import com.pkumar.scala.spring.rest.entity.Users
import org.springframework.data.repository.CrudRepository
import java.lang.Long

@Repository
trait UserRepository extends CrudRepository[Users, Long] {

  def findUserByUsername(username: String): Users

}

