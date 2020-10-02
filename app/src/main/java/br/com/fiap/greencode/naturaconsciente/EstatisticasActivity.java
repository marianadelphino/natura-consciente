package br.com.fiap.greencode.naturaconsciente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EstatisticasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estatisticas);
    }

    public void voltarParaMenuCliente(View v){
        finish();
    }
}
