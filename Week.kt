import kotlin.random.Random

enum class Week {
    Monday{
        override fun Name() = "Понедельник"
        override fun Stat() = "Рабочий день"
        override var num = "1"
    },
    Tuesday{
        override fun Name() = "Вторник"
        override fun Stat() = "Рабочий день"
        override var num = "2"
    },
    Wednesday{
        override fun Name() = "Среда"
        override fun Stat() = "Рабочий день"
        override var num = "3"
    },
    Thursday{
        override fun Name() = "Четверг"
        override fun Stat() = "Рабочий день"
        override var num = "4"
    },
    Friday{
        override fun Name() = "Пятница"
        override fun Stat() = "Рабочий день"
        override var num = "5"
    },
    Saturday{
        override fun Name() = "Суббота"
        override fun Stat() = "Выходной день"
        override var num = "6"
    },
    Sunday{
        override fun Name() = "Воскресенье"
        override fun Stat() = "Выходной день"
        override var num = "7"
    };

    open var num = "0"
    open fun Name() = "Понедельник, Вторник, Среда, Четверг, Пятница, Суббота, Воскресенье"
    open fun Stat() = "Рабочий день, Выходной день"
    open fun Chance(){
        var rnd = Random.nextInt(0, 6)
        when(rnd) {
            in 0..1 -> println("Да")
            in 2..5 -> println("Нет")
        }
    }
    open fun Weather(){
        var rnd = Random.nextInt(0, 6)
        when(rnd) {
            0 -> println("пасмурная")
            1 -> println("ясная")
            2 -> println("дождливая")
            3 -> println("теплая")
            4 -> println("ветренная")
            5 -> println("солнечная")
        }
    }
}
