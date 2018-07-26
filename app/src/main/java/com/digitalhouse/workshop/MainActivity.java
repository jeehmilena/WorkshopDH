package com.digitalhouse.workshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private CheckBox item1;
    private CheckBox item2;
    private CheckBox item3;
    private TextView totalGeral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item1 = findViewById(R.id.checkBox);
        item2 = findViewById(R.id.checkBox2);
        item3 = findViewById(R.id.checkBox3);
        totalGeral = findViewById(R.id.totalGeral);

        ImageView imagem = findViewById(R.id.imageView);
        imagem.setAlpha(0F);
        imagem.animate()
                .alpha(1F)
                .setDuration(5000)
                .start();


        item1.setOnCheckedChangeListener(this);
        item2.setOnCheckedChangeListener(this);
        item3.setOnCheckedChangeListener(this);

    }




    public void finalizarPedido(View view) {

        // Totalizador de valor
        float total = 0F;

        // Verifica se o item esta preenchido
        if(item1.isChecked()){
            // Sumariza o valor do item 1
            total += Float.parseFloat(item1.getText().toString());
        }
        if(item2.isChecked()){
            total += Float.parseFloat(item2.getText().toString());
        }
        if(item3.isChecked()){
            total += Float.parseFloat(item3.getText().toString());
        }

        totalGeral.setText("R$ "+total);

        String mensagem;
        // Exibe diferentes mensagens de acordo com criterio
        if(total == 0){
            mensagem = "Por favor, selecione pelo menos um item!";
        }else{
            mensagem = "Valor total do Pedido: R$" + total;

        }

        // Exibe mensagem
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        finalizarPedido(null);
    }
}
