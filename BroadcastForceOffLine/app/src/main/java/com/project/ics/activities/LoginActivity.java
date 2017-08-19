package com.project.ics.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.project.ics.broadcastforceoffline.MainActivity;
import com.project.ics.broadcastforceoffline.R;

/**
 * Created by Administrator on 2017/8/19.
 */

public class LoginActivity extends BaseActivity {
    private EditText account;
    private EditText password;
    private Button loginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        account= (EditText) findViewById(R.id.account);
        password= (EditText) findViewById(R.id.password);
        loginbtn= (Button) findViewById(R.id.login);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String accountInfo=account.getText().toString();
                String passwordInfo=password.getText().toString();

                if(accountInfo.equals("admin")&&passwordInfo.equals("123456")){
                    Intent in=new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(in);
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this,"account or password incorrect",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
