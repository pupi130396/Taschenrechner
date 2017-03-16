package com.example.haris.dividieren;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Haris on 10.03.2017.
 */

public class activityname extends Activity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dividend = (EditText) findViewById(R.id.dividend);
        teiler = (EditText) findViewById(R.id.teiler);
        ergebnis = (TextView) findViewById(R.id.ergebnis);
        berechne = (Button) findViewById(R.id.button);
    }

    EditText dividend, teiler;
    TextView ergebnis;
    double div, teil, erg;
    Button berechne;
    String text = "Bitte Werte eingeben!";
    int duration = Toast.LENGTH_LONG;



    public void rechnen(View a){

        try{
            div = Double.parseDouble(dividend.getText().toString());
            teil = Double.parseDouble(teiler.getText().toString());
            erg = div / teil;
        ergebnis.setText("" + erg);
            View view = this.getCurrentFocus();
            if (view != null) {
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0); }
        }
        catch(Exception e) {
            Toast.makeText(getApplicationContext(), "Bitte Werte eingeben", duration).show();
        }

    }


    ;

}
