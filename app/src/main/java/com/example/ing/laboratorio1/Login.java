package com.example.ing.laboratorio1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    private EditText User;
    private EditText Password;
    private Button Boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        User = (EditText)findViewById(R.id.etUser);
        Password = (EditText)findViewById(R.id.etPasword);
        Boton = (Button) findViewById(R.id.btLog);

        Boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if ((Email_Validate( User.getText().toString() )))
                {
                    Toast t1 = Toast.makeText(getApplicationContext(),"Usuario o Contraseña Correcta",Toast.LENGTH_SHORT);
                    t1.show();

                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("email",User.getText().toString());
                    setResult(Activity.RESULT_OK,resultIntent);
                    finish();
                }


            }
        });


    }




    private boolean Email_Validate(String email)
    {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }



}
