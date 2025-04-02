
import kotlin.random.Random


enum class Week {

    Monday{
        override fun Name() = "Понедельник"
        override fun Str() = "Рабочий день"
        override var number = "1"
        override var discount = "25% скидка на товары для дома в ВБ"
    },
    Tuesday{
        override fun Name() = "Вторник"
        override fun Str() = "Рабочий день"
        override var number = "2"
        override var discount = "40% скидка на товары для спорта в ОЗОН"
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


    open fun Name() = "Понедельник, Вторник, Среда, Четверг, Пятница, Суббота, Воскресенье"
    open fun Str() = "Рабочий День, Выходной день"
    open var number = "0"
    open var discount = ""

    open fun Discount() {
        var rand = Random.nextInt(0, 6)
        when(rand) {
            1,3,4,5 -> println("Есть скидки")
            0,2 -> println("Скидок нет")
        }
    }

    open fun Discount() {
        var rand = Random.nextInt(0, 7)
        when(rand) {
            0 -> println("День пасмурный")
            1 -> println("День облачный")
            2 -> println()
        }
    }

}