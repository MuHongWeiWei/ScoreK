package com.example.shop

class Score(s: String) {
    var value: Int = 0
    init {
        try {
            value = s.toInt()
            if (value < 0 || value > 100) {
                throw ScoreException()
            }
        } catch (e: NumberFormatException) {
            throw ScoreException()
        }
    }
}

fun main() {
    try {
        print("請輸入數學成績")
        val math = Score(readLine()!!)
        print("請輸入英文成績")
        val english = Score(readLine()!!)
        print((math.value + english.value) /2)
    } catch (e: ScoreException) {
        print(e.message)
    }
}