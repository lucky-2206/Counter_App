package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_inc = findViewById<Button>(R.id.inc);
        val btn_dec = findViewById<Button>(R.id.dec);
        val view_val = findViewById<TextView>(R.id.value_view) ;
        var cnt=0;

        btn_inc.setOnClickListener{
            cnt++;
            view_val.setText(cnt.toString());

        }
        btn_dec.setOnClickListener{
            cnt--;
            view_val.setText(cnt.toString());

        }
    }

}