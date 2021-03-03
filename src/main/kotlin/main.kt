package  ru.netology
fun main() {

    val likesSeveral = 10
    val likes = 1004
    val likesMax = likes%likesSeveral
    val result = when (likesMax) {
        0, 5, 6, 7, 8, 9 -> "лайков"
        1 -> "лайк"
        2, 3, 4 -> "лайка"
        else -> "error"
    }

    println ("$likes $result")
}

