package de.adesso.wieschalla.senses2go;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MagnoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magno);
        MagnoActivity.this.setTitle("Erdfeldstärke");
    }
}
