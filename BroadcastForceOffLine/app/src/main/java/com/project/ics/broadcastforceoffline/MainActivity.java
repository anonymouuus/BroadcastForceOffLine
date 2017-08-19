package com.project.ics.broadcastforceoffline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.project.ics.activities.BaseActivity;

public class MainActivity extends BaseActivity {

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
