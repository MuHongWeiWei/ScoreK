package com.fly.ScoreK

import java.lang.Exception

class ScoreException : Exception() {
    override val message: String?
        get() = "分數不能小於0或大於100"
}