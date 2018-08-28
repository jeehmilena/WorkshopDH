package com.digitalhouse.workshop.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.digitalhouse.workshop.R;

import org.w3c.dom.Text;

public class FinalizarPedidoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar_pedido);


        TextView textViewItemsSelecionado = findViewById(R.id.textview_itens_selecionados);
        TextView textViewItem = findViewById(R.id.textview_item);

        Intent intent = new Intent();
        Bundle bundle = intent.getExtras();

        String itemEscolhido = bundle.getString("titulo");
        textViewItem.setText(itemEscolhido);




    }
}
