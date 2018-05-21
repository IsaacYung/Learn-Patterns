package creation.singleton

object Window {
    init {
        println("Initializing with object: $this")
    }

    fun getInstance(): Window = this
}

fun main(args: Array<String>) {
    println("Start")
    val firstInstance = Window.getInstance()
    val secondInstance = Window.getInstance()

    println("first: $firstInstance")
    println("second: $secondInstance")
}