package com.example.jumptoactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;
import com.example.jumptoactivity.MainActivity;


public class PicActivity extends AppCompatActivity {
    private Timer mGameFreshTimer;
    public Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pic);
        mGameFreshTimer = new Timer(true);
        mContext = this;
        mGameFreshTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(mContext, MainActivity.class));
                finish();
            }
        }, 5000);
    }
}
