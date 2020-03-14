package com.example.cs321login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etName, etPass;
    Button btnLogin;
    TextView tvRge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etPass = findViewById(R.id.etPass);

        btnLogin = findViewById(R.id.btnLogin);
        tvRge = findViewById(R.id.tvReg);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Uname,pass;

                Uname = etName.getText().toString();
                pass = etPass.getText().toString();

                if (Uname.equals(""))
                {
                    Toast.makeText(MainActivity.this,"User name Required",Toast.LENGTH_SHORT).show();
                }
                else if (pass.equals("")){
                    Toast.makeText(MainActivity.this,"Password Required",Toast.LENGTH_SHORT).show();
                }
                else if (!Uname.equals("CS321")) {
                    Toast.makeText(MainActivity.this, "User name is wrong ", Toast.LENGTH_SHORT).show();
                }
                else if (!pass.equals("001")) {
                    Toast.makeText(MainActivity.this, "Password is wrong ", Toast.LENGTH_SHORT).show();
                }

                else {


                    Intent i = new Intent(MainActivity.this, SecondPage.class);
                    startActivity(i);
                    finish();
                }

            }

        });

        tvRge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,LogInInfo.class);
                startActivity(i);
                finish();

            }
        });


    }
}
