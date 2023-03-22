package mateus.kaua.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        /*Pegando os objetos das telas e salvando em variáveis*/
        TextView tvText = findViewById(R.id.tvText);
        Button btnVoltar = findViewById(R.id.btnVoltar);
        /*Declarando a intenção de mudar de Activity*/
        Intent i = getIntent();
        /*pegando o texto digitado*/
        String textoDigitado = i.getStringExtra("Texto");
        /*colocando a mensagem no text view*/
        tvText.setText(textoDigitado);
        /*Quando o votão voltar for clicado feche a página atual*/
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                /*
                ou
                Intent i= new Intent(NextActivity.this,MainActivity.class);
                startActivity(i);
                 */
            }
        });
    }
}