package com.project.ics.broadcastforceoffline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button forceofflinebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        forceofflinebtn= (Button) findViewById(R.id.force_offline);
        forceofflinebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.example.FORCE_OFFLINE");//创建一条广播，并发送
                sendBroadcast(intent);
            }
        });
    }

}
