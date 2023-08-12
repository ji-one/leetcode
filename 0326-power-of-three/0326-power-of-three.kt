import kotlin.math.*

class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        return (log10(n.toDouble()) / log10(3.0)) % 1 == 0.0
    }
}