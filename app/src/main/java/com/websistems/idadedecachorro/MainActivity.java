package com.websistems.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtIdade;
    private Button btnDescobrir;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtIdade = findViewById(R.id.edtIdade);
        btnDescobrir = findViewById(R.id.btnDescobrir);
        txtResultado = findViewById(R.id.txtResultado);

        btnDescobrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recuperar o que foi digitado
                String textoDigitado = edtIdade.getText().toString();

                if (textoDigitado.isEmpty()){
                    edtIdade.setError("Esse campo precisa ser preenchido");
                    edtIdade.requestFocus();
                } else {
                    int idade = Integer.parseInt(textoDigitado);
                    int resultado = idade * 7;

                    txtResultado.setText("A idade do cachorro em anos humanos é: \n" + resultado + " anos");
                }
            }
        });
    }
}
