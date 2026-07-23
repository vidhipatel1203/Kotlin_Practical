fun main() {

   val A1 = arrayOf(10, 90, 60, 80, 100)
   println("Create Array-1 by using arrayOf() method:")
   println(A1.joinToString())
   val A2 = Array<Int>(5) { 0 }
   println("Create Array-2 by using Array<>():")
   println(A2.joinToString())
   val A3 = Array<Int>(8) { i -> i }
   println("Create Array-3 by using Array<>() and lambda function:")
   println(A3.joinToString())
   val A4 = IntArray(5)
   println("Create Array-4 by using IntArray():")
   println(A4.joinToString())
   val A5 = intArrayOf(12, 10, 1, 5, 18, 19)
   println("Create Array-5 by using intArrayOf():")
   println(A5.joinToString())
   val A6 = arrayOf(
      intArrayOf(1, 3),
      intArrayOf(4, 5),
      intArrayOf(6, 7)
   )
   println("Create 2D Array-6 by using arrayOf() and intArrayOf():")
   println(A6.contentDeepToString())
   val arr = arrayOf(56, 23, 49, 12, 2)
   println("Entered Array: ${arr.joinToString()}")


   val builtInSorted = arr.sortedArray()
   println("After sorting by built-in function: ${builtInSorted.joinToString()}")


   val manualArr = arr.copyOf()
   for (i in manualArr.indices) {
      for (j in 0 until manualArr.size - i - 1) {
         if (manualArr[j] > manualArr[j + 1]) {
            val temp = manualArr[j]
            manualArr[j] = manualArr[j + 1]
            manualArr[j + 1] = temp
         }
      }
   }
   println("After sorting without built-in function: ${manualArr.joinToString()}")
}
