package com.ditooard.mountainindo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent

class MainActivity : AppCompatActivity() {

    private lateinit var rvGunung: RecyclerView
    private var list: ArrayList<Gunung> = arrayListOf()
    private var title: String = "10 Gunung  Es Tertinggi di Dunia"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisiasi Toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar_splash)
        setSupportActionBar(toolbar)

        setActionBarTitle(title)

        rvGunung = findViewById(R.id.rv_gunung)
        rvGunung.setHasFixedSize(true)

        list.addAll(dataGunung.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvGunung.layoutManager = LinearLayoutManager(this)
        val listGunungAdapter = ListGunungAdapter(list)
        rvGunung.adapter = listGunungAdapter

        listGunungAdapter.setOnItemClickCallback(object : ListGunungAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Gunung) {
                showSelectedGunung(data)
            }
        })
    }

    private fun showSelectedGunung(gunung: Gunung) {
        Toast.makeText(this, gunung.nama, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about -> {
                // Tambahkan kode untuk membuka aktivitas AboutUsActivity di sini
                val intent = Intent(this, About::class.java)
                startActivity(intent)
                return true
            }
            // Tambahkan case lainnya jika ada menu lain yang perlu di-handle
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}
