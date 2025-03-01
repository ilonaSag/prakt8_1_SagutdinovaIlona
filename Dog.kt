class Dog (
    var name: String,
    var breed: String,
    var color: String,
    var weight: Double,
    var height: Double,
    var haract: String,
){
    fun displayInfo() {
        println("Кличка: $name")
        println("Порода: $breed")
        println("Окрас: $color")
        println("Вес: $weight кг")
        println("Рост: $height см")
        println("Характер: $haract")
    }
    fun updateInfo(newName: String, newBreed: String, newColor: String, newWeight: Double, newHeight: Double, newHaract: String) {
        name = newName
        breed = newBreed
        color = newColor
        weight = newWeight
        height = newHeight
        val n = readLine()!!.toInt()
        haract = when (n){
            1 -> "Дружелюбный"
            2 -> "Агрессивный"
            3 -> "Спокойный"
            4 -> "Активный"
            5-> "Умная"
            else -> "Неверный ввод"
        }
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
    var weight: Double
    while (true) {
        println("Введите вес собаки (кг):")
        val weightInput = readLine()!!.toDouble()
        if (weightInput != null && weightInput > 0 && weightInput < 170 && weightInput >1) {
            weight = weightInput
                break
        } else {
            println("Вес должен быть положительным, не равняться нулю и иметь реальные размеры")
        }
    }
    var height: Double
    while (true) {
        println("Введите рост собаки (см):")
        val heightInput = readLine()!!.toDouble()
        if (heightInput != null && heightInput > 0 && heightInput <=110 && heightInput >=10) {
            height = heightInput
            break
        } else {
            println("Рост должен быть положительным, не равняться нулю и иметь реальные размеры")
        }
    }
    println("Выберите характер собаки:")
    println("1. Дружелюбный")
    println("2. Агрессивный")
    println("3. Спокойный")
    println("4. Активный")
    println("5. Умная")
    val n = readLine()!!.toInt()

    val harac = when (n){
        1 -> "Дружелюбный"
        2 -> "Агрессивный"
        3 -> "Спокойный"
        4 -> "Активный"
        5-> "Умная"
        else -> "Неверный ввод"
    }
    var haract: String
    haract = harac
    return Dog(name, breed, color, weight, height, haract)
}
