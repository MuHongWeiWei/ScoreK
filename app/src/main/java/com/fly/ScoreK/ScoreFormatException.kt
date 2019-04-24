package com.fly.ScoreK

import java.lang.Exception

class ScoreFormatException: Exception() {
    override val message: String?
        get() = "輸入格式錯誤"
}