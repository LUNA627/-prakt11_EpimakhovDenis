fun main() {
    // Демонстрация работы enum Week
    val sunday  = Week.Sunday
    println (sunday.Name())
    println("Порядковый номер - ${sunday.number}")
    println(sunday.Str())
    println(sunday.Discount())
    println(sunday.Weather())

    println("------")
    // Демонстрация работы enum Colors с красным цветом
    val red = Colors.Red
    println ("Цвет - ${red.Name()}")
    println("Тип цвета - ${red.WarmoOrCold()}")
    println("Микс цвета с ${Colors.Blue} - ${red.MixColor(Colors.Blue)}")
    println(red.RainbowNum())

    println("---")
// Демонстрация работы enum Colors с синим цветом
    val blue = Colors.Blue
    println ("Цвет - ${blue.Name()}")
    println("Тип цвета - ${blue.WarmoOrCold()}")
    println("Микс цвета с ${Colors.Yellow} - ${blue.MixColor(Colors.Yellow)}")
    println(blue.RainbowNum())

    println("---")
    // Демонстрация работы enum Colors с желтым цветом
    val yellow = Colors.Yellow
    println ("Цвет - ${yellow.Name()}")
    println("Тип цвета - ${yellow.WarmoOrCold()}")
    println("Микс цвета с ${Colors.Red} - ${yellow.MixColor(Colors.Red)}")
    println(yellow.RainbowNum())

    println("------")
    // Демонстрация работы enum Status
    var status = Status.RECEIVED
    println(status.description())
    println("${status.estimatedTime()} минут для подтверждения")
    println("---")
    status = Status.PREPARING
    println(status.description())
    println("${status.estimatedTime()} минут на готовку")
    println("---")
    status = Status.BAKING
    println(status.description())
    println("${status.estimatedTime()} минут в печи")
    println("---")
    status = Status.READY_FOR_DELIVERY
    println(status.description())
    println("${status.estimatedTime()} минут до выдачи")
    println("---")
    status = Status.CANCELLED
    println(status.description())
    println("доставка отменена")
    println("---")
    println(status.Marriage())
    println(status.Gift())
}