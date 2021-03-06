package com.example.tecinfo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String memoria;
    private String operacao;
    private double valor1 = 0;
    private double valor2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView displayConta = (TextView) findViewById(R.id.displayConta);
        final TextView displayResultado = (TextView) findViewById(R.id.displayResultado);


        final Button btn0 = (Button) findViewById(R.id.btn_zero);
        final Button btn1 = (Button) findViewById(R.id.btn_1);
        final Button btn2 = (Button) findViewById(R.id.btn_2);
        final Button btn3 = (Button) findViewById(R.id.btn_3);
        final Button btn4 = (Button) findViewById(R.id.btn_4);
        final Button btn5 = (Button) findViewById(R.id.btn_5);
        final Button btn6 = (Button) findViewById(R.id.btn_6);
        final Button btn7 = (Button) findViewById(R.id.btn_7);
        final Button btn8 = (Button) findViewById(R.id.btn_8);
        final Button btn9 = (Button) findViewById(R.id.btn_9);
        final Button btnsoma = (Button) findViewById(R.id.btn_S);
        final Button btnmenos = (Button) findViewById(R.id.btn_M);
        final Button btnvezes = (Button) findViewById(R.id.btn_vzs);
        final Button btnigual = (Button) findViewById(R.id.btn_ig);
        final Button btndivisao = (Button) findViewById(R.id.btn_dv);
        final Button btnpon = (Button) findViewById(R.id.btn_pon);
        final Button apaga = (Button) findViewById(R.id.btn_c);

        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            memoria = (String) displayConta.getText();
            displayConta.setText(memoria+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                memoria = (String) displayConta.getText();
                displayConta.setText(memoria+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                memoria = (String) displayConta.getText();
                displayConta.setText(memoria+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                memoria = (String) displayConta.getText();
                displayConta.setText(memoria+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                memoria = (String) displayConta.getText();
                displayConta.setText(memoria+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                memoria = (String) displayConta.getText();
                displayConta.setText(memoria+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                memoria = (String) displayConta.getText();
                displayConta.setText(memoria+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                memoria = (String) displayConta.getText();
                displayConta.setText(memoria+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                memoria = (String) displayConta.getText();
                displayConta.setText(memoria+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                memoria = (String) displayConta.getText();
                displayConta.setText(memoria+"9");
            }
        });
        btnpon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                memoria = (String) displayConta.getText();
                displayConta.setText(memoria + ".");
            }
        });

        apaga.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                memoria = "";
                displayConta.setText("");
                displayResultado.setText("");
            }
        });
        btnsoma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacao = "+";
                valor1 = Double.parseDouble(displayConta.getText().toString());
                displayResultado.setText(displayConta.getText().toString()+ "+");
                displayConta.setText("");

            }
        });
        btnmenos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacao = "-";
                valor1 = Double.parseDouble(displayConta.getText().toString());
                displayResultado.setText(displayConta.getText().toString()+ "-");
                displayConta.setText("");


            }
        });
        btndivisao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operacao = "/";
                valor1 = Double.parseDouble(displayConta.getText().toString());
                displayResultado.setText(displayConta.getText().toString() + "/");
                displayConta.setText("");

            }
        });
        btnigual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (displayConta.getText().equals("")){
                    Toast.makeText(getApplicationContext(),"Digite um número!", Toast.LENGTH_LONG).show();
                }
                else {
                    valor2 = Double.parseDouble(displayConta.getText().toString());
                    displayConta.setText("");
                    String resultado = calcular(valor1, valor2, operacao);
                    displayResultado.setText(resultado);
                }

                }
            });


    }
    public String calcular(Double valor1, Double valor2, String operacao){
        Double resultado = 0.0;
        if (operacao.equals("+")) {
            resultado = valor1 + valor2;
        } else if (operacao.equals("-")){
            resultado = valor1 - valor2;
        }else if (operacao.equals("*")){
            resultado = valor1 * valor2;
        }else if (operacao.equals("/")){
            if (valor2 == 0) {
                Toast.makeText(getApplicationContext(),"Não é possivel dividir por 0!", Toast.LENGTH_LONG).show();
            }else{
                resultado = valor1/valor2;
            }
        }
        return resultado.toString();

    }
}
