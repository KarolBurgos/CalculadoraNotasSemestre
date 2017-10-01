package com.example.sistemas.mycalculonotas;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Context;
import android.content.SharedPreferences;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText ett1,ett2,ett3;
    private EditText ett5,ett6,ett7;
    private EditText ett10,ett11,ett12;
    private EditText ett15,ett16,ett17;
    private EditText ett20,ett21,ett22;
    private EditText ett31,ett32,ett33;
    private EditText ett4,ett8,ett13,ett18,ett23,ett34;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //total materias
        ett4 = (EditText) findViewById(R.id.et4);
        ett4.setEnabled(false);
        ett8 = (EditText) findViewById(R.id.et8);
        ett8.setEnabled(false);
        ett13=(EditText)findViewById(R.id.et13);
        ett13.setEnabled(false);
        ett18=(EditText)findViewById(R.id.et18);
        ett18.setEnabled(false);
        ett23=(EditText)findViewById(R.id.et23);
        ett23.setEnabled(false);
        ett34=(EditText)findViewById(R.id.et34);
        ett34.setEnabled(false);

        //Primera materia Aplicaciones android
        ett1 = (EditText) findViewById(R.id.et1);
        ett2 = (EditText) findViewById(R.id.et2);
        ett3 = (EditText) findViewById(R.id.et3);

        //Primer editext de android

            ett1.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }


                @Override
                public void afterTextChanged(Editable editable) {

                    try
                    {
                    String edi1 = ett1.getText().toString();
                    double edii1 = Double.valueOf(edi1).doubleValue();


                    String edi2 = ett2.getText().toString();
                    double edii2 = Double.valueOf(edi2).doubleValue();


                    String edi3 = ett3.getText().toString();
                    double edii3 = Double.valueOf(edi3).doubleValue();

                        if(edii1<=5.0){
                            double resulta = (edii1 * 0.3) + (edii2 * 0.3) + (edii3 * 0.4);
                            double res=(resulta*100)/100;
                            String resu = String.valueOf(res);
                            ett4.setText(resu);
                        }
                        else if(edii1>5.0){
                            Toast toas = Toast.makeText(MainActivity.this,"El numero debe ser menor a 5", Toast.LENGTH_LONG);
                            toas.show();

                        }

                    }
                    catch (Exception e)
                    {
                        if(ett1.getText().toString().equals("")||ett2.getText().toString().equals("")||ett3.getText().toString().equals(""))
                        {
                            Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                            //toas.show();
                        }


                    }
                    SharedPreferences preferencias=getSharedPreferences("datos",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=preferencias.edit();
                    editor.putString("mail", ett1.getText().toString());
                    editor.commit();

                }
            });

            ett2.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


                }

                @Override
                public void afterTextChanged(Editable editable) {

                    try
                    {
                        String edi1 = ett1.getText().toString();
                        double edii1 = Double.valueOf(edi1).doubleValue();


                        String edi2 = ett2.getText().toString();
                        double edii2 = Double.valueOf(edi2).doubleValue();


                        String edi3 = ett3.getText().toString();
                        double edii3 = Double.valueOf(edi3).doubleValue();


                        if(edii2<=5.0){
                            double resulta = (edii1 * 0.3) + (edii2 * 0.3) + (edii3 * 0.4);
                            double res=(resulta*100)/100;
                            String resu = String.valueOf(res);
                            ett4.setText(resu);
                        }
                        else if(edii2>5.0){
                            Toast toas = Toast.makeText(MainActivity.this,"El numero debe ser menor a 5", Toast.LENGTH_LONG);
                            toas.show();

                        }
                    }
                    catch (Exception e)
                    {
                        if(ett1.getText().toString().equals("")||ett2.getText().toString().equals("")||ett3.getText().toString().equals(""))
                        {
                            Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                            //toas.show();

                        }
                    }

                    SharedPreferences preferencias1=getSharedPreferences("datos",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor1=preferencias1.edit();
                    editor1.putString("mail2", ett2.getText().toString());
                    editor1.commit();

                }
            });
            ett3.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {

                    try
                    {
                        String edi1 = ett1.getText().toString();
                        double edii1 = Double.valueOf(edi1).doubleValue();


                        String edi2 = ett2.getText().toString();
                        double edii2 = Double.valueOf(edi2).doubleValue();


                        String edi3 = ett3.getText().toString();
                        double edii3 = Double.valueOf(edi3).doubleValue();


                        if(edii3<=5.0&&edii2<=5.0&&edii1<=5.0){
                            double resulta = (edii1 * 0.3) + (edii2 * 0.3) + (edii3 * 0.4);
                            double res=(resulta*100)/100;
                            String resu = String.valueOf(res);
                            ett4.setText(resu);
                        }
                        else {
                            Toast toas = Toast.makeText(MainActivity.this,"El numero debe ser menor a 5", Toast.LENGTH_LONG);
                            toas.show();
                            if(edii3>5.0){
                                ett3.setText("");
                            }
                            if(edii2>5.0){
                                ett2.setText("");
                            }
                            if(edii1>5.0){
                                ett1.setText("");
                            }

                        }
                    }
                    catch (Exception e)
                    {
                        if(ett1.getText().toString().equals("")||ett2.getText().toString().equals("")||ett3.getText().toString().equals(""))
                        {
                            Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                            //toas.show();
                        }
                    }

                    SharedPreferences preferencias2=getSharedPreferences("datos",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor2=preferencias2.edit();
                    editor2.putString("mail3", ett3.getText().toString());
                    editor2.commit();
                }
            });

        //Segunda materia Aplicaciones android
        ett5=(EditText)findViewById(R.id.et5);
        ett6=(EditText)findViewById(R.id.et6);
        ett7=(EditText)findViewById(R.id.et7);


        ett5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try{


                String edi5 = ett5.getText().toString();
                double edii5=Double.valueOf(edi5).doubleValue();


                String edi6 = ett6.getText().toString();
                double edii6=Double.valueOf(edi6).doubleValue();


                String edi7 = ett7.getText().toString();
                double edii7=Double.valueOf(edi7).doubleValue();


                    if(edii5<=5.0){
                        double resulta = (edii5 * 0.3) + (edii6 * 0.3) + (edii7 * 0.4);
                        double res=(resulta*100)/100;
                        String resu = String.valueOf(res);
                        ett8.setText(resu);
                    }
                    else if(edii5>5.0){
                        Toast toas = Toast.makeText(MainActivity.this,"El numero debe ser menor a 5", Toast.LENGTH_LONG);
                        toas.show();

                    }
            }
                catch (Exception e)
                {
                    if(ett5.getText().toString().equals("")||ett6.getText().toString().equals("")||ett7.getText().toString().equals(""))
                    {
                        Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                        //toas.show();
                    }
                }
                SharedPreferences preferencias2=getSharedPreferences("datos",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2=preferencias2.edit();
                editor2.putString("mail5", ett5.getText().toString());
                editor2.commit();
            }
        });

        ett6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try{


                    String edi5 = ett5.getText().toString();
                    double edii5=Double.valueOf(edi5).doubleValue();


                    String edi6 = ett6.getText().toString();
                    double edii6=Double.valueOf(edi6).doubleValue();


                    String edi7 = ett7.getText().toString();
                    double edii7=Double.valueOf(edi7).doubleValue();

                    if(edii6<=5.0){
                        double resulta = (edii5 * 0.3) + (edii6 * 0.3) + (edii7 * 0.4);
                        double res=(resulta*100)/100;
                        String resu = String.valueOf(res);
                        ett8.setText(resu);
                    }
                    else if(edii6>5.0){
                        Toast toas = Toast.makeText(MainActivity.this,"El numero debe ser menor a 5", Toast.LENGTH_LONG);
                        toas.show();

                    }
                }
                catch (Exception e)
                {
                    if(ett5.getText().toString().equals("")||ett6.getText().toString().equals("")||ett7.getText().toString().equals(""))
                    {
                        Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                        //toas.show();
                    }
                }
                SharedPreferences preferencias2=getSharedPreferences("datos",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2=preferencias2.edit();
                editor2.putString("mail6", ett6.getText().toString());
                editor2.commit();

            }
        });
        ett7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try{


                    String edi5 = ett5.getText().toString();
                    double edii5=Double.valueOf(edi5).doubleValue();


                    String edi6 = ett6.getText().toString();
                    double edii6=Double.valueOf(edi6).doubleValue();


                    String edi7 = ett7.getText().toString();
                    double edii7=Double.valueOf(edi7).doubleValue();


                    if(edii5<=5.0&&edii6<=5.0&&edii7<=5.0){
                        double resulta = (edii5 * 0.3) + (edii6 * 0.3) + (edii7 * 0.4);
                        double res=(resulta*100)/100;
                        String resu = String.valueOf(res);
                        ett8.setText(resu);
                    }
                    else{
                        Toast toas = Toast.makeText(MainActivity.this,"No se permiten numeros mayores de cinco", Toast.LENGTH_LONG);
                        toas.show();
                        if(edii5>5.0){
                            ett5.setText("");
                        }
                        if(edii6>5.0){
                            ett6.setText("");
                        }
                        if(edii7>5.0){
                            ett7.setText("");
                        }
                    }
                }
                catch (Exception e)
                {
                    if(ett5.getText().toString().equals("")||ett6.getText().toString().equals("")||ett7.getText().toString().equals(""))
                    {
                        Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                        //toas.show();
                    }
                }

                SharedPreferences preferencias2=getSharedPreferences("datos",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2=preferencias2.edit();
                editor2.putString("mail7", ett7.getText().toString());
                editor2.commit();
            }
        });

        //Tercer materia Aplicaciones android
        ett10=(EditText)findViewById(R.id.et10);
        ett11=(EditText)findViewById(R.id.et11);
        ett12=(EditText)findViewById(R.id.et12);

        ett10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try{


                    String edi10 = ett10.getText().toString();
                    double edii10=Double.valueOf(edi10).doubleValue();


                    String edi11 = ett11.getText().toString();
                    double edii11=Double.valueOf(edi11).doubleValue();


                    String edi12 = ett12.getText().toString();
                    double edii12=Double.valueOf(edi12).doubleValue();

                    if(edii10<=5.0){
                        double resulta = (edii10 * 0.3) + (edii11 * 0.3) + (edii12 * 0.4);
                        double res=(resulta*100)/100;
                        String resu = String.valueOf(res);
                        ett13.setText(resu);
                    }
                    else if(edii10>5.0){
                        Toast toas = Toast.makeText(MainActivity.this,"El numero debe ser menor a 5", Toast.LENGTH_LONG);
                        toas.show();

                    }
                }
                catch (Exception e)
                {
                    if(ett10.getText().toString().equals("")||ett11.getText().toString().equals("")||ett12.getText().toString().equals(""))
                    {
                        Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                        //toas.show();
                    }
                }

                SharedPreferences preferencias2=getSharedPreferences("datos",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2=preferencias2.edit();
                editor2.putString("mail10", ett10.getText().toString());
                editor2.commit();
            }
        });

        ett11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try{


                    String edi10 = ett10.getText().toString();
                    double edii10=Double.valueOf(edi10).doubleValue();


                    String edi11 = ett11.getText().toString();
                    double edii11=Double.valueOf(edi11).doubleValue();


                    String edi12 = ett12.getText().toString();
                    double edii12=Double.valueOf(edi12).doubleValue();


                    if(edii11<=5.0){
                        double resulta = (edii10 * 0.3) + (edii11 * 0.3) + (edii12 * 0.4);
                        double res=(resulta*100)/100;
                        String resu = String.valueOf(res);
                        ett13.setText(resu);
                    }
                    else if(edii11>5.0){
                        Toast toas = Toast.makeText(MainActivity.this,"El numero debe ser menor a 5", Toast.LENGTH_LONG);
                        toas.show();

                    }
                }
                catch (Exception e)
                {
                    if(ett10.getText().toString().equals("")||ett11.getText().toString().equals("")||ett12.getText().toString().equals(""))
                    {
                        Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                        //toas.show();
                    }
                }

                SharedPreferences preferencias2=getSharedPreferences("datos",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2=preferencias2.edit();
                editor2.putString("mail11", ett11.getText().toString());
                editor2.commit();
            }
        });

        ett12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try{


                    String edi10 = ett10.getText().toString();
                    double edii10=Double.valueOf(edi10).doubleValue();


                    String edi11 = ett11.getText().toString();
                    double edii11=Double.valueOf(edi11).doubleValue();


                    String edi12 = ett12.getText().toString();
                    double edii12=Double.valueOf(edi12).doubleValue();

                    if(edii10<=5.0&&edii11<=5.0&&edii12<=5.0){
                        double resulta = (edii10 * 0.3) + (edii11 * 0.3) + (edii12 * 0.4);
                        double res=(resulta*100)/100;
                        String resu = String.valueOf(res);
                        ett13.setText(resu);
                    }
                    else {
                        Toast toas = Toast.makeText(MainActivity.this,"No se pemiten numeros mayores a 5", Toast.LENGTH_LONG);
                        toas.show();
                        if(edii10>5.0){
                            ett10.setText("");
                        }
                        if(edii11>5.0){
                            ett11.setText("");
                        }
                        if(edii12>5.0){
                            ett12.setText("");
                        }
                    }
                }
                catch (Exception e)
                {
                    if(ett10.getText().toString().equals("")||ett11.getText().toString().equals("")||ett12.getText().toString().equals(""))
                    {
                        Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                        //toas.show();
                    }
                }
                SharedPreferences preferencias2=getSharedPreferences("datos",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2=preferencias2.edit();
                editor2.putString("mail12", ett12.getText().toString());
                editor2.commit();

            }
        });

        //Cuarta materia Aplicaciones android
        ett15=(EditText)findViewById(R.id.et15);
        ett16=(EditText)findViewById(R.id.et16);
        ett17=(EditText)findViewById(R.id.et17);

        ett15.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try{


                    String edi15 = ett15.getText().toString();
                    double edii15=Double.valueOf(edi15).doubleValue();


                    String edi16 = ett16.getText().toString();
                    double edii16=Double.valueOf(edi16).doubleValue();


                    String edi17 = ett17.getText().toString();
                    double edii17=Double.valueOf(edi17).doubleValue();

                    if(edii15<=5.0){
                        double resulta = (edii15 * 0.3) + (edii16 * 0.3) + (edii17 * 0.4);
                        double res=(resulta*100)/100;
                        String resu = String.valueOf(res);
                        ett18.setText(resu);
                    }
                    else if(edii15>5.0){
                        Toast toas = Toast.makeText(MainActivity.this,"El numero debe ser menor a 5", Toast.LENGTH_LONG);
                        toas.show();

                    }
                }
                catch (Exception e)
                {
                    if(ett15.getText().toString().equals("")||ett16.getText().toString().equals("")||ett17.getText().toString().equals(""))
                    {
                        Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                        //toas.show();
                    }
                }

                SharedPreferences preferencias2=getSharedPreferences("datos",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2=preferencias2.edit();
                editor2.putString("mail15", ett15.getText().toString());
                editor2.commit();
            }
        });
        ett16.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try{


                    String edi15 = ett15.getText().toString();
                    double edii15=Double.valueOf(edi15).doubleValue();


                    String edi16 = ett16.getText().toString();
                    double edii16=Double.valueOf(edi16).doubleValue();


                    String edi17 = ett17.getText().toString();
                    double edii17=Double.valueOf(edi17).doubleValue();


                    if(edii16<=5.0){
                        double resulta = (edii15 * 0.3) + (edii16 * 0.3) + (edii17 * 0.4);
                        double res=(resulta*100)/100;
                        String resu = String.valueOf(res);
                        ett18.setText(resu);
                    }
                    else if(edii16>5.0){
                        Toast toas = Toast.makeText(MainActivity.this,"El numero debe ser menor a 5", Toast.LENGTH_LONG);
                        toas.show();

                    }
                }
                catch (Exception e)
                {
                    if(ett15.getText().toString().equals("")||ett16.getText().toString().equals("")||ett17.getText().toString().equals(""))
                    {
                        Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                        //toas.show();
                    }
                }
                SharedPreferences preferencias2=getSharedPreferences("datos",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2=preferencias2.edit();
                editor2.putString("mail16", ett16.getText().toString());
                editor2.commit();

            }
        });
        ett17.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try{


                    String edi15 = ett15.getText().toString();
                    double edii15=Double.valueOf(edi15).doubleValue();


                    String edi16 = ett16.getText().toString();
                    double edii16=Double.valueOf(edi16).doubleValue();


                    String edi17 = ett17.getText().toString();
                    double edii17=Double.valueOf(edi17).doubleValue();

                    if(edii15<=5.0&&edii16<=5.0&&edii17<=5.0){
                        double resulta = (edii15 * 0.3) + (edii16 * 0.3) + (edii17 * 0.4);
                        double res=(resulta*100)/100;
                        String resu = String.valueOf(res);
                        ett18.setText(resu);
                    }
                    else{
                        Toast toas = Toast.makeText(MainActivity.this,"El numero debe ser menor a 5", Toast.LENGTH_LONG);
                        toas.show();
                        if(edii15>5.0){
                            ett15.setText("");
                        }
                        if(edii16>5.0){
                            ett16.setText("");
                        }
                        if(edii17>5.0){
                            ett17.setText("");
                        }

                    }
                }
                catch (Exception e)
                {
                    if(ett15.getText().toString().equals("")||ett16.getText().toString().equals("")||ett17.getText().toString().equals(""))
                    {
                        Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                        //toas.show();
                    }
                }
                SharedPreferences preferencias2=getSharedPreferences("datos",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2=preferencias2.edit();
                editor2.putString("mail17", ett17.getText().toString());
                editor2.commit();

            }
        });

        //Quinta materia Aplicaciones android
        ett20=(EditText)findViewById(R.id.et20);
        ett21=(EditText)findViewById(R.id.et21);
        ett22=(EditText)findViewById(R.id.et22);

        ett20.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try{


                    String edi20 = ett20.getText().toString();
                    double edii20=Double.valueOf(edi20).doubleValue();


                    String edi21 = ett21.getText().toString();
                    double edii21=Double.valueOf(edi21).doubleValue();


                    String edi22 = ett22.getText().toString();
                    double edii22=Double.valueOf(edi22).doubleValue();
                    if(edii20<=5.0){
                        double resulta = (edii20 * 0.3) + (edii21 * 0.3) + (edii22 * 0.4);
                        double res=(resulta*100)/100;
                        String resu = String.valueOf(res);
                        ett23.setText(resu);
                    }
                    else if(edii20>5.0){
                        Toast toas = Toast.makeText(MainActivity.this,"El numero debe ser menor a 5", Toast.LENGTH_LONG);
                        toas.show();

                    }
                }
                catch (Exception e)
                {
                    if(ett20.getText().toString().equals("")||ett21.getText().toString().equals("")||ett22.getText().toString().equals(""))
                    {
                        Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                        //toas.show();
                    }
                }
                SharedPreferences preferencias2=getSharedPreferences("datos",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2=preferencias2.edit();
                editor2.putString("mail20", ett20.getText().toString());
                editor2.commit();

            }
        });

        ett21.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try{


                    String edi20 = ett20.getText().toString();
                    double edii20=Double.valueOf(edi20).doubleValue();


                    String edi21 = ett21.getText().toString();
                    double edii21=Double.valueOf(edi21).doubleValue();


                    String edi22 = ett22.getText().toString();
                    double edii22=Double.valueOf(edi22).doubleValue();

                    if(edii21<=5.0){
                        double resulta = (edii20 * 0.3) + (edii21 * 0.3) + (edii22 * 0.4);
                        double res=(resulta*100)/100;
                        String resu = String.valueOf(res);
                        ett23.setText(resu);
                    }
                    else if(edii21>5.0){
                        Toast toas = Toast.makeText(MainActivity.this,"El numero debe ser menor a 5", Toast.LENGTH_LONG);
                        toas.show();

                    }
                }
                catch (Exception e)
                {
                    if(ett20.getText().toString().equals("")||ett21.getText().toString().equals("")||ett22.getText().toString().equals(""))
                    {
                        Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                        //toas.show();
                    }
                }

                SharedPreferences preferencias2=getSharedPreferences("datos",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2=preferencias2.edit();
                editor2.putString("mail21", ett21.getText().toString());
                editor2.commit();
            }
        });

        ett22.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try{


                    String edi20 = ett20.getText().toString();
                    double edii20=Double.valueOf(edi20).doubleValue();


                    String edi21 = ett21.getText().toString();
                    double edii21=Double.valueOf(edi21).doubleValue();


                    String edi22 = ett22.getText().toString();
                    double edii22=Double.valueOf(edi22).doubleValue();

                    if(edii20<=5.0&&edii21<=5.0&&edii22<=5.0){
                        double resulta = (edii20 * 0.3) + (edii21 * 0.3) + (edii22 * 0.4);
                        double res=(resulta*100)/100;
                        String resu = String.valueOf(res);
                        ett23.setText(resu);
                    }
                    else{
                        Toast toas = Toast.makeText(MainActivity.this,"El numero debe ser menor a 5", Toast.LENGTH_LONG);
                        toas.show();

                        if(edii20>5.0){
                            ett20.setText("");
                        }
                        if(edii21>5.0){
                            ett21.setText("");
                        }
                        if(edii22>5.0){
                            ett22.setText("");
                        }
                    }
                }
                catch (Exception e)
                {
                    if(ett20.getText().toString().equals("")||ett21.getText().toString().equals("")||ett22.getText().toString().equals(""))
                    {
                        Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                        //toas.show();
                    }
                }
                SharedPreferences preferencias2=getSharedPreferences("datos",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2=preferencias2.edit();
                editor2.putString("mail22", ett22.getText().toString());
                editor2.commit();

            }
        });

        //Sexta materia Aplicaciones android
        ett31=(EditText)findViewById(R.id.et31);
        ett32=(EditText)findViewById(R.id.et32);
        ett33=(EditText)findViewById(R.id.et33);

        ett31.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try{


                    String edi31 = ett31.getText().toString();
                    double edii31=Double.valueOf(edi31).doubleValue();


                    String edi32 = ett32.getText().toString();
                    double edii32=Double.valueOf(edi32).doubleValue();


                    String edi33 = ett33.getText().toString();
                    double edii33=Double.valueOf(edi33).doubleValue();


                    if(edii31<=5.0){
                        double resulta = (edii31 * 0.3) + (edii32 * 0.3) + (edii33 * 0.4);
                        double res=(resulta*100)/100;
                        String resu = String.valueOf(res);
                        ett34.setText(resu);
                    }
                    else if(edii31>5.0){
                        Toast toas = Toast.makeText(MainActivity.this,"El numero debe ser menor a 5", Toast.LENGTH_LONG);
                        toas.show();

                    }
                }
                catch (Exception e)
                {
                    if(ett31.getText().toString().equals("")||ett32.getText().toString().equals("")||ett33.getText().toString().equals(""))
                    {
                        Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                       // toas.show();
                    }
                }
                SharedPreferences preferencias2=getSharedPreferences("datos",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2=preferencias2.edit();
                editor2.putString("mai131", ett31.getText().toString());
                editor2.commit();

            }
        });
        ett32.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try{


                    String edi31 = ett31.getText().toString();
                    double edii31=Double.valueOf(edi31).doubleValue();


                    String edi32 = ett32.getText().toString();
                    double edii32=Double.valueOf(edi32).doubleValue();


                    String edi33 = ett33.getText().toString();
                    double edii33=Double.valueOf(edi33).doubleValue();

                    if(edii32<=5.0){
                        double resulta = (edii31 * 0.3) + (edii32 * 0.3) + (edii33 * 0.4);
                        double res=(resulta*100)/100;
                        String resu = String.valueOf(res);
                        ett34.setText(resu);
                    }
                    else if(edii32>5.0){
                        Toast toas = Toast.makeText(MainActivity.this,"El numero debe ser menor a 5", Toast.LENGTH_LONG);
                        toas.show();

                    }
                }
                catch (Exception e)
                {
                    if(ett31.getText().toString().equals("")||ett32.getText().toString().equals("")||ett33.getText().toString().equals(""))
                    {
                        Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                        //toas.show();
                    }
                }

                SharedPreferences preferencias2=getSharedPreferences("datos",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2=preferencias2.edit();
                editor2.putString("mail32", ett32.getText().toString());
                editor2.commit();
            }
        });

        ett33.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                try{


                    String edi31 = ett31.getText().toString();
                    double edii31=Double.valueOf(edi31).doubleValue();


                    String edi32 = ett32.getText().toString();
                    double edii32=Double.valueOf(edi32).doubleValue();


                    String edi33 = ett33.getText().toString();
                    double edii33=Double.valueOf(edi33).doubleValue();

                    if(edii31<=5.0&&edii32<=5.0&&edii33<=5.0){
                        double resulta = (edii31 * 0.3) + (edii32 * 0.3) + (edii33 * 0.4);
                        double res=(resulta*100)/100;
                        String resu = String.valueOf(res);
                        ett34.setText(resu);
                    }
                    else{
                        Toast toas = Toast.makeText(MainActivity.this,"El numero debe ser menor a 5", Toast.LENGTH_LONG);
                        toas.show();
                        if(edii31>5.0){
                            ett31.setText("");
                        }
                        if(edii32>5.0){
                            ett32.setText("");
                        }
                        if(edii33>5.0){
                            ett33.setText("");
                        }
                    }
                }
                catch (Exception e)
                {
                    if(ett31.getText().toString().equals("")||ett32.getText().toString().equals("")||ett33.getText().toString().equals(""))
                    {
                        Toast toas = Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG);
                       // toas.show();
                    }
                }

                SharedPreferences preferencias2=getSharedPreferences("datos",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2=preferencias2.edit();
                editor2.putString("mail33", ett33.getText().toString());
                editor2.commit();
            }
        });

        SharedPreferences prefe=getSharedPreferences("datos", Context.MODE_PRIVATE);
        ett1.setText(prefe.getString("mail",""));
        ett2.setText(prefe.getString("mail2",""));
        ett3.setText(prefe.getString("mail3",""));

        ett5.setText(prefe.getString("mail5",""));
        ett6.setText(prefe.getString("mail6",""));
        ett7.setText(prefe.getString("mail7",""));

        ett10.setText(prefe.getString("mail10",""));
        ett11.setText(prefe.getString("mail11",""));
        ett12.setText(prefe.getString("mail12",""));

        ett15.setText(prefe.getString("mail15",""));
        ett16.setText(prefe.getString("mail16",""));
        ett17.setText(prefe.getString("mail17",""));

        ett20.setText(prefe.getString("mail20",""));
        ett21.setText(prefe.getString("mail21",""));
        ett22.setText(prefe.getString("mail22",""));

        ett31.setText(prefe.getString("mai131",""));
        ett32.setText(prefe.getString("mail32",""));
        ett33.setText(prefe.getString("mail33",""));

    }

    public void ejecutar(View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setMessage("¿Salir?");
        dialog.setCancelable(false);
        dialog.setPositiveButton("Si", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        dialog.setNegativeButton("No", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        dialog.show();

    }

    public void  total(View view){
        try{
        String edi4 = ett4.getText().toString();
        double edii4=Double.valueOf(edi4).doubleValue();

        String edi8 = ett8.getText().toString();
        double edii8=Double.valueOf(edi8).doubleValue();

        String edi13 = ett13.getText().toString();
        double edii13=Double.valueOf(edi13).doubleValue();

        String edi18 = ett18.getText().toString();
        double edii18=Double.valueOf(edi18).doubleValue();

        String edi23 = ett23.getText().toString();
        double edii23=Double.valueOf(edi23).doubleValue();

        String edi34 = ett34.getText().toString();
        double edii34=Double.valueOf(edi34).doubleValue();

        double resulta =((edii4+edii8+edii13+edii18+edii23+edii34)/6);
        DecimalFormat f= new DecimalFormat("0.00");
        String resu=String.valueOf(getResources().getString(R.string.oleve)+f.format(resulta));

            AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
            dialogo1.setTitle(getResources().getString(R.string.obemor));
            dialogo1.setMessage(""+resu);
            dialogo1.setCancelable(false);
            dialogo1.setPositiveButton(getResources().getString(R.string.omedia), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                    aceptar();
                }
            });
            /**dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                    cancelar();
                }
            });*/
            dialogo1.show();
        }
        catch (Exception e)
        {
            if(ett18.getText().toString().equals("")||ett23.getText().toString().equals("")||ett34.getText().toString().equals("")||ett4.getText().toString().equals("")||ett8.getText().toString().equals("")||ett13.getText().toString().equals(""))
            {
                Toast toas = Toast.makeText(MainActivity.this,getResources().getString(R.string.obe), Toast.LENGTH_LONG);
                toas.show();
            }
        }

    }
    public void limpiar(View view){
        ett1.setText("");
        ett2.setText("");
        ett3.setText("");
        ett4.setText("");
        ett5.setText("");
        ett6.setText("");
        ett7.setText("");
        ett8.setText("");
        ett10.setText("");
        ett11.setText("");
        ett12.setText("");
        ett13.setText("");
        ett15.setText("");
        ett16.setText("");
        ett17.setText("");
        ett18.setText("");
        ett20.setText("");
        ett21.setText("");
        ett22.setText("");
        ett23.setText("");
        ett31.setText("");
        ett32.setText("");
        ett33.setText("");
        ett34.setText("");

    }

    public void acercaDe(View view)
    {
        Intent i=new Intent (this,AcercaDe.class);
        startActivity(i);
    }

    public void aceptar() {
       Toast t=Toast.makeText(this,"", Toast.LENGTH_SHORT);
        //t.show();
        //finish();
    }

    public void cancelar() {
        finish();
    }
}
