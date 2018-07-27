package view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.digitalhouse.workshop.R;

public class TelaInicialActivity extends AppCompatActivity {

    private Button botaoInicial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        botaoInicial = findViewById(R.id.btnIniciar);

        botaoInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentVaiParaMain = new Intent(TelaInicialActivity.this, MainActivity.class);
                startActivity(intentVaiParaMain);
            }
        });



    }
}
