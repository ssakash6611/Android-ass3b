package com.example.user.ass3b;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

IntentFilter inf;
Intent bst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BatteryStatus(View view) {
        inf=new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        bst=registerReceiver(null,inf);
        int status=bst.getIntExtra(BatteryManager.EXTRA_STATUS,-1);
        if(status==BatteryManager.BATTERY_STATUS_CHARGING){
            Toast.makeText(MainActivity.this,"charging",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this,"not charging",Toast.LENGTH_SHORT).show();
        }

    }
}
