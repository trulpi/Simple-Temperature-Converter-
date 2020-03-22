package com.example.offline022200;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        Button tmbutton = (Button) findViewById(R.id.tmbutton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chk();

            }
        });

        tmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnv();
            }
        });
    }
    public void chk(){
        Intent in = new Intent(this,Main2Activity.class);
        startActivity(in);

    }

    public void cnv(){
        Intent in = new Intent(this,Temp.class);
        startActivity(in);

    }


}
