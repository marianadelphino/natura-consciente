package br.com.fiap.greencode.naturaconsciente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.HashMap;

import br.com.fiap.greencode.naturaconsciente.entity.EmbalagemDevolvida;
import br.com.fiap.greencode.naturaconsciente.util.ArquivoDB;

public class IdentificaEmbalagemConsultor extends AppCompatActivity {

    EditText edtCodigoEmbalagem, edtCpfCliente;
    String matricula;

    private ArquivoDB arquivoDB;

    private final String ARQ = "embalagem.txt";
    private final String SP = "embalagem";
    private HashMap<String, String> mapDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identifica_embalagem_consultor);

        edtCodigoEmbalagem = (EditText) findViewById(R.id.edtCodigoEmbalagem);
        edtCpfCliente = (EditText) findViewById(R.id.edtCpf);
    }

    public void identificarEmbalagem(View view) {
        String codigo = edtCodigoEmbalagem.getText().toString();

        ArquivoDB arquivoDB = new ArquivoDB();
        mapDados = new HashMap<>();

        mapDados.put("codigo", codigo);
        mapDados.put("produto", "Sabontete Masculino - 100ml");
        mapDados.put("cpfCliente", edtCpfCliente.getText().toString());

        arquivoDB.gravarChaves(this, SP, mapDados);

        //gravar embalagem
        try {
            arquivoDB.gravarArquivo(this, ARQ, mapDados.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Toast.makeText(this, "Embalagem Registrada!", Toast.LENGTH_SHORT).show();
    }

    public void voltar(View v){
        finish();
    }
}
