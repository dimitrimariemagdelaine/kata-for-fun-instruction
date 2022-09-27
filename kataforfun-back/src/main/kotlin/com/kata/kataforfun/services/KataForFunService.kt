package com.kata.kataforfun.services

import org.springframework.stereotype.Component

@Component
class KataForFunService {

    fun convertNumber(inputNumber: Int): String {
        val stringBuilder: StringBuilder = StringBuilder()

        stringBuilder.appendIf("Kata", inputNumber) { i -> i % 3 == 0 }
        stringBuilder.appendIf("For", inputNumber) { i -> i % 5 == 0 }

        for (caracter in inputNumber.toString()) {
            stringBuilder.appendIf("Kata", Character.getNumericValue(caracter)) { i -> i == 3 }
            stringBuilder.appendIf("For", Character.getNumericValue(caracter)) { i -> i == 5 }
            stringBuilder.appendIf("Fun", Character.getNumericValue(caracter)) { i -> i == 7 }
        }

        if(!stringBuilder.isNullOrEmpty()) {
            return stringBuilder.toString()
        }

        return inputNumber.toString()
    }

    fun StringBuilder.appendIf(appendValue: String, input: Int, predicate: (Int) -> Boolean): StringBuilder {
        if (predicate(input)) {
            return this.append(appendValue)
        }
        return this;
    }

}