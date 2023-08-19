class Solution {
    fun singleNumber(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]

        nums.sort()
        var result = 0
        var i = 0
        while (i < nums.size) {
            if (i == nums.size - 1 || nums[i] != nums[i + 1]) {
                result = nums[i]
                break
            }
            i += 2
        }
        return result
    }
}