package com.example.practica1_unidad2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtCalificacion;
    Button btnEvaluar;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCalificacion = findViewById(R.id.txtCalificacion);
        btnEvaluar = findViewById(R.id.btnEvaluar);
        tvResultado = findViewById(R.id.tvResultado);

        btnEvaluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor = txtCalificacion.getText().toString();

                if (valor.isEmpty()) {
                    tvResultado.setText("Por favor ingresa una calificación.");
                    return;
                }

                double cal = Double.parseDouble(valor);
                String nivel;

                if (cal < 8) {
                    nivel = "NA";
                } else if (cal >= 8 && cal < 9) {
                    nivel = "SA";
                } else if (cal >= 9 && cal < 10) {
                    nivel = "DE";
                } else if (cal == 10) {
                    nivel = "AU";
                } else {
                    nivel = "Calificación no válida";
                }

                tvResultado.setText("Nivel de aprovechamiento: " + nivel);
            }
        });
    }
}
