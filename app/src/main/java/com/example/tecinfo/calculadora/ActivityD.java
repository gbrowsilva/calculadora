package com.example.tecinfo.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        final TextView txtFormacao = findViewById(R.id.formacao);
        final TextView txtNascimento = findViewById(R.id.nascimento);
        final TextView txtIdade = findViewById(R.id.idade);
        final TextView txtCidade = findViewById(R.id.cidade);
        final TextView txtEstado = findViewById(R.id.estado);

        Button inicio = (Button) findViewById(R.id.btn_inicio);
        Button calcular = (Button) findViewById(R.id.btn_calcular);

        Intent intentRecebido = getIntent();
        String form = intentRecebido.getStringExtra("Formacao");
        String nasc = intentRecebido.getStringExtra("Nascimento");
        String ida = intentRecebido.getStringExtra("Idade");
        String cid = intentRecebido.getStringExtra("Cidade");
        String est = intentRecebido.getStringExtra("Estado");
        txtFormacao.setText(form);
        txtNascimento.setText(nasc);
        txtIdade.setText(ida);
        txtCidade.setText(cid);
        txtEstado.setText(est);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityD.this, ActivityB.class);

                startActivity(intent);
                finish();
            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityD.this, MainActivity.class);

                startActivity(intent);
                finish();

            }
        });

    }
}
