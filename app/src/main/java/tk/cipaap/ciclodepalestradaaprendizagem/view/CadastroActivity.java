package tk.cipaap.ciclodepalestradaaprendizagem.view;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import tk.cipaap.ciclodepalestradaaprendizagem.R;
import tk.cipaap.ciclodepalestradaaprendizagem.beans.Participante;
import tk.cipaap.ciclodepalestradaaprendizagem.config.FirebaseConfig;

public class CadastroActivity extends AppCompatActivity {
    private String[] palestras;
    private ArrayAdapter<String> spn_layout;
    private Spinner spn_palestra;
    private EditText edt_nome, edt_mae, edt_rg, edt_cpf, edt_tel, edt_email, edt_data, edt_senha, edt_resenha;
    private Button btn_cadastrar;
    private Participante participante;
    private FirebaseAuth auth;
    private String idUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        auth = FirebaseConfig.getFirebaseAuth();
        palestras = new String[]{"Todas as Palestras", "Psicologia Positiva", "Assédio no Trabalho", "Novas Regras Trabalhistas"};
        spn_layout = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, palestras);
        spn_layout.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        edt_nome =(EditText) findViewById(R.id.edt_nome);
        edt_mae =(EditText) findViewById(R.id.edt_mae);
        edt_rg =(EditText) findViewById(R.id.edt_rg);
        edt_cpf =(EditText) findViewById(R.id.edt_cpf);
        edt_email =(EditText) findViewById(R.id.edt_email);
        edt_data =(EditText) findViewById(R.id.edt_masc);
        edt_tel =(EditText) findViewById(R.id.edt_tel);
        edt_senha = (EditText) findViewById(R.id.edt_senha);
        edt_resenha = (EditText) findViewById(R.id.edt_resenha);
        spn_palestra = (Spinner) findViewById(R.id.spn_palestras);
        spn_palestra.setAdapter(spn_layout);
        btn_cadastrar = (Button) findViewById(R.id.btn_cadastrar);
        btn_cadastrar.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                participante = new Participante();
                participante.setNome(edt_nome.getText().toString());
                participante.setMae(edt_mae.getText().toString());
                participante.setEmail(edt_email.getText().toString());
                participante.setCpf(edt_cpf.getText().toString());
                participante.setRg(edt_rg.getText().toString());
                participante.setTel(edt_tel.getText().toString());
                participante.setData(edt_data.getText().toString());
                participante.setPalestra(spn_palestra.getSelectedItemPosition());


                final Task<AuthResult> authResultTask = auth.createUserWithEmailAndPassword(edt_email.getText().toString(),
                        edt_senha.getText().toString());
                    if (authResultTask.isSuccessful()) {
                        Toast.makeText(getBaseContext(), "Cadastro realizado com sucesso", Toast.LENGTH_LONG).show();
                        FirebaseUser user = auth.getCurrentUser();
                        idUser = user.getUid();
                        DatabaseReference mDatabase = FirebaseConfig.getFirebase();
                        mDatabase.child("users").child(idUser).setValue(participante);
                    } else {
                        Toast.makeText(getBaseContext(), "Cadastro não realizado tente novamente", Toast.LENGTH_LONG).show();

                    }


            }
        });
    }
}
