package de.adesso.wieschalla.senses2go;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mic);
        MicActivity.this.setTitle("Mikrofon");
    }
}
