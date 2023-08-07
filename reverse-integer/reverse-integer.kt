import kotlin.math.abs
class Solution {
    fun reverse(x: Int): Int {
        return try {
            x.toString().let {
            if (x >= 0) it.reversed() else "-${it.substring(1).reversed()}"
            }.toInt()
        } catch (e: NumberFormatException) {
            0
        }
    }
}