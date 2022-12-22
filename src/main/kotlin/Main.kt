fun main(args: Array<String>) = args.joinToString("\n").let(::interpret).let(::println)

fun interpret(code: String) = code.mapNotNull {
    when (it) {
        'H' -> hello()
        'Q' -> code
        '9' -> beers(99)
        '+' -> accumulate().let { null }
        else -> null
    }
}.joinToString("\n")
