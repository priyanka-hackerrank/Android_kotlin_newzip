package com.hackerrank.android

object PrimeUtils {
    fun isPrime(n: Int): Boolean {
        val m = n / 2
        var flag = 0
        if (n < 2) {
            return false
        } else {
            for (i in 2..m) {
                if (n % i == 0) {
                    flag = 1
                    break
                }
            }
        }
        return if (flag == 0) true else false
    }
}