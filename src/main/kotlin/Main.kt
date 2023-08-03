fun printMessage(message: String): Unit {
    println(message)
}

fun multiply(number1: Int, number2: Int): Int {
    return number1 * number2
}

fun sum(number1: Int, number2: Int) = number1 + number2

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}


fun main(args: Array<String>) {
    println("What's your name?")
    val name = readln()
    println("Hello $name")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}