package com.example.estudiante.ejerciciosemana3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //alt+enter para importar
    EditText et_masa;
    EditText et_altura;
    TextView tv_imc;
    Button btn_calcular;
    TextView tv_resultado;
    String nombreUsuario;
    private EditText edtUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombreUsuario = "NA";

        et_masa = findViewById(R.id.et_masa);
        et_altura = findViewById(R.id.et_altura);
        tv_imc = findViewById(R.id.tv_imc);
        btn_calcular = findViewById(R.id.btn_calcular);
        tv_resultado = findViewById(R.id.tv_resultado);

        //control+espacio
        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String masa = et_masa.getText().toString();
                int a = Integer.parseInt(masa);
                //tv_imc.setText("Hola "+masa);
                double newA = Math.pow(a, 2);
                tv_resultado.setText("Hola " + newA);

                Toast.makeText(MainActivity.this, "Hola "+ newA, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onClick(View view){
        Intent intento = new Intent(getApplicationContext(), Menu.class);
        nombreUsuario = edtUserName.getText().toString();
        intento.putExtra("usuario", nombreUsuario);
        startActivity(intento);

    }
}
