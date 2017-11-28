package tk.cipaap.ciclodepalestradaaprendizagem.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import tk.cipaap.ciclodepalestradaaprendizagem.beans.Participante;

public class CadastroActivity extends AppCompatActivity {
    private String[] palestras;
    private ArrayAdapter<String> spn_layout;
    private Spinner spn_palestra;
    private EditText edt_nome,edt_mae,edt_rg,edt_cpf,edt_tel,edt_email,edt_data;
    private Button btn_cadastrar;
    private Participante participante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

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
                participante.setTelefone(edt_tel.getText().toString());
                participante.setData_nasc(edt_data.getText().toString());
                Toast.makeText(getBaseContext(),spn_palestra.getSelectedItemPosition(),Toast.LENGTH_LONG);
            }
        });
    }
}
