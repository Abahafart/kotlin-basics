fun main() {
    fun printAll(vararg messages: String) {
        for (message in messages) println(message)
    }

    printAll("one", "two", "three")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (message in  messages) println(prefix + message)
    }

    printAllWithPrefix("one", "two","three", prefix = "Hi ")

    fun log(vararg messages: String) {
        printAll(*messages) // At runtime, a vararg is just an array. To pass it along into a vararg parameter, use the
    // special spread operator * that lets you pass in *entries (a vararg of String) instead of entries (an Array<String>)
    }

    log("One", "Mind", "Two")
}