package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText User, Pass;
    Button LogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        User = (EditText) findViewById(R.id.username);
        Pass = (EditText) findViewById(R.id.userpass);

        LogIn = (Button) findViewById(R.id.userlog);

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Check();
            }
        });
    }
    public void Check() {
        if (User.getText().toString().equals("Juan") && Pass.getText().toString().equals("123456")) {
            Toast.makeText(this, "Bienvenido Juan",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Verifica tus datos",Toast.LENGTH_LONG).show();
        }
    }
}