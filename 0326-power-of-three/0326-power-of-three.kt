import kotlin.math.*

class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        return (Math.log10(n.toDouble()) / Math.log10(3.0)) % 1 == 0.0
    }
}