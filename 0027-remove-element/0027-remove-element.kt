class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int      {
        nums.indices.filter { nums[it] === `val` }
        .forEach { nums[it] = -1 }
        nums.sortDescending()
        
        return nums.count { it !== -1 }
        
    }
}