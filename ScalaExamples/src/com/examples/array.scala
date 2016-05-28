package com.examples

import scala.collection.mutable.ArrayBuffer


class array {
  def main(args: Array[String]) {
    val favNums = new Array[Int](20)
    val friends = Array("Bob","Tom")
    friends(0) = "Sue"
    
    val friends2 = ArrayBuffer[String]()
    friends2.insert(0,"as")
    friends2 += "Mark"
    friends2 ++= Array("Susy","Paul")
    
    friends2.remove(2,3)
    
    var friend : String = " "
    for (friend <- friends2)
        println(friend)
    
  
  }
  
  
}