package com.example.aclass.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aclass.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etUsername,etPassword;
    private Button login,cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.username);
        etPassword = findViewById(R.id.password);
        login = findViewById(R.id.login);
        cancel = findViewById(R.id.cancel);

        login.setOnClickListener(this);
        cancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.login:
                Login();
            case R.id.cancel:
                finish();

        }
    }

    private void Login() {
        String userName = etUsername.getText().toString();
        String password1 = etPassword.getText().toString();
        if (userName.equals("")&&password1.equals("")) {
            Toast.makeText(MainActivity.this, "账号或密码不能为空", Toast.LENGTH_LONG).show();
            etUsername.setText("");
            etPassword.setText("");
        } else {
            Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
            intent.putExtra("username","欢迎"+userName+"来到您的空间");
            startActivity(intent);
        }
    }

}
