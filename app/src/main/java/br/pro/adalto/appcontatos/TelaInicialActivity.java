package br.pro.adalto.appcontatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaInicialActivity extends AppCompatActivity {

    private Button btnCadastrar, btnListar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        btnListar = (Button) findViewById(R.id.btnListar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TelaInicialActivity.this,
                        FormularioActivity.class);
                startActivity( i );
            }
        });


        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TelaInicialActivity.this,
                        ListaContatosActivity.class);
                startActivity( i );
            }
        });

    }

}
