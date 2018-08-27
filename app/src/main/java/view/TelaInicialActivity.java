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
    private Button botaoTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        botaoInicial = findViewById(R.id.btnIniciar);
        botaoTeste = findViewById(R.id.btnTeste);

        //animação de "surgir" a imagem Pizza
        ImageView imagemPizza = findViewById(R.id.imagePizza);
        imagemPizza.setAlpha(0F);
        imagemPizza.animate()
                .alpha(1F)
                .setDuration(5000)
                .start();

        //animação de "surgir" a imagem Sorvete
        ImageView imagemSorvete = findViewById(R.id.imageSorvete);
        imagemSorvete.setAlpha(0F);
        imagemSorvete.animate()
                .alpha(2F)
                .setDuration(10000)
                .start();

        //animação de "surgir" a imagem Hamburguer
        ImageView imagemHamburguer = findViewById(R.id.imageHamburguer);
        imagemHamburguer.setAlpha(0F);
        imagemHamburguer.animate()
                .alpha(3F)
                .setDuration(15000)
                .start();

        botaoInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentVaiParaMain = new Intent(TelaInicialActivity.this, SorveteActivity.class);
                startActivity(intentVaiParaMain);


            }
        });


        botaoTeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVaiParaTeste = new Intent(TelaInicialActivity.this, CardapioActivity.class);
                startActivity(intentVaiParaTeste);
            }
        });


    }
}
