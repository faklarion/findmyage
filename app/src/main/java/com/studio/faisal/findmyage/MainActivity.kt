package com.studio.faisal.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Pendeteksi button ditekan
        btnHitung.setOnClickListener {
            //mengambil inputan user
            val tahunLahir = edtTahunLahir.text.toString().toIntOrNull()

            //mencek inputan user ada atau tidak isinya
            if(tahunLahir != null){
                // perhitungan umur
                val umurSekarang = Calendar.getInstance().get(Calendar.YEAR) - tahunLahir
                txtUmur.text = umurSekarang.toString()
            } else {
                edtTahunLahir.error = "Masukkan Tahun Lahir !"
            }
        }
    }
}
