package com.example.uas;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1 ,editText2;
    String text1 ,text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("User Login Sederhana");
        getSupportActionBar().setSubtitle("okedroid.com");

    }

    public void loginMasuk(View view) {


        editText1 = (EditText)findViewById(R.id.edittext_username);
        editText2 = (EditText) findViewById(R.id.edittext_password);
        text1 = editText1.getText().toString();
        text2 = editText2.getText().toString();


        if ((text1.contains("Username"))&&((text2.contains("Password")))) {
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }

        else if ((text1.matches("")||text2.matches("")))

        {

            Toast.makeText(this, "Isikan Username dan Password", Toast.LENGTH_SHORT).show();

        }

        else {


            Toast.makeText(this, "Login Gagal /Username Password Salah", Toast.LENGTH_SHORT).show();
        }

    }


}