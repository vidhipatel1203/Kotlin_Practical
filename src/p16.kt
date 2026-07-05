fun main(){
    println("Enter First Number:")
    val num1=readln().toInt()

    println("Enter Second Number:")
    val num2=readln().toInt()

    println("Addition of "+num1+", "+num2+" is "+add(num1,num2))
    println("Subtraction of "+num1+", "+num2+" is "+sub(num1,num2))
    println("Multiplication of "+num1+", "+num2+" is "+mul(num1,num2))
    println("Division of "+num1+", "+num2+" is "+div(num1,num2))

}

fun add(num1:Int,num2:Int):Int{
    return num1+num2
}

fun sub(num1:Int,num2:Int):Int{
    return num1-num2
}

fun mul(num1:Int,num2:Int):Int{
    return num1*num2
}

fun div(num1:Int,num2:Int):Int{
    return num1/num2
}