package com.examples
import scala.io._
import scala.math._
import java.math._

object basics {
   def main(args: Array[String]) {
     val msg = "Hello world"
     msg.toLowerCase()
     msg.toUpperCase()
     msg.contains("c")
     //Boolean i = msg.equals("a")
     
     var msgvar = "hello"
     
     println(msg)
     println(msgvar)
     println(max(3, 5))
     greet
     greet()
     
     
   }
   
   def greet() = println("""|Welcome to Ultamix 3000. |Type "HELP" for help.""")
   
   def max(x: Int, y: Int): Int = {
     if (x > y) x
     else y
     
   }
   
   def loops() {
     var capital = Map("US" -> "Washington", "France" -> "Paris")
     capital += ("Japan" -> "Tokyo")
     
     var i = 0
     while (i < 20) {
        println(i)
        i += 1
     }
     
     i = 0 
     do {  
       i += 1
        
     } while (i != 15)
     
     i = 0
     for ( i <- 1 to 10 )
       println(i)
       
     val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
     for ( i <- 1 until randLetters.length())
       println(randLetters(i))
     
     val aList = List(1,2,3,4,5)
     for ( i <- aList) 
       println("List items " + i)
    
       
     var evenList = for { i <-1 to 20 if (i % 2) == 0 } yield i
     for ( i <- evenList ) 
         println(i)
     
     for ( i <- 1 to 5; j <- 6 to 10)
         println("i" + i + " j:" + j)
       
       
       
   }
   
   
   class MyClass(index: Int, name: String)
  
}