package com.kata.kataforfun.services

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KataForFunServiceTest {
    val service = KataForFunService();

    @Test
    fun when_1_expect_1() {
        assertEquals("1", service.convertNumber(1))
    }

    @Test
    fun when_3_expect_KataKata() {
        assertEquals("KataKata", service.convertNumber(3))
    }

    @Test
    fun when_5_expect_ForFor() {
        assertEquals("ForFor", service.convertNumber(5))
    }

    @Test
    fun when_7_expect_Fun() {
        assertEquals("Fun", service.convertNumber(7))
    }

    @Test
    fun when_9_expect_Kata() {
       assertEquals("Kata", service.convertNumber(9))
    }

    @Test
    fun when_51_expect_KataFor() {
        assertEquals("KataFor", service.convertNumber(51))
    }

    @Test
    fun when_53_expect_ForKata() {
        assertEquals("ForKata", service.convertNumber(53))
    }

    @Test
    fun when_33_expect_KataKataKata() {
        assertEquals("KataKataKata", service.convertNumber(33))
    }

    @Test
    fun when_27_expect_KataFun() {
        assertEquals("KataFun", service.convertNumber(27))
    }

    @Test
    fun when_15_expect_KataForFor() {
        assertEquals("KataForFor", service.convertNumber(15))
    }
}