package jp.techacademy.youko.aisatsuapp

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog(){
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener{ view, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")
                var aisatsu = ""
                when(hour) {
                    in 2..9 -> aisatsu = "おはよう"
                    in 10..17 -> aisatsu = "こんにちは"
                    else -> aisatsu = "こんばんは"

                }
                textView.text = aisatsu
            },
            13,0,true)
        timePickerDialog.show()
    }

}
