package com.encoders.bottomsheetinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageView
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    private lateinit var show_bottomsheet: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        show_bottomsheet = findViewById(R.id.show_bottomsheet)
        show_bottomsheet.setOnClickListener {
            UPdate_Ctegory_View()
        }
    }

    fun UPdate_Ctegory_View() {

        val btnsheet = layoutInflater.inflate(R.layout.bottomsheet_layout, null)
        val dialog = BottomSheetDialog(this, R.style.SheetDialog)
        dialog.setContentView(btnsheet)
        dialog.show()

        val close: AppCompatButton = btnsheet.findViewById(R.id.close)
        close.setOnClickListener {
            dialog.dismiss()
        }

    }
}