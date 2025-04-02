import kotlin.random.Random

// Enum класс для дней недели
enum class Week {

    Monday{
        override fun Name() = "Понедельник"
        override fun Str() = "Рабочий день"
        override var number = "1"
    },
    Tuesday{
        override fun Name() = "Вторник"
        override fun Str() = "Рабочий день"
        override var number = "2"
    },


    Wednesday{
        override fun Name() = "Среда"
        override fun Str() = "Рабочий день"
        override var number = "3"

    },

    Thursday{
        override fun Name() = "Четверг"
        override fun Str() = "Рабочий день"
        override var number = "4"

    },

    Friday{
        override fun Name() = "Пятница"
        override fun Str() = "Рабочий день"
        override var number = "5"

    },

    Saturday{
        override fun Name() = "Суббота"
        override fun Str() = "Выходной день"
        override var number = "6"
    },

    Sunday{
        override fun Name() = "Воскресенье"
        override fun Str() = "Выходной день"
        override var number = "7"

    };

        //Метод для хранения дней недели на русском
    open fun Name() = "Понедельник, Вторник, Среда, Четверг, Пятница, Суббота, Воскресенье"

    //Метод для хранения Рабочий/Выходной день
    open fun Str() = "Рабочий День, Выходной день"
    open var number = "0"

        //Метод для генерации скидок
    open fun Discount() {
        var rand = Random.nextInt(0, 6)
        when(rand) {
            1,3,4,5 -> println("Есть скидки")
            0,2 -> println("Скидок нет")
        }
    }

         //Метод для генерации погоды
    open fun Weather() {
        var rand = Random.nextInt(0, 3)
        when(rand) {
            0 -> println("Погода пасмурная")
            1 -> println("Погода облачная")
            2 -> println("Погода солнечная")
        }
    }

}