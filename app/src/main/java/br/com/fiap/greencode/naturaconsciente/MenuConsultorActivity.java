package br.com.fiap.greencode.naturaconsciente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

import br.com.fiap.greencode.naturaconsciente.util.ArquivoDB;

public class MenuConsultorActivity extends AppCompatActivity {

    String matricula;

    TextView msgNome;

    private ArquivoDB arquivoDB;

    private final String ARQ = "dadosConsultor.txt";
    private final String SP = "dadosConsultor";
    private HashMap<String, String> mapDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_consultor);

        //Setar nome no painel depois de logado
        arquivoDB = new ArquivoDB();
        mapDados = new HashMap<>();

        msgNome = (TextView) findViewById(R.id.msgNome);
        msgNome.setText("Olá "+arquivoDB.retornarValor(this, SP, "nome")+", seja bem vindo!");
    }


    public void chamarIdentificaEmbalagem(View view) {
        startActivity(new Intent(this, IdentificaEmbalagemConsultor.class));
    }


    public void chamarConfirmaEmbalagem(View view) {
        Intent intent = new Intent(this, ConfirmaEmbalagemConsultor.class);
        startActivity(intent);
    }

    public void chamarVerificarPontos(View view) {
        Intent intent = new Intent(this, VerificaPontosActivity.class);
        startActivity(intent);
    }

    public void sair(View view) {
        finish();
    }
}
