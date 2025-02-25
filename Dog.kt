class Dog (
    var name: String,
    var breed: String,
    var color: String,
    var weight: Double,
    var height: Double
){
    fun displayInfo() {
        println("Кличка: $name")
        println("Порода: $breed")
        println("Окрас: $color")
        println("Вес: $weight кг")
        println("Рост: $height см")
    }
    fun updateInfo(newName: String, newBreed: String, newColor: String, newWeight: Double, newHeight: Double) {
        name = newName
        breed = newBreed
        color = newColor
        weight = newWeight
        height = newHeight
        println("Информация о собаке обновлена!")
    }
}
fun addDog(): Dog {
    println("Введите кличку собаки:")
    val name = readLine()!!.toString()
    println("Введите породу собаки:")
    val breed = readLine()!!.toString()
    println("Введите окрас собаки:")
    val color = readLine()!!.toString()
    println("Введите вес собаки (кг):")
    val weight = readLine()!!.toDouble()
    println("Введите рост собаки (см):")
    val height = readLine()!!.toDouble()
    return Dog(name, breed, color, weight, height)
}