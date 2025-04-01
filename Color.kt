import kotlin.random.Random

enum class Color(var price: Int) {
    RED(50){
        override fun Name() = "Красный"
        override fun NumStore() = "151"
    },
    BLUE(45){
        override fun Name() = "Синий"
        override fun NumStore() = "56Б12"
    },
    GREEN(50){
        override fun Name() = "Зеленый"
        override fun NumStore() = "А45"
    },
    YELLOW(60){
        override fun Name() = "Желтый"
        override fun NumStore() = "А45"
    },
    BLACK(52){
        override fun Name() = "Черный"
        override fun NumStore() = "151"
    },
    WHITE(52){
        override fun Name() = "Белый"
        override fun NumStore() = "151"
    };

    var count = 0
    open fun Name() = "Красный, Синий, Зеленый, Желтый, Черный, Белый"
    open fun NumStore() = "151, А45, 56Б12"
    open var v = 5
    open fun Volume(){
        var rnd = Random.nextInt(5, 12)
        v = rnd
        println(v)
    }
    open fun Stability(){
        var rnd = Random.nextInt(0, 101)
        println(rnd)
    }
    open fun Sum(){
        if (count != 0) {
            var sum = price * v * count
            println(sum)
        }
    }
    open fun Count_paint(count: Int){
        var count_st = Random.nextInt(1, 51)
        if (count > count_st){
            println("На складе нет такого количества краски")
        }
        else {
            when {
                count % 100 in 11..14 -> println("Вы берёте ${count} банок")
                count % 10 == 1 -> println("Вы берёте ${count} банку")
                count % 10 in 2..4 -> println("Вы берёте ${count} банки")
                else -> println("Вы берёте ${count} банок")
            }
            this.count = count
        }
    }
}
