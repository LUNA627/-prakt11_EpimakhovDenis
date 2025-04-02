// Enum класс для цветов
enum class Colors {

    Yellow{
        override fun Name() = "Желтый"
    },

    Red{
        override fun Name() = "Красный"
    },

    Blue {
        override fun Name() = "Синий"
    };

        //Метод для хранения цветов на русском
    open fun Name() = "Желтый, Красный, Синий"

        //Метод для смешивания цветов
    open fun MixColor(other: Colors) : String {
        return when {
            this == Yellow && other == Blue -> "Зеленый"
            this == Blue && other == Yellow -> "Зеленый"
            this == Red && other == Yellow -> "Оранжевый"
            this == Yellow && other == Red -> "Оранжевый"
            this == Red && other == Blue -> "Фиолетовый"
            this == Blue && other == Red -> "Фиолетовый"
            else -> "Неизвестный смешанный цвет"
        }
    }

        //Метод для определения теплого/холодного цвета
    open fun WarmoOrCold() : String {
        return when {
            this == Yellow || this == Red -> "Теплый"
            this == Blue -> "Холодный"
            else -> "Неизвестный тип цвета"
        }
    }

        //Метод для определения позицию цвета в радуге
    open fun RainbowNum() : String {
        return when {
            this == Yellow -> "Желтый цвет по счету в радуге третий"
            this == Blue -> "Синий цвет по счету в радуге шестой"
            this == Red -> "Красный цвет по счету в радуге первый"
            else -> "некорректный цвет"
        }
    }
  }