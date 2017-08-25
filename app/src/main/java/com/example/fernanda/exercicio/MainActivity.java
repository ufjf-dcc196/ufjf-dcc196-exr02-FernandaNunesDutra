package com.example.fernanda.exercicio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private TextView resultado;
    private Button botaoSomar;
    private Button botaoSubtrair;
    private Button botaoMultiplicar;
    private Button botaoDividir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1 - Encontre os componentes de entrada
        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);

        //2 - Encontre os componentes de saída
        resultado = (TextView) findViewById(R.id.resultado);

        //3 - Procure os componentes de controle
        botaoSomar = (Button) findViewById(R.id.soma);
        botaoSubtrair = (Button) findViewById(R.id.subtrai);
        botaoMultiplicar = (Button) findViewById(R.id.multiplica);
        botaoDividir = (Button) findViewById(R.id.divide);

        //4 - Configurar os ouvintes para os eventos

        botaoSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer n1 = Integer.parseInt(numero1.getText().toString());
                Integer n2 = Integer.parseInt(numero2.getText().toString());
                Integer soma = n1 + n2;

                resultado.setText("A soma de "+ n1 + " e " + n2+ " é " + soma);
            }
        });

        botaoSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer n1 = Integer.parseInt(numero1.getText().toString());
                Integer n2 = Integer.parseInt(numero2.getText().toString());
                Integer subtrai = n1 - n2;

                resultado.setText("A subtração de "+ n1 + " e " + n2+ " é " + subtrai);
            }
        });

        botaoMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer n1 = Integer.parseInt(numero1.getText().toString());
                Integer n2 = Integer.parseInt(numero2.getText().toString());
                Integer multiplicacao = n1 * n2;

                resultado.setText("A multiplicação de "+ n1 + " e " + n2+ " é " + multiplicacao);
            }
        });

        botaoDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float n1 = Float.parseFloat(numero1.getText().toString());
                Float n2 = Float.parseFloat(numero2.getText().toString());
                Float divisao = n1 / n2;

                resultado.setText("A divisão de "+ n1 + " e " + n2+ " é " + divisao);
            }
        });


    }
}
