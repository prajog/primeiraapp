package beretta.prajo.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        //Obtem o intent que criou essa tela
        Intent i = getIntent();

        //Obtem o texto que esta no intent
        String texto = i.getStringExtra("texto");

        //Obtem o textview
        TextView tvTexto = findViewById(R.id.tvTexto);

        //Seta o texto dentro da textview
        tvTexto.setText(texto);
    }
}