package br.ulbra.appaula2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    EditText edtevento, edtvalordepessoas, edtvalortotal;
    TextView edtresultado;
    Button btnCalcular;
    double v1, result;
    int v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtresultado = (EditText) findViewById(R.id.edtresultado);
        edtevento = (EditText) findViewById(R.id.edtevento);
        edtvalordepessoas = (EditText) findViewById(R.id.edtvalordepessoas);
        edtvalortotal = (EditText) findViewById(R.id.edtvalortotal);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Double.parseDouble(edtvalortotal.getText().toString());
                v2 = Integer.parseInt(edtvalordepessoas.getText().toString());
                result = v1 / v2;
                edtresultado.setText("Resultado: " + result);
            }

        });
    }
}







