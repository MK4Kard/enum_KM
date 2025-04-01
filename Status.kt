import kotlin.random.Random

enum class Status(var state: String) {
    In_Stock("неизвестно"){
            override fun Name_st() = "В наличии"
            },
    Out_of_Stock("неизвестно"){
        override fun Name_st() = "Нет в наличии"
        override fun Del_time(){
            var day = Random.nextInt(1,32)
            var hour = Random.nextInt(0, 24)
            var minute = Random.nextInt(0, 60)
            println("Появление заказа: ${day} ${hour}:${minute}")
        }
                },
    Order("неизвестно"){
        override fun Name_st() = "Заказан"
         },
    Expected("неизвестно"){
        override fun Name_st() = "Ожидается"
        override fun Del_time(){
            println("Заказ уже идёт")
        }
    },
    Ready("неизвестно"){
        override fun Name_st() = "Пришёл"
        override fun Del_time(){
            println("")
        }
    };

    open fun Name_st() = "В наличии"
    open fun Del_time() {
        var day = Random.nextInt(1,32)
        var hour = Random.nextInt(0, 24)
        var minute = Random.nextInt(0, 60)
        println("Дата и время доставки: ${day} ${hour}:${minute}")
    }
    open fun Price() {
        var price = Random.nextInt(100, 10001)
        println("Цена: ${price}")
    }
    open fun State_pr() {
        var st = Random.nextInt(0, 3)
        when(st){
            0 -> state = "В порядке"
            1 -> state = "С небольшими повреждениями"
            2 -> state = "В плохом состоянии"
        }
    }
}