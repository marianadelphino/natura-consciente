package br.com.fiap.greencode.naturaconsciente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;

public class VerificaStatusActivity extends AppCompatActivity {

    ProgressBar barraProgresso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifica_status);

        barraProgresso = (ProgressBar) findViewById(R.id.barraProgresso);
        barraProgresso.setEnabled(false);
    }

    public void voltarParaMenuCliente(View v){
        finish();
    }
}
