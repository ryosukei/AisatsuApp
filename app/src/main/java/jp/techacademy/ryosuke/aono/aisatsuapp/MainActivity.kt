package jp.techacademy.ryosuke.aono.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TimePicker
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener(this)
    }

    override fun onClick(v: View){
        if(v.id == R.id.btn1){
            showTimePicker()
        }
    }

    private fun showTimePicker(){
        var timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener{
                    view, hour, minute ->
                    if(hour in 2..9){
                        txt1.text = "おはよう"
                    }else if(hour in 10..17){
                        txt1.text = "こんにちは"
                    }else{
                        txt1.text = "こんばんは"
                    }
                }, 13, 0, true)
        timePickerDialog.show()
    }
}