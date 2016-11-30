package de.adesso.wieschalla.senses2go;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound);
        SoundActivity.this.setTitle("Lautsprecher");
    }
}
