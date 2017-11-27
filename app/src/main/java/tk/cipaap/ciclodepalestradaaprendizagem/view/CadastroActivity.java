package tk.cipaap.ciclodepalestradaaprendizagem.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import tk.cipaap.ciclodepalestradaaprendizagem.R;

public class CadastroActivity extends AppCompatActivity {
    private String[] palestras;
    private ArrayAdapter<String> spn_layout;
    private Spinner spn_palestra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        palestras = new String[]{"Todas as Palestras", "Psicologia Positiva", "Assédio no Trabalho", "Novas Regras Trabalhistas"};
        spn_layout = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, palestras);
        spn_layout.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spn_palestra = (Spinner) findViewById(R.id.spn_palestras);
        spn_palestra.setAdapter(spn_layout);
    }
}
