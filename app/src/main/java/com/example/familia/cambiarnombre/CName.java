package com.example.familia.cambiarnombre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class CName extends AppCompatActivity {
    TextView txt;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cname);
        txt=(TextView) findViewById(R.id.mytext);
        boton=(Button) findViewById(R.id.mybutton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick (View v){
              txt.setText("Evelin");
            }

        } );



    }



}
