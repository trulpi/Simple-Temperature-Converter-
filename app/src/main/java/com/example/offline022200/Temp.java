package com.example.offline022200;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Temp extends AppCompatActivity {

    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        Button cTf = (Button) findViewById(R.id.cTof);
        Button fTc = (Button) findViewById(R.id.fToc);
        final TextView rslt = (TextView) findViewById(R.id.rslt);
        final EditText entTemp = (EditText) findViewById(R.id.entTmp);

        cTf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double temp = Double.parseDouble(entTemp.getText().toString());
                result = (temp*1.8)+32;
                rslt.setText(String.valueOf(result));

            }
        });

        fTc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double temp = Double.parseDouble(entTemp.getText().toString());
                result = (temp-32)/1.8;
                rslt.setText(String.valueOf(result));

            }
        });
    }
}
