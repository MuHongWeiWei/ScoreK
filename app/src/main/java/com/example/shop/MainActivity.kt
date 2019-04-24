package com.example.shop

import android.annotation.SuppressLint
import android.content.Context
import android.inputmethodservice.InputMethodService
import android.inputmethodservice.Keyboard
import android.inputmethodservice.KeyboardView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("ServiceCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        average.setOnClickListener {
            try {
                val math = Score(math.text.toString().trim())
                val english = Score(english.text.toString().trim())
                result.text = ((math.value + english.value) / 2).toString()
                val ims = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                ims.hideSoftInputFromWindow(this.currentFocus.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
            } catch (e: ScoreFormatException) {
                Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
            } catch (e: ScoreException) {
                Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
