class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        nums1.sort()
        nums2.sort()

        val result: ArrayList<Int> = arrayListOf()

        var i = 0
        var j = 0

        while (true) {
            if (i >= nums1.size || j >= nums2.size) {
                break
            }

            if (nums1[i] == nums2[j]) {
                result.add(nums1[i])
                ++i
                ++j
            } else if (nums1[i] < nums2[j]) {
                ++i
            } else if (nums1[i] > nums2[j]) {
                ++j
            }
        }
        return result.toIntArray()
    }
}