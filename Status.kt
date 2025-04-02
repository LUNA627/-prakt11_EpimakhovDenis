import kotlin.random.Random

// Enum класс для статусов заказа пиццы
enum class Status {

    RECEIVED {
        override fun description() = "Заказ принят, ожидает подтверждения"
    },
    PREPARING {
        override fun description() = "Пицца готовится"
    },
    BAKING {
        override fun description() = "Пицца в печи"
    },
    READY_FOR_DELIVERY {
        override fun description() = "Готова к выдаче"
    },
    CANCELLED {
        override fun description() = "Заказ отменён"
    };

    open fun description() = "Неизвестный статус"

        // Метод для обработки заказа
    open fun estimatedTime(): Int {
        return when {
            this == RECEIVED -> 5   // мин на подтверждение
            this == PREPARING -> 10 // мин на подготовку
            this == BAKING -> 15    // мин в печи
            this == READY_FOR_DELIVERY -> 1 // мин до выдачи
            else -> 0       // отмена
        }
    }
        // Метод для генерирования состояния еды
    open fun Marriage() {
        var rand = Random.nextInt(0, 4)
        when(rand) {
            0,1,2 -> println("Еда без брака")
            3 -> println("Еда испорчена")
        }
    }

        // Метод для генерации подарка от заведения
    open fun Gift() {
        var rand = Random.nextInt(0, 4)
        when(rand) {
            0,1 -> println("Вы получили подарок от заведения")
            2,3 -> println("Сегодня без подарка :(")
        }
    }

}