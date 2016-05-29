package com.examples.collections

object ListCollection {
  def main(args: Array[String]) {
    
    listInitialization
    //listConcatenation
    //listFunctions
    
    def listInitialization() {
      val nums1: List[Int] = List(1, 2, 3, 4)
      val nums2: List[Int]  = 5 :: 6 :: List()
      
      nums1.foreach { x => println(x) }
      nums2.foreach { x => println(x) }
    }
    
    def listConcatenation() {
      val nums1: List[Int] = List(1, 2, 3, 4)
      val nums2: List[Int]  = 5 :: 6 :: List()
      
      val nums3 = nums1 ::: nums2
      val nums4 = List.concat(nums1,nums2)
      
      nums1.foreach { x => println(x) }
      nums2.foreach { x => println(x) }
      nums3.foreach { x => println(x) }
      nums4.foreach { x => println(x) }
      
    } 
    
    def listFunctions() {
      val nums1: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
      
      
      // get list except first 2 elements
      val exceptFirst2Ones = nums1.drop(2);
      
      // get list first 2 elements
      val first2Ones = nums1.take(2);
      
      // get list last 2 elements
      val last2Ones = nums1.takeRight(2);
      
      // get list elements that are filtered with specified boolean logic
      val filteredList = nums1.filter { x => x > 2 }
      val filteredList1 = nums1.filter { _ < 5 }
      
    }
    
    
  }
}