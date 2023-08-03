fun main() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(10 * "Times")
    println(10 * "Other ")

    operator fun String.get(range: IntRange) = substring(range)
    val hello = "Hello my friend, are you ok?"
    println(hello[0..10])
}