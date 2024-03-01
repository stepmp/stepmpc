fun plusOne(digits: IntArray): IntArray {
    val n = digits.size
    for (i in n - 1 downTo 0) {
        if (digits[i] < 9) {
            digits[i]++
            return digits
        } else {
            digits[i] = 0
        }
    }
    // If all digits overflowed, add '1' at the beginning
    val result = IntArray(n + 1)
    result[0] = 1
    return result
}

fun main() {
    val originalNum = intArrayOf(1, 2, 9) // For example, if the number is 129
    val result = plusOne(originalNum)
    println(result.contentToString()) // Output should be [1, 3, 0] since 129 + 1 = 130
}