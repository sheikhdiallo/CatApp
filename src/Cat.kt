class Cat (private val name: String, private var age: Int, var weight: Int) {

     fun walk(distance: Int) : Boolean {
         if (weight - distance >= 5) {
             weight -= distance
             return true
         }
         return false
     }

     override fun toString() : String {
        return "Name: %name, age: $age, weight: %weight"


    }
    fun eat(food: Int) : Boolean{
        if (food + weight <= 20) {
            weight += food
            return true
        }
        return false

    }
}

