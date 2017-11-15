package com.sergiobt.lab1punto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



    private EditText eLado;
    private Button bCalcular;
    private TextView tResultados;
    private RadioButton rCuadro,rCirculo,rTriangulo,rCubo;
    private double perimetro,vol,lado;
    private double area;
    private String volumen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eLado = (EditText) findViewById(R.id.eLado);
        bCalcular = (Button) findViewById(R.id.bCalcular);
        rCuadro = (RadioButton) findViewById(R.id.rCuadro);
        rCirculo = (RadioButton) findViewById(R.id.rCirculo);
        rTriangulo = (RadioButton) findViewById(R.id.rTriangulo);
        rCubo = (RadioButton) findViewById(R.id.rCubo);
        tResultados = (TextView) findViewById(R.id.tResultados);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (rCuadro.isChecked()){
                    lado = Double.parseDouble(eLado.getText().toString());
                    perimetro= 0;
                    area = 0;
                    perimetro = lado*4;
                    area = lado*lado;
                    volumen = "No aplica";
                    tResultados.setText( "Perimetro: " + String.valueOf(String.format("%.3f",perimetro)) + " \nArea: " + String.valueOf(String.format("%.3f",area)) + "\nVolumen" + volumen );
                } else if (rCirculo.isChecked()){
                        perimetro = 2*3.1416*(Integer.parseInt(eLado.getText().toString()));
                        area = 3.1416*(Integer.parseInt(eLado.getText().toString()))*(Integer.parseInt(eLado.getText().toString()));
                        volumen = "No aplica";
                    tResultados.setText( "Perimetro: " + String.valueOf(String.format("%.3f",perimetro)) + " \nArea: " + String.valueOf(String.format("%.3f",area)) + "\nVolumen" + volumen );

                    }
                    else  if (rTriangulo.isChecked()){
                            perimetro = (Integer.parseInt(eLado.getText().toString()))*3;
                            area = (Math.sqrt(3)*Math.pow(Integer.parseInt(eLado.getText().toString()),2))/4;
                            volumen = "No aplica";
                    tResultados.setText( "Perimetro: " + String.valueOf(String.format("%.3f",perimetro)) + " \nArea: " + String.valueOf(String.format("%.3f",area)) + "\nVolumen" + volumen );

                        }

                        else if (rCubo.isChecked()){
                    perimetro = (Integer.parseInt(eLado.getText().toString()))*12;
                    area = Integer.parseInt(eLado.getText().toString())*Integer.parseInt(eLado.getText().toString())*6;
                    vol = Integer.parseInt(eLado.getText().toString())*Integer.parseInt(eLado.getText().toString())*Integer.parseInt(eLado.getText().toString());
                    volumen = Double.toString(vol);
                    tResultados.setText( "Perimetro: " + String.valueOf(String.format("%.3f",perimetro)) + " \nArea: " + String.valueOf(String.format("%.3f",area)) + "\nVolumen" + volumen );


                }

                }





    });



}


}
