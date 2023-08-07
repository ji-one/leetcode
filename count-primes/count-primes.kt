import kotlin.math.sqrt

class Solution {
    fun countPrimes(n: Int): Int {
        val isPrime = BooleanArray(n+1) { true }
    
        isPrime[0] = false
        if (n > 0) {
            isPrime[1] = false
        }
        
        for (i in 2..sqrt(n.toDouble()).toInt()) {
            if (isPrime[i]) {
                for (j in i * i..n step i) {
                    isPrime[j] = false
                }
            }   
        }
        
        return (2..n-1).count { isPrime[it] }
    }
}