package de.adesso.wieschalla.senses2go;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String CLASS_TAG = MainActivity.class.getSimpleName();

    Button gpsButton;
    Button gyroButton;
    Button magnoButton;
    Button accButton;
    Button proxButton;
    Button airButton2;
    Button lightButton;
    Button cameraButton;
    Button soundButton;
    Button micButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initializeButtons();
        MainActivity.this.setTitle("Wähle einen Sensor..");
    }

    private void initializeButtons() {
        gpsButton = (Button) findViewById(R.id.gpsButton);
        gpsButton.setOnClickListener(MainActivity.this);

        gyroButton = (Button) findViewById(R.id.gyroButton);
        gyroButton.setOnClickListener(MainActivity.this);

        magnoButton = (Button) findViewById(R.id.magnoButon);
        magnoButton.setOnClickListener(MainActivity.this);

        accButton = (Button) findViewById(R.id.accButton);
        accButton.setOnClickListener(MainActivity.this);

        proxButton = (Button) findViewById(R.id.proxButton);
        proxButton.setOnClickListener(MainActivity.this);

        airButton2 = (Button) findViewById(R.id.airButton2);
        airButton2.setOnClickListener(MainActivity.this);

        lightButton = (Button) findViewById(R.id.lightButton);
        lightButton.setOnClickListener(MainActivity.this);

        cameraButton = (Button) findViewById(R.id.cameraButton);
        cameraButton.setOnClickListener(MainActivity.this);

        soundButton = (Button) findViewById(R.id.soundbutton);
        soundButton.setOnClickListener(MainActivity.this);

        micButton = (Button) findViewById(R.id.micButton);
        micButton.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        checkViewAndPushToSpecificView(view, gpsButton, GPSActivity.class);
        checkViewAndPushToSpecificView(view, gyroButton, GyroActivity.class);
        checkViewAndPushToSpecificView(view, magnoButton, MagnoActivity.class);
        checkViewAndPushToSpecificView(view,accButton, AccActivity.class);
        checkViewAndPushToSpecificView(view, proxButton, ProxActivity.class);
        checkViewAndPushToSpecificView(view, airButton2, AirActivity2.class);
        checkViewAndPushToSpecificView(view, lightButton, LightActivity.class);
        checkViewAndPushToSpecificView(view, cameraButton, CameraActivity.class);
        checkViewAndPushToSpecificView(view, soundButton, SoundActivity.class);
        checkViewAndPushToSpecificView(view, micButton, MicActivity.class);
    }
    
    private void checkViewAndPushToSpecificView(View view, Button button, Class activityClass) {
        if (view == button) {
            Intent newIntent = new Intent(MainActivity.this, activityClass);
            startActivity(newIntent);
        }
    }

}
