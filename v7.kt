fun main() {
    try {
        var dog: Dog? = null
        while (true) {
            println("Выберите действие:")
            println("1. Добавить собаку")
            println("2. Показать информацию о собаке")
            println("3. Обновить информацию о собаке")
            println("4. Удалить собаку")
            println("5. Выйти")
            val n = readLine()!!.toInt()
            when (n) {
                1 -> {
                    dog = addDog()
                    println("Собака добавлена!")
                }

                2 -> {
                    if (dog != null) {
                        println("Информация о собаке:")
                        dog.displayInfo()
                    } else {
                        println("Собака не добавлена.")
                    }
                }
                3 -> {
                    if (dog != null) {
                        println("Введите новую кличку собаки:")
                        val newName = readLine()!!.toString()
                        println("Введите новую породу собаки:")
                        val newBreed = readLine()!!.toString()
                        println("Введите новый окрас собаки:")
                        val newColor = readLine()!!.toString()
                        println("Введите новый вес собаки (кг):")
                        val newWeight = readLine()!!.toDouble()
                        println("Введите новый рост собаки (см):")
                        val newHeight = readLine()!!.toDouble()
                        println("Выберите характер собаки:")
                        println("1. Дружелюбный")
                        println("2. Агрессивный")
                        println("3. Спокойный")
                        println("4. Активный")
                        println("5. Умная")
                        val newHaract = ""
                        dog.updateInfo(newName, newBreed, newColor, newWeight, newHeight, newHaract)
                    } else {
                        println("Собака не добавлена.")
                    }
                }

                4 -> {
                    if (dog != null) {
                        dog = null
                        println("Собака удалена!")
                    }
                    else
                    {
                        println("Чтобы удалить собаку, ее надо добавить.")
                    }
                }

                5 -> {
                    println("Выход из программы.")
                    return
                }

                else -> println("Неверный ввод. Попробуйте снова.")
            }
        }
    }
    catch (e:Exception)
    {
        println("Неверный ввод")
    }
}
