class Solution {
    fun plusOne(digits: IntArray): IntArray {

        val digitsList = ArrayList<Int>(digits.size)
        digits.forEach { digitsList.add(it) }

        var up = 1
        for (i in digits.size - 1 downTo 0 step 1) {
            if (digitsList[i] + up == 10) {
                digitsList[i] = 0
                up = 1
            } else {
                digitsList[i] += up
                up = 0
            }
            if (i == 0 && digitsList[i] == 0) {
                digitsList.add(0, 1)
            }
        }

        return digitsList.toIntArray()
    }
}