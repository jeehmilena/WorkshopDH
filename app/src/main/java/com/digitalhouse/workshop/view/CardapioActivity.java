package com.digitalhouse.workshop.view;

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
        final List<Cardapio> cardapio = todosOsItens();


        //Observações para o adapter: parm 1: contexto, param2: layout do item(textView para cada item), param3: lista que queremos mostrar
        //ArrayAdapter<Cardapio> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cardapio);
        CardapioAdapter adapter = new CardapioAdapter(this, cardapio);
        listaDoCardapio.setAdapter(adapter);

        listaDoCardapio.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CardapioActivity.this, "Teste", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private List<Cardapio> todosOsItens(){
        return new ArrayList<>(Arrays.asList(
                new Cardapio("Sorvete de chocolate", 6.00, false),
                new Cardapio("Pizza Marguerita", 24.90, false),
                new Cardapio("x-Burguer", 25.00, false)));
    }
}
