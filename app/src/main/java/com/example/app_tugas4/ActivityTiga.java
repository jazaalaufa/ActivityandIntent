package com.example.app_tugas4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiga);

        Jenis jenisOleh = (Jenis) getIntent().getSerializableExtra("jenisOleh");

        TextView txtMakanan = findViewById(R.id.txtMakanan);
        TextView txtMinuman = findViewById(R.id.txtMinuman);
        TextView txtSouvenir = findViewById(R.id.txtSouvenir);
        TextView txtPakaian = findViewById(R.id.txtPakaian);

        txtMakanan.setText("Makanan : " + jenisOleh.getHargaMakanan());
        txtMinuman.setText("Minuman : " +jenisOleh.getHargaMinuman());
        txtSouvenir.setText("Souvenir : " + jenisOleh.getHargaSouvenir());
        txtPakaian.setText("Pakaian : " + jenisOleh.getHargaPakaian());


    }
}