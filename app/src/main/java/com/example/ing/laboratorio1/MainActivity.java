package com.example.ing.laboratorio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private Button Bot;
    private TextView TV;
    static final int PICK_CONTACT_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        boolean logueado = false;

        if (!logueado)
        {
            Intent accBoton = new Intent(MainActivity.this ,Login.class);
            startActivityForResult(accBoton, PICK_CONTACT_REQUEST);
        }

        Bot = (Button) findViewById(R.id.btIniciar);
        TV = (TextView) findViewById(R.id.tv1);
        Bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });




    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // check that it is the SecondActivity with an OK result
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {

                // get String data from Intent
                String returnString = data.getStringExtra("email");

                // set text view with string
                TextView TV = (TextView) findViewById(R.id.tv1);
                TV.setText(returnString);
            }
        }
    }






}
