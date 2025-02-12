fun main() {
    println("Hello World!")
    greetSeaCreatures();
    println("${findPearl(6)}")
    println("${divideTreasure(1000.0,5)}")
//    println(trainees)

}
val greetSeaCreatures = { println("Hello, Deep Sea Adventurer!") }

val findPearl = {pearl: Int -> pearl * pearl}

val divideTreasure: (Double, Int) -> Double = {totalTreasure, explorers ->
    //to understand return in lambda
    if (totalTreasure<0){
        0.0
    }
    else {
        totalTreasure / explorers
    }
}
//val trainees = arrayListOf("aziz","aziz");