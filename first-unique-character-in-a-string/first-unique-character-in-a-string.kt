class Solution {
    fun firstUniqChar(s: String): Int {
        var tmp = Array(26) { 0 }

        for (i in s.indices) {
            tmp[s[i] - 'a'] += 1
        }

        val uniqueChar = s.toSet().filter { tmp[it - 'a'] == 1 }
        
        return if (uniqueChar.isEmpty()) -1
        else s.indexOfFirst { it == uniqueChar[0] }
    }
}