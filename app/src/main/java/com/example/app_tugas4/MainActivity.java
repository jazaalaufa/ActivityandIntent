package com.example.app_tugas4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.jar.JarEntry;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnSatuOnClick(View view) {
        Intent activitySatu = new Intent(this,ActivitySatu.class);
        startActivity(activitySatu);
    }

    public void btnDuaOnClick(View view) {
        String konten = "Belajar Activity dan Intent";

        Intent activityDua = new Intent(this,ActivityDua.class);
        activityDua.putExtra("data",konten);
        startActivity(activityDua);

    }

    public void btnTigaOnClick(View view) {


        Jenis jenisOleh = new Jenis();

        jenisOleh.setHargaMakanan("Rp 15.000");
        jenisOleh.setHargaMinuman("Rp 10.000");
        jenisOleh.setHargaSouvenir("Rp 20.000");
        jenisOleh.setHargaPakaian("Rp 35.000");


        Intent activityTiga = new Intent(this,ActivityTiga.class);
        activityTiga.putExtra("jenisOleh",jenisOleh);
        startActivity(activityTiga);
    }

    public void btnEmpatOnClick(View view) {
        Intent activityEmpat = new Intent(Intent.ACTION_DIAL);
        startActivity(activityEmpat);
    }

    public void btnLimaOnClick(View view) {
        Intent activityLima = new Intent(this,ActivityLima.class);
        startActivityForResult(activityLima,7);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK){
            if (requestCode==7){
                String passedData = data.getStringExtra("data");

                TextView txtHasil = findViewById(R.id.txtHasil);
                txtHasil.setText(passedData);
            }
        }
    }
}