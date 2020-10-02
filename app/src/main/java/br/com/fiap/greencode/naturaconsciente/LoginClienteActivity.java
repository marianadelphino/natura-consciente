package br.com.fiap.greencode.naturaconsciente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.util.HashMap;

import br.com.fiap.greencode.naturaconsciente.util.ArquivoDB;

public class LoginClienteActivity extends AppCompatActivity {

    EditText edtCpf, edtSenha;

    private ArquivoDB arquivoDB;

    private final String ARQ = "dadosCliente.txt";
    private final String SP = "dadosCliente";
    private HashMap<String, String> mapDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_cliente);

        edtCpf = (EditText) findViewById(R.id.edtCpf);
        edtSenha = (EditText) findViewById(R.id.edtSenha);

        arquivoDB = new ArquivoDB();
        mapDados = new HashMap<>();

        //Cadastrar cliente teste
        mapDados.put("nome", "Carlos");
        mapDados.put("cpf", "0");
        mapDados.put("senha", "123");

        arquivoDB.gravarChaves(this, SP, mapDados);

        try {
            arquivoDB.gravarArquivo(this, ARQ, mapDados.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void chamarMenuCliente(View v){

        ArquivoDB arquivoDB = new ArquivoDB();

        String cpf = arquivoDB.retornarValor(this, SP, "cpf");
        String senha = arquivoDB.retornarValor(this, SP, "senha");

        if(edtCpf.getText().toString().equals(cpf) && edtSenha.getText().toString().equals(senha)){
            Toast.makeText(this, "Logou com sucesso!", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, MenuClienteActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "CPF ou Senha incorretos!", Toast.LENGTH_SHORT).show();
        }
    }

    public void voltar(View v){
        finish();
    }
}
