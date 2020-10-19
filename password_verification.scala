package com.FirstProgramme
import scala.util.control.Breaks._

object password_verification {
  def main(args: Array[String]): Unit = {
    var ATTEMPTS = 5
    while (ATTEMPTS > 0) {
      println("enter the password:")
      var pwd: String = scala.io.StdIn.readLine()
      println("-------------------------------------------")
      breakable {
        if (pwd.toUpperCase == "ADMIN@123") {
          println("login successful")
          println("-------------------------------------------")
          break
        }
        else {
          println("login fail")
          ATTEMPTS = ATTEMPTS - 1
          println("-------------------------------------------")
          println("number of attempts remaining: " + ATTEMPTS)
          println("-------------------------------------------")
        }
      }
    }
  }
}



