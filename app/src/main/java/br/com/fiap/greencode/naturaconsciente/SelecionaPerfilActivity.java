package br.com.fiap.greencode.naturaconsciente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelecionaPerfilActivity extends AppCompatActivity {

    Button btnCliente, btnConsultor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecionar_perfil);

        btnCliente = (Button) findViewById(R.id.btnCliente);
        btnConsultor = (Button) findViewById(R.id.btnConsultor);
    }

    public void chamarLoginCliente(View v){
        Intent intent = new Intent(this, LoginClienteActivity.class);
        startActivity(intent);
    }

    public void chamarLoginConsultor(View v){
        Intent intent = new Intent(this, LoginConsultorActivity.class);
        startActivity(intent);
    }


}
