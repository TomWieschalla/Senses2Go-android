package de.adesso.wieschalla.senses2go;

import android.media.MediaPlayer;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SoundActivity extends AppCompatActivity {

    MediaPlayer mp;
    boolean start = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound);
        SoundActivity.this.setTitle("Lautsprecher");

        // back button
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_HOME_AS_UP | ActionBar.DISPLAY_SHOW_TITLE);
        }

        mp = MediaPlayer.create(SoundActivity.this, R.raw.guitar);
        mp.setLooping(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mp.stop();
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void play(View view) {
        Button play = (Button) view;
        if (!mp.isPlaying() && !start) {
            mp.start();
            start = true;
            play.setBackgroundResource(android.R.drawable.ic_media_pause);
        } else if (mp.isPlaying()) {
            mp.pause();
            play.setBackgroundResource(android.R.drawable.ic_media_play);
        } else {
            mp.start();
            play.setBackgroundResource(android.R.drawable.ic_media_pause);
        }
    }
}
