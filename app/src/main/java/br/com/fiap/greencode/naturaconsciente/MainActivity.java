package br.com.fiap.greencode.naturaconsciente;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                chamarEscolhaPerfil();
            }
        }, 3500);
    }

    private void chamarEscolhaPerfil() {
        Intent intent = new Intent(this, SelecionaPerfilActivity.class);
        startActivity(intent);
        finish();
    }

}
