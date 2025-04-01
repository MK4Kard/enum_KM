import kotlin.random.Random

enum class Color(var price: Int) {
    RED(500){
       override fun Name() = "Красный"
        override fun NumStore() = "151"
       },
    BLUE(450){
        override fun Name() = "Синий"
    override fun NumStore() = "56Б12"
             },
    GREEN(500){
        override fun Name() = "Зеленый"
    override fun NumStore() = "А45"
              },
    YELLOW(600){
        override fun Name() = "Желтый"
    override fun NumStore() = "А45"
               },
    BLACK(520){
        override fun Name() = "Черный"
        override fun NumStore() = "151"
              },
    WHITE(525){
        override fun Name() = "Белый"
        override fun NumStore() = "151"
    };

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
        var sum = price * v
        println(sum)
    }
}