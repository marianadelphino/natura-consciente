package br.com.fiap.greencode.naturaconsciente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.util.HashMap;

import br.com.fiap.greencode.naturaconsciente.util.ArquivoDB;

public class LoginConsultorActivity extends AppCompatActivity {

    EditText edtMatricula, edtSenha;

    private ArquivoDB arquivoDB;

    private final String ARQ = "dadosConsultor.txt";
    private final String SP = "dadosConsultor";
    private HashMap<String, String> mapDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_consultor);

        edtMatricula = (EditText) findViewById(R.id.edtMatricula);
        edtSenha = (EditText) findViewById(R.id.edtSenha);

        arquivoDB = new ArquivoDB();
        mapDados = new HashMap<>();

        //Cadastrar consultor teste
        mapDados.put("nome", "Rafael");
        mapDados.put("matricula", "0");
        mapDados.put("senha", "123");

        arquivoDB.gravarChaves(this, SP, mapDados);

        try {
            arquivoDB.gravarArquivo(this, ARQ, mapDados.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void chamarMenuConsultor(View view) {

        ArquivoDB arquivoDB = new ArquivoDB();

        String matricula = arquivoDB.retornarValor(this, SP, "matricula");
        String senha = arquivoDB.retornarValor(this, SP, "senha");

        if(edtMatricula.getText().toString().equals(matricula) && edtSenha.getText().toString().equals(senha)){
            Toast.makeText(this, "Logou com sucesso!", Toast.LENGTH_SHORT).show();

            startActivity(new Intent(this, MenuConsultorActivity.class));
        } else {
            Toast.makeText(this, "Matrícula ou Senha incorretos!", Toast.LENGTH_SHORT).show();
        }



        /*Bundle bundle = new Bundle();
        Intent intent = new Intent(this, MenuConsultorActivity.class);
        bundle.putString("MatriculaConsultor", edtMatricula.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);*/
    }

    public void voltarr(View v){
        finish();
    }
}
