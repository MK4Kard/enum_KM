import kotlin.random.Random

fun main() {
    /*var dayOfWeek: Week = Week.Sunday
    println("Порядковый номер - ${dayOfWeek.num}")
    println("${dayOfWeek.Name()} - ${dayOfWeek.Stat()}")
    print("Погода - ")
    println(dayOfWeek.Weather())
    println("Повезёт ли?")
    println(dayOfWeek.Chance())*/
    /*println()
    var paint: Color = Color.YELLOW
    println("Краска: ${paint.Name()} - цвет")
    println("склад: ${paint.NumStore()}")
    print("объем - ")
    println("${paint.Volume()}")
    print("устойчивость - ")
    println("${paint.Stability()}")
    print("Общая стоимость: ")
    println("${paint.Sum()}")
    println()*/
    var product: Status = Status.Order
    println("Продукт - ${product.Name_st()}")
    println(product.Del_time())
    println(product.Price())
    product.State_pr()
    println("Состояние продукта: ${product.state}")
}
