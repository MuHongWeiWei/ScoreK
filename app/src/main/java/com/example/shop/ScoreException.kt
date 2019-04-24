package com.example.shop

import java.lang.Exception

class ScoreException: Exception() {
    override val message: String?
        get() = "輸入格式錯誤"
}