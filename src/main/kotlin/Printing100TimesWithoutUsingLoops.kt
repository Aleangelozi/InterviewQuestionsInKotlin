fun main() {

    val n = 1

    //print100TimesWithoutLoopOrRecursion()
    print100TimesRecursively(n)

}

// Source code: https://www.youtube.com/watch?v=YgA3XXNkx0k
fun print100TimesWithoutLoopOrRecursion() {
    val a = "SKM"
    var b = "i"

    b = b.replace("i", "iiiiiiiiii")
    b = b.replace("i", "iiiiiiiiii")
    b = b.replace("i", a + "\n")
    println(b)
}

// Source code: https://www.youtube.com/watch?v=X1u1TdFSqwc
fun print100TimesRecursively(num: Int) {
    if (num <= 100) {
        print("$num ")
        print100TimesRecursively(num + 1)
    }
}