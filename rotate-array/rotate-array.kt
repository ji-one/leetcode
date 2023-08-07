class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val count = k % nums.size
        val temp = nums.copyOf()

        for (i in nums.indices) {
            nums[(i + count) % nums.size] = temp[i]
        }
    }
}