fun main() {
    fun describeString(maybeString: String?): String {
        if (!maybeString.isNullOrEmpty()) {
            return "String length ${maybeString.length}"
        }else {
            return "Empty or null string"
        }
    }

    println(describeString(null))
    println(describeString("MyString is not empty"))
}