package com.example.tecinfo.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Button login = (Button) findViewById(R.id.btn_login);
        final EditText nome = (EditText) findViewById(R.id.nome);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityB.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button cadastro = (Button) findViewById(R.id.btn_cad);

        cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityB.this,ActivityC.class);
                intent.putExtra("nome", nome.getText().toString());
                startActivity(intent);
                finish();
            }
        });

    }

}
