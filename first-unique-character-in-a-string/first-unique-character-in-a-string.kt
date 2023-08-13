class Solution {
    fun firstUniqChar(s: String): Int {
        val charCountMap = mutableMapOf<Char, Int>()

        for (char in s) {
            charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
        }

        val uniqueChar = charCountMap.entries.filter { it.value == 1 }.map { it.key }
        return if (uniqueChar.isEmpty()) -1
        else s.indexOfFirst { it == uniqueChar[0] }
    }
}