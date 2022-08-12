package com.example.test1

class Tax {
    fun calculateTex(grossIncome:Double,textRate:Double): Double {
        return grossIncome * textRate
    }
    fun calculateIncome(grossIncome:Double,textRate:Double):Double{
        return grossIncome - (grossIncome * textRate)
    }
}