package br.com.fiap.greencode.naturaconsciente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

import br.com.fiap.greencode.naturaconsciente.util.ArquivoDB;

public class MenuClienteActivity extends AppCompatActivity {

    TextView msgNome;
    Button btnVerificaPontos, btnVerificaStatus, btnSair, btnEstatisticas;

    private ArquivoDB arquivoDB;

    private final String ARQ = "dadosCliente.txt";
    private final String SP = "dadosCliente";
    private HashMap<String, String> mapDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cliente);

        btnVerificaPontos = (Button) findViewById(R.id.btnVerificaPontuacao);
        btnVerificaStatus = (Button) findViewById(R.id.btnVerificaStatus);
        btnSair = (Button) findViewById(R.id.btnSair);
        btnEstatisticas = (Button) findViewById(R.id.btnVerEstatisticas);

        //Setar nome no painel depois de logado
        arquivoDB = new ArquivoDB();
        mapDados = new HashMap<>();

        msgNome = (TextView) findViewById(R.id.msgNome);
        msgNome.setText("Olá "+arquivoDB.retornarValor(this, SP, "nome")+", seja bem vindo!");
    }

    public void chamarVerificarStatus(View view) {
        Intent intent = new Intent(this, VerificaStatusActivity.class);
        startActivity(intent);
    }

    public void chamarVerificarPontos(View view) {
        Intent intent = new Intent(this, VerificaPontosActivity.class);
        startActivity(intent);
    }

    public void chamarEstatisticas(View view) {
        Intent intent = new Intent(this, EstatisticasActivity.class);
        startActivity(intent);
    }

    public void sair(View view) {
        finish();
    }
}
