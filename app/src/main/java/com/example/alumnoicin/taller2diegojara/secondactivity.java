package com.example.alumnoicin.taller2diegojara;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class secondactivity extends AppCompatActivity {
    private View btn;
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        texto = (TextView) findViewById(R.id.textViewMain);
        Bundle bundle = getIntent().getExtras();
        bundle = null;
        if(bundle != null){
            String saludo = bundle.getString("saludo");
            Toast.makeText(secondactivity.this, saludo, Toast.LENGTH_LONG).show();
            texto.setText(saludo);
        } else {
            Toast.makeText(secondactivity.this, "Esta vacio", Toast.LENGTH_LONG).show();
        }
        setContentView(R.layout.secondactivity);

        btn = (Button) findViewById(R.id.buttonNext);

        btn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent = new Intent(secondactivity.this,activity3.class);
                //intent.putExtra("saludo", SALUDO);
                startActivity(intent);
            }

        });
    }
}
