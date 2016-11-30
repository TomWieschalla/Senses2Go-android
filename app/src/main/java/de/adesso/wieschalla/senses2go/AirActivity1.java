package de.adesso.wieschalla.senses2go;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AirActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air1);
        AirActivity1.this.setTitle("Luftfeuchtigkeit");
    }
}
