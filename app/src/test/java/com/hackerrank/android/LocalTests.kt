package com.hackerrank.android

import com.hackerrank.android.PrimeUtils.isPrime
import org.junit.Assert
import org.junit.Test

class LocalTests {
    @Test
    fun testPrime() {
        Assert.assertTrue(isPrime(13))
    }

    @Test
    fun testNotPrime() {
        Assert.assertFalse(isPrime(65))
    }

    @Test
    fun testNotPrime1() {
        Assert.assertFalse(isPrime(1))
    }

    @Test
    fun testNotPrime0() {
        Assert.assertFalse(isPrime(0))
    }

    @Test
    fun testNotPrimeNeg() {
        Assert.assertFalse(isPrime(-5))
    }
}