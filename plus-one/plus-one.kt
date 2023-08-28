class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val result = ArrayList<Int>()
        var carry = 1

        for (i in digits.size - 1 downTo 0) {
            val sum = digits[i] + carry
            result.add(sum % 10)
            carry = sum / 10
        }

        if (carry == 1) {
            result.add(carry)
        }

        return result.reversed().toIntArray()
    }
}