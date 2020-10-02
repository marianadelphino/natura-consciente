package br.com.fiap.greencode.naturaconsciente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.util.HashMap;

import br.com.fiap.greencode.naturaconsciente.util.ArquivoDB;

public class ConfirmaEmbalagemConsultor extends AppCompatActivity {

    private ArquivoDB arquivoDB;

    private final String ARQ = "embalagem.txt";
    private final String SP = "embalagem";
    private HashMap<String, String> mapDados;

    TextView tv_descricaoProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirma_embalagem_consultor);

        ArquivoDB arquivoDB = new ArquivoDB();
        mapDados = new HashMap<>();

        tv_descricaoProduto = (TextView) findViewById(R.id.tv_descricaoProduto);
        tv_descricaoProduto.setText(arquivoDB.retornarValor(this, SP, "produto"));
    }

    public void registrarDevolucao(View v){
        Toast.makeText(this, "Emabalagem Registrada, obrigado por contribuir com a Natura, clique em voltar e confira seus pontos!", Toast.LENGTH_LONG).show();
    }

    public void voltar(View v){
        finish();
    }
}
