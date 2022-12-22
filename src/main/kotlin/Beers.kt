private fun bottles(n: Int) = when (n) {
    0 -> "No bottles"
    1 -> "1 bottle"
    else -> "$n bottles"
}

private fun beer(n: Int) = "${bottles(n)} of beer"

private fun verse(n: Int) =
    listOf("${beer(n)} on the wall", beer(n), "Take one down and pass it around", "${beer(n - 1)} on the wall")
        .joinToString("\n")

fun beers(amount: Int = 99) = (1..amount).reversed().joinToString("\n\n", postfix = "\n", transform = ::verse)
