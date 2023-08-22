class Solution {
    fun isPalindrome(s: String): Boolean {
        val text = s.filter { c -> c.isLetter() || c.isDigit() }.toLowerCase()
        return text == text.reversed()
    }
}