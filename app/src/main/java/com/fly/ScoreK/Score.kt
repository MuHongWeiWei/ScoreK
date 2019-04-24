package com.fly.ScoreK

class Score(s: String){
    var value: Int = 0
    init {
        try {
            value = s.toInt()
            if (value < 0 || value > 100) {
                throw ScoreException()
            }
        } catch (e: NumberFormatException) {
            throw ScoreFormatException()
        }
    }
}