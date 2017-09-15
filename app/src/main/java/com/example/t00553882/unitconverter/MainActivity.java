package com.example.t00553882.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText editText;
    private Spinner sp1;
    private Spinner sp2;
    private Button bttn;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        sp1 = (Spinner) findViewById(R.id.spinner2);
        sp2 = (Spinner) findViewById(R.id.spinner3);
        bttn = (Button) findViewById(R.id.button);
        txt = (TextView) findViewById(R.id.textView4);


        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (!editText.getText().toString().isEmpty()) {

                    if (sp1.getSelectedItem().toString() == sp2.getSelectedItem().toString()) {
                        Toast.makeText(getApplicationContext(), "No conversion needed", Toast.LENGTH_LONG).show();
                    } else {

                        if (sp1.getSelectedItem().toString().contains("Celsius")) { //&& sp2.getSelectedItem().toString().contains("Fahrenheit")) {
                            int value = (((Integer.parseInt(editText.getText().toString())) * 9) / 5) + 32;
                            txt.setText("" + value);

                        } else {
                            int value1 = ((Integer.parseInt(editText.getText().toString()) - 32) * 5 / 9);
                            txt.setText("" + value1);

                        }
                    }
                } else{

                    Toast.makeText(getApplicationContext(), "Please enter value", Toast.LENGTH_LONG).show();

                }
                    }
        });

    }



}


