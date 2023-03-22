package mateus.kaua.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Pegando os objetos das telas e salvando em variáveis*/
        Button btnEnviar = findViewById(R.id.btnEnviar);
        /*Quando o votão voltar for clicado: ...*/
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Pegando os objetos das telas e salvando em variáveis*/
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                String textoDigitado = etDigiteAqui.getText().toString();
                etDigiteAqui.setText("");
                Intent i= new Intent(MainActivity.this,NextActivity.class);
                i.putExtra("Texto",textoDigitado);
                startActivity(i);
            }
        });
    }
}