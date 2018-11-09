package com.example.tecinfo.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2);

        Button salvar  = (Button) findViewById(R.id.btn_inicio);

        final EditText formacao = findViewById(R.id.edt_formacao);
        final EditText nascimento = findViewById(R.id.edt_nascimento);
        final EditText idade = findViewById(R.id.edt_idade);
        final EditText cidade = findViewById(R.id.edt_cidade);
        final EditText estado = findViewById(R.id.edt_estado);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( ActivityC.this, ActivityD.class);
                intent.putExtra("Formacao", formacao.getText().toString());
                intent.putExtra("Nascimento", nascimento.getText().toString());
                intent.putExtra("Idade", idade.getText().toString());
                intent.putExtra("Cidade", cidade.getText().toString());
                intent.putExtra("Estado", estado.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}
