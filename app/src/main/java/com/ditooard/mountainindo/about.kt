package com.ditooard.mountainindo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class About : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val toolbar: Toolbar = findViewById(R.id.about_toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        supportActionBar?.title = "About"

        val tvEmail:         TextView = findViewById(R.id.url_email)
        val btnLinkedIn:     Button   = findViewById(R.id.url_linkedin)
        val tvDicoding:      TextView = findViewById(R.id.url_dicoding)


        tvEmail.setOnClickListener(this)
        btnLinkedIn.setOnClickListener(this)
        tvDicoding.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        when (v.id) {
            R.id.url_email -> {
                val emailIntent = Intent(Intent.ACTION_SENDTO)
                emailIntent.data = Uri.parse("mailto:ditoardi153@yahoo.com")
                startActivity(emailIntent)
            }

            R.id.url_linkedin -> {
                val link = "https://www.linkedin.com/in/dito-ardi-pratama-bb5a98278"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }


            R.id.url_dicoding -> {
                val link = "https://www.dicoding.com/academies/51"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }

        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed() // Menangani tombol back pada toolbar
        return true
    }

    override fun onBackPressed() {
        super.onBackPressed()
        // Tambahkan kode yang ingin Anda jalankan saat tombol kembali ditekan di sini
    }
}