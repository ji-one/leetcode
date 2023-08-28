class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val digitsList = ArrayList<Int>(digits.size)
        digits.forEach { digitsList.add(it) }

        var up = 0
        if (digitsList.last() + 1 == 10) {
            up = 1
            digitsList[digitsList.size - 1] = 0
            if (digits.size == 1) {
                digitsList.add(0, 1)
            }
        } else {
            digitsList[digitsList.size - 1] += 1
        }

        for (i in digits.size - 2 downTo 0 step 1) {
            if (digitsList[i] + up == 10) {
                val tmp = (digitsList[i] + up)
                digitsList[i] = tmp % 10
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