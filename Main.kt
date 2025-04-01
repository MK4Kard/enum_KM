fun main() {
    try {
        var dayOfWeek: Week = Week.Sunday
        println("Порядковый номер - ${dayOfWeek.num}")
        println("${dayOfWeek.Name()} - ${dayOfWeek.Stat()}")
        print("Погода - ")
        println(dayOfWeek.Weather())
        println("Повезёт ли?")
        dayOfWeek.Chance()
        println()
        var paint: Color = Color.YELLOW
        println("Краска: ${paint.Name()} - цвет")
        println("склад: ${paint.NumStore()}")
        print("объем - ")
        println("${paint.Volume()}")
        print("устойчивость - ")
        println("${paint.Stability()}")
        println("Количество на складе: ${paint.count_st}")
        println("Сколько банок возьмёте?")
        val count = readln()!!.toInt()
        paint.Count_paint(count)
        print("Общая стоимость: ")
        paint.Sum()
        println()
        var product: Status = Status.Order
        println("Продукт - ${product.Name_st()}")
        println(product.Del_time())
        product.Price()
        product.State_pr()
        println("Состояние продукта: ${product.state}")
        println("Сколько у вас денег")
        val pay = readln()!!.toInt()
        println("Как заплатите: 1 - вся сумма; 2 - долями")
        val way = readln()!!.toInt()
        var share = 0
        if (way == 2) {
            println("На сколько разделить платёж")
            share = readln()!!.toInt()
        }
        product.Payment(way, pay, share)
    } catch (e:Exception){
        println("неверный ввод")
    }
}
