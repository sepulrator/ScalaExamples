package com.examples

object functions {
  def main(args: Array[String]) {
    def getSum(num1 : Int = 1,num2 : Int) : Int = {
      /*return optional, if it is not implemented scala return executed last line of function*/ 
       num1 + num2;
    }
    println("3 + 5 :" + getSum(3,5)) 
    println("3 + 5 :" + getSum(num2=3,num1=5))
    
    
    //---------------------
    def sayHi() : Unit = {
      println("Hi")
    }
    
    sayHi
    
    //-----------------------
    
    def getSum2(args: Int*) : Int = {
       var sum : Int = 0
       for (num <- args)
         sum += num 
       sum
       
    }
    println(getSum2(2,3,5))
    
    //------------------------
    
    def factorial(num: BigInt) : BigInt = {
       if (num <= 1)
         1
       else
         num * factorial(num-1)
    }
    
    println("Factorial of 4 = " + factorial(4))
    
    //------------------------
    
  }
  
  
  
}