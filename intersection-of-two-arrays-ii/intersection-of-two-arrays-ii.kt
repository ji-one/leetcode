class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        nums1.sort()
        nums2.sort()

        val result = mutableListOf<Int>()

        var i = 0
        var j = 0

        while (i < nums1.size && j < nums2.size) {
            when {
                nums1[i] == nums2[j] -> {
                    result.add(nums1[i])
                    i++
                    j++
                }
                nums1[i] < nums2[j] -> i++
                else -> j++
            }
        }
        return result.toIntArray()
    }
}