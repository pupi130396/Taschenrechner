package com.example.haris.dividieren;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Haris on 10.03.2017.
 */

public class activityname extends Activity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dividend = (EditText) findViewById(R.id.dividend);
        teiler = (EditText) findViewById(R.id.teiler);
        ergebnis = (EditText) findViewById(R.id.ergebnis);
    }

    EditText dividend, teiler, ergebnis;
    double div, teil, erg;


    public void onClick(View a){

        if(!dividend.getText().equals("") && !teiler.getText().equals("")) {

            div = Double.parseDouble(dividend.getText().toString());
            teil = Double.parseDouble(teiler.getText().toString());
            erg = div / teil;
            ergebnis.setText("" + erg);
        }
    };

}
