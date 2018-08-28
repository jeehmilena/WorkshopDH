package com.digitalhouse.workshop.view;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.digitalhouse.workshop.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.digitalhouse.workshop.adapter.CardapioAdapter;
import com.digitalhouse.workshop.model.Cardapio;

public class CardapioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);

        ListView listaDoCardapio = (ListView) findViewById(R.id.lista);
        FloatingActionButton buttonFloat = findViewById(R.id.button_float);
        final List<Cardapio> cardapio = todosOsItens();


        //Observações para o adapter: parm 1: contexto, param2: layout do item(textView para cada item), param3: lista que queremos mostrar
        //ArrayAdapter<Cardapio> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cardapio);
        CardapioAdapter adapter = new CardapioAdapter(this, cardapio);
        listaDoCardapio.setAdapter(adapter);

        buttonFloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVaiParaMain = new Intent(CardapioActivity.this, SorveteActivity.class);
                startActivity(intentVaiParaMain);
            }
        });

    }

    private List<Cardapio> todosOsItens(){
        return new ArrayList<>(Arrays.asList(
                new Cardapio("Sorvete de chocolate", 6.00, false),
                new Cardapio("Pizza Marguerita", 24.90, false),
                new Cardapio("x-Burguer", 25.00, false),
                new Cardapio("Pizza de Toscana", 27.00, false),
                new Cardapio("x-Salada", 26.50, false),
                new Cardapio("Sorvete de Baunilha", 5.00, false)));
    }
}
