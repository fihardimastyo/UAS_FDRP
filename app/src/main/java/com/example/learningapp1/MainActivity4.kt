package com.example.learningapp1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    lateinit var userDBHelper: DBHelper2

    lateinit var lltampil: LinearLayout
    lateinit var tampil: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        userDBHelper = DBHelper2(this)
        tampil = findViewById(R.id.tampil_semua)
        lltampil = findViewById(R.id.ll_tampil)
        var tampilkan = userDBHelper.fullData()
//        lltampil.removeAllViews()
        tampilkan.forEach {
            tampil.text = tampil.text.toString() + " " + it.email.toString() + " - "  + it.pass.toString() + " - "  +
                    it.username.toString() + " - "  + it.fullname.toString() + "\n"
//            lltampil.addView(tampil)
        }

    }

}