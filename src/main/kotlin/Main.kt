fun printMessage(message: String): Unit {
    println(message)
}

fun multiply(number1: Int, number2: Int): Int {
    return number1 * number2
}

fun sum(number1: Int, number2: Int) = number1 + number2 // return immediately

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}


fun main(args: Array<String>) {
    println("What's your name?")
    val name = readln()
    println("Hello $name")

    printMessage("My message custom")
    multiply(10, 7)
    sum(19, 27)
    printMessageWithPrefix("My message", "Hello")
    printMessageWithPrefix(prefix = "Nice", message = "auto")
}