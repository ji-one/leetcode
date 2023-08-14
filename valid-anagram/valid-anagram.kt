class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val charCountMap = mutableMapOf<Char, Int>()

        if (s.length != t.length) return false

        for (i in s.indices) {
            charCountMap[s[i]] = charCountMap.getOrDefault(s[i], 0) + 1
            charCountMap[t[i]] = charCountMap.getOrDefault(t[i], 0) - 1
        }

        return charCountMap.all { it.value == 0 }
    }
}