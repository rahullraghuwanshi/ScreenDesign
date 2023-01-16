package com.rahulraghuwanshi.zumi

import android.content.Context
import android.os.Bundle
import android.text.Html
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtPrivacyPolicy = findViewById<TextView>(R.id.checkbox)

        val text = "I agree to Terms of use and Privacy Policy of OneScore and CIBIL"
        val s1: Spannable = SpannableString(text)
        s1.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(this, R.color.purple_700)),
            10,
            22,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        txtPrivacyPolicy.setText(s1, TextView.BufferType.SPANNABLE)

    }

}