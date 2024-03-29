package com.mars.apt.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.mars.apt.annotation.Builder;
import com.mars.apt.annotation.Inject;

/**
 * Created by JohnnySwordMan on 2021/12/31
 */
@Builder
public class LoginActivity extends Activity {

    @Inject
    String username;
    @Inject
    String password;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView mTvName = findViewById(R.id.tv_name);
        TextView mTvPwd = findViewById(R.id.tv_pwd);

//        String username = getIntent().getStringExtra("username");
//        String password = getIntent().getStringExtra("password");

        mTvName.setText(username);
        mTvPwd.setText(password);
    }
}
