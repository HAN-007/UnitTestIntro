package com.example.test1

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TestText {
    private lateinit var tax : Tax
    @Before
    fun setup(){
        tax = Tax()
    }
    @After
    fun teardown(){

    }
    @Test
    fun calculateTexTest(){
        val netTax = tax.calculateTex(100.0,0.1)
        assertThat(netTax).isEqualTo(10)

    }
    @Test
    fun calculateIncomeTest(){
        val netIncome = tax.calculateIncome(100.0,0.1)
        assertThat(netIncome).isEqualTo(10)
    }

}