package com.examples

object string {
  def main(args: Array[String]) {
    var randSent = "I saw a dragon fly by"
    println("at index:" + randSent(3))
    println("string length:" + randSent.length())
    println(randSent.concat(" and explode"))
    println("Are strings are equal: " + "I saw dragon".equals(randSent))
    println("dragon start at : " +randSent.indexOf("dragon"))
    val randSentArray = randSent.toArray
    
    for (v <- randSentArray) 
      println(v);
    
  }
  
  
}