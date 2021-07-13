fun main(){
    val squareCabin = SquareCabin(6)

    with(squareCabin){
        println("\nSquare Cabin\n===========")
        println("Building materials= $buildingMaterial")
        println("Capacity= $capacity")
        println("Has any room? ${hasRoom()}")
    }

}

    abstract class Dwelling(private var residents: Int) {
        abstract val buildingMaterial: String
        abstract val capacity: Int

        fun hasRoom(): Boolean {
            return residents < capacity
        }

    }

    class SquareCabin(residents: Int): Dwelling(residents){
        override val buildingMaterial = "Wood"
        override val capacity = 6
    }
