package com.example.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val click = findViewById<Button>(R.id.btn_click)
        val layout_sheet = findViewById<LinearLayout>(R.id.layout_sheet)
        val bottomSheetBehavior = BottomSheetBehavior.from(layout_sheet)

        click.setOnClickListener {
            if (bottomSheetBehavior.state != BottomSheetBehavior.STATE_EXPANDED) {

            bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED

            } else {
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
            }
        }
    }
}