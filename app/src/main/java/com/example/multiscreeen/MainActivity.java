package com.example.multiscreeen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText email;
    EditText phno;
    public  static final String EXTRA_NAME="com.example.multiscreen.extra.NAME";
    public static final String EXTRA_MAIL="com.example.multiscreeen.extra.MAIL";
    public static final String EXTRA_PHONE="com.example.multiscreeen.extra.PHONE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onclicked(View v){
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity2.class);
        name=findViewById(R.id.editTextTextPersonName);
        email=findViewById(R.id.editTextTextEmailAddress);
        phno=findViewById(R.id.editTextPhone);

        String userName=name.getText().toString();
        String mail=email.getText().toString();
        String phone=phno.getText().toString();

        intent.putExtra(EXTRA_NAME,userName);
        intent.putExtra(EXTRA_MAIL,mail);
        intent.putExtra(EXTRA_PHONE,phone);

        startActivity(intent);
    }
}