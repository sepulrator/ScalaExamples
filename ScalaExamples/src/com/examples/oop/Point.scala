package com.examples.oop

import java.io._

class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
   override def toString(): String = "(" + x + ", " + y + ")";
   
   override def equals(other: Any) = other match { 
      case that: Point => this.x == that.x && this.y == that.y 
      case _ => false 
   }
   
}

object Test {
   def main(args: Array[String]) {
      val pt1 = new Point(10, 20);
      val pt2 = new Point(15, 40);
      println(pt1.equals(pt2))
      pt1.move(5, 20);
      println(pt1.equals(pt2))
      
   }
}
  
  
