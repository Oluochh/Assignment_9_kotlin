fun main(){
    println(indices(listOf("Kenya","Bamburi","Gauteng","Safaricom","vescon","pineapple","Hospital","johannesburg","Shawarma","Rwanda")))
    println(people(listOf(3,5,6,7,4)))
    var persons= mutableListOf<Person>(Person("Austin",23,6.3,96.5),
        Person("Miriam",20,5.3,83.01),
        Person("Gilly",27,6.0,100.9))
    (person(persons))
    individuals()
    var cars= mutableListOf<Car>(Car("KCB 00E",20916),Car("KAA 01C",35265))
    carLists(cars)
}
fun indices(names:List<String>):List<String>{
    var x= mutableListOf<String>()
    for (name in names){
        if (names.indexOf(name)%2==0){
            x.add(name)
        }
    }
    return x
}

data class Heights(var total:Int,var average:Double)
fun people(heights:List<Int>):Heights{
    var totalHeight=heights.sum()
    var averageHeight=heights.average()
    var both=Heights(totalHeight, averageHeight)
    return both
}

data class Person(var name:String,var age:Int,var height:Double,var weight:Double )
fun person(people:MutableList<Person>){
    var sortedByAge=people.sortedByDescending { people->people.age }
    println(sortedByAge)
}

data class People(var name:String,var age:Int,var height:Double,var weight:Double )
fun individuals(){
    var person1= mutableListOf<People>(People("Athman",56,5.8,56.5),
        People("patience",3,2.4,18.4))
    person1.addAll(mutableListOf(People("prudence",10,3.4,23.3),
        People("Qassim",67,5.0,78.3)))
    println(person1)
}

data class Car(var registration:String,var mileage:Int)

fun carLists(cars:List<Car>):Int{
    var totalMileage=0
    for (car in cars){
        totalMileage+=car.mileage
    }
    return totalMileage
}
