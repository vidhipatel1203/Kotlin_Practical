fun main(){

    println("Creating Car Class Object car1 in next line")

    val c1=Car("BMW",2018,100000.0,"Tirth",105)
    c1.displayCarInformation()

    println()

    println("Creating Car Class Object car2 in next line")

    val c2=Car("BMW",2019,400000.0,"Rudra",20)
    c2.displayCarInformation()

    println()

    println("****** ArrayList of Car ************")

    val a1=arrayListOf<Car>()

    val c3=Car("Toyota",2017,1080000.0,"Dev",100)
    a1.add(c3)

    val c4=Car("Maruti",2020,4000000.0,"Tirth",200)
    a1.add(c4)

    for(i in a1)
    {
        i.displayCarInformation()
    }
}


open class Car(var type:String){

    var model:Int=0
    var price:Double=0.0
    var owner:String=""
    var miles:Int=0

    init
    {
        println("Object of class is created and Init is called.")
        println("----------")
    }

    constructor(t:String,m:Int,p:Double,o:String,mi:Int):this(t)
    {
        model=m
        price=p
        owner=o
        miles=mi
    }

    fun getCarInformation():String
    {
        return type+", "+model
    }

    fun getOriginalCarPrice():Double
    {
        return price
    }

    fun getCurrentCarPrice():Double
    {
        return price-(miles*10)
    }

    fun displayCarInformation()
    {
        println("Car Information: "+getCarInformation())
        println("Car Owner: "+owner)
        println("Miles Drive: "+miles)
        println("Original Car Price: "+getOriginalCarPrice())
        println("Current Car Price: "+getCurrentCarPrice())
        println("----------")
    }
}