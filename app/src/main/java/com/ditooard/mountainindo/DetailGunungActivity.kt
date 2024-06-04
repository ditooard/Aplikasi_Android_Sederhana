package com.ditooard.mountainindo

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailGunungActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAMA        = "extra_nama"
        const val EXTRA_DETAIL      = "extra_detail"
        const val EXTRA_LOKASI      = "extra_lokasi"
        const val EXTRA_TINGGI      = "extra_tinggi"
        const val EXTRA_JALUR       = "extra_jalur"
        const val EXTRA_IMAGE       = "extra_image"
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_gunung)

        val toolbar: Toolbar = findViewById(R.id.detail_toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        supportActionBar?.title = "Detail Pegunungan"

        // Inisialisasi toolbar

        val tvDetailReceived:       TextView  = findViewById(R.id.detail_received)
        val tvLokasiReceived:      TextView  = findViewById(R.id.lokasi_received)
        val tvKetinggianReceived: TextView  = findViewById(R.id.ketinggian_received)
        val tvJalurReceived: TextView  = findViewById(R.id.jalur_received)
        val imgDetailReceived:      ImageView = findViewById(R.id.img_item_photo)

        val nama         = intent.getStringExtra(EXTRA_NAMA)
        val detail       = intent.getStringExtra(EXTRA_DETAIL)
        val country      = intent.getStringExtra(EXTRA_LOKASI)
        val construction = intent.getStringExtra(EXTRA_TINGGI)
        val decommission = intent.getStringExtra(EXTRA_JALUR)
        val image        = intent.getIntExtra(EXTRA_IMAGE, 0)

        tvDetailReceived.text       = detail
        tvLokasiReceived.text      = country
        tvKetinggianReceived.text = construction
        tvJalurReceived.text = decommission
        Glide.with(this)
            .load(image)
            .apply(RequestOptions())
            .into(imgDetailReceived)

        supportActionBar?.title = nama
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
