package com.example.app_tugas4;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivitySatu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satu);
    }
    public void btnBackOnClick(View view) {
        Intent mainActivity = new Intent(this,MainActivity.class);
        startActivity(mainActivity);
    }
}