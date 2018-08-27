package view;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.digitalhouse.workshop.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import model.Cardapio;

public class CardapioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);

        ListView listaDoCardapio = (ListView) findViewById(R.id.lista);
        List<Cardapio> cardapio = todosOsItens();
        ArrayAdapter<Cardapio> adapter = new ArrayAdapter<Cardapio>(this, R.layout.activity_cardapio, cardapio);
        listaDoCardapio.setAdapter(adapter);
    }

    private List<Cardapio> todosOsItens(){
        return new ArrayList<>(Arrays.asList(
                new Cardapio("Sorvete de chocolate", 6.00),
                new Cardapio("Pizza Marguerita", 24.90),
                new Cardapio("x-burguer", 25.00)));
    }
}
