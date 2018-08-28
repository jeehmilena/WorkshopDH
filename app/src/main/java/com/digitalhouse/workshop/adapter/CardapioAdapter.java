package com.digitalhouse.workshop.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.digitalhouse.workshop.R;
import com.digitalhouse.workshop.model.Cardapio;

import java.util.List;

//criação do meu adapter
public class CardapioAdapter extends BaseAdapter {

    private Context context;
    private List<Cardapio> listCardapio;

    public CardapioAdapter(Context context, List<Cardapio> listCardapio) {
        this.context = context;
        this.listCardapio = listCardapio;
    }

    @Override
    public int getCount() {
        return listCardapio.size();
    }

    @Override
    public Object getItem(int position) {
        return listCardapio.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Cardapio cardapio = listCardapio.get(position);

        //infla o layout xml para a nossa lista, param1: novo layout criado para o adapter;
        // param2: dizendo qual é o pai da view;
        // param3: attachToRoot - false(normalmente é sempre falso)
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);

        //referenciando os componentes
        TextView textViewTitulo = view.findViewById(R.id.textview_title);
        CheckBox checkBox = view.findViewById(R.id.checkbox_pedir);

        //mudando o status do checkBox
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                cardapio.setStatus(isChecked);
                Toast.makeText(context, "Selecionado: "+cardapio.getNomeItem()+" - "+cardapio.getPrecoItem(), Toast.LENGTH_SHORT).show();


            }
        });

        //passando os dados a cada item em seu respectivo componente
        textViewTitulo.setText(cardapio.getNomeItem()+" - "+cardapio.getPrecoItem());
        checkBox.setChecked(cardapio.getStatus());


        return view;
    }
}
