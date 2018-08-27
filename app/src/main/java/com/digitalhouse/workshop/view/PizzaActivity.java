package com.digitalhouse.workshop.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.digitalhouse.workshop.R;

public class PizzaActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private CheckBox checkMarguerita;
    private CheckBox checkToscana;
    private CheckBox checkFrango;
    private TextView totalGeral;
    private Button  botaoFinalizar;
    float total = 0F;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        checkMarguerita = findViewById(R.id.checkboxMarguerita);
        checkToscana = findViewById(R.id.checkboxToscana);
        checkFrango = findViewById(R.id.checkboxFrango);
        botaoFinalizar = findViewById(R.id.btnFinalizar);
        totalGeral = findViewById(R.id.txtTotalGeral);

        checkMarguerita.setOnCheckedChangeListener(this);
        checkToscana.setOnCheckedChangeListener(this);
        checkFrango.setOnCheckedChangeListener(this);

        botaoFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PizzaActivity.this, "Pedido Finalizado com sucesso!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void finalizarPedido(View view){

        if(checkMarguerita.isChecked()){
            total+= Float.parseFloat(checkMarguerita.getText().toString());
        }

        if(checkToscana.isChecked()){
            total+= Float.parseFloat(checkToscana.getText().toString());
        }

        if(checkFrango.isChecked()){
            total+= Float.parseFloat(checkFrango.getText().toString());
        }

        totalGeral.setText("TOTAL: R$ "+ total);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        finalizarPedido(null);
    }
}
