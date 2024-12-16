package com.example.companyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button bt1;
    EditText ed1,ed2;

    String getName,getPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bt1=(Button) findViewById(R.id.loginBtn);
       ed1=(EditText) findViewById(R.id.uname);
       ed2=(EditText) findViewById(R.id.pass);

       bt1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               getName=ed1.getText().toString();
               getPass=ed2.getText().toString();

               if(getName.equalsIgnoreCase("admin")&&getPass.equalsIgnoreCase("12345"))
               {
                   Intent ob = new Intent(getApplicationContext(), MenuActivity.class);
                   startActivity(ob);
               }

               else {
                   Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_SHORT).show();
               }
           }
       });



    }
}