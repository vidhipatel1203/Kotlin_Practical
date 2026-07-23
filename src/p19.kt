fun main(){

    val arrayList = arrayListOf(13, 14, 11, 12, 15)

    println("Displaying elements:")
    for (i in arrayList.indices) {
        println("a[$i]=${arrayList[i]}")
    }
    println()

    val max = arrayList.maxOrNull()
    println("Largest element =$max")
}