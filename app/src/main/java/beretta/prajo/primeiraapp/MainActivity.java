package beretta.prajo.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Constroi a interface
        setContentView(R.layout.activity_main);

        //Obtem o botao enviar
        Button btnEnviar = findViewById(R.id.btnEnviar);

        //Define o que acontece quando se clica no botao
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override

            //Metodo chamado toda vez que o botao eh clicado
            public void onClick(View v) {

                //Obtem a caixa de texto
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);

                //Obtem o texto digitado na caixa de texto pelo usuario
                String textoDigitado = etDigiteAqui.getText().toString();

                //Cria uma intencao para navegar para a proxima tela
                Intent i = new Intent(MainActivity.this, NextActivity.class);

                //Coloca o texto dentro da intencao para ser enviado para a proxima tela
                i.putExtra("texto",textoDigitado);

                //Inicia a proxima tela
                startActivity(i);
            }
        });
    }
}