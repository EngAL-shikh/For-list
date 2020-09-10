fun main() {

    val iterator = ('a'..'c').iterator()

    for ((index, value) in iterator.withIndex()) {
        println("The element at $index is $value")
    }
}
