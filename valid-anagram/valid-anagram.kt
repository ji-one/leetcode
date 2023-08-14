class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sCharCount = Array(26) { 0 }
        val tCharCount = Array(26) { 0 }

        if (s.length != t.length) return false

        for (i in s.indices) {
            sCharCount[s[i] - 'a'] += 1
            tCharCount[t[i] - 'a'] += 1
        }

        for (i in 0 until 26) {
            if (sCharCount[i] != tCharCount[i])
                return false
        }
        
        return true
    }
}