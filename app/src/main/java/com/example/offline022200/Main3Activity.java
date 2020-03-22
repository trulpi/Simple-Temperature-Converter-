package com.example.offline022200;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class Main3Activity extends AppCompatActivity {

    private boolean tbl_flg = false;
    ///////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button button5 = findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Next();
            }
        });
    }

    public void Next(){
        Intent in = new Intent(this,Main4Activity.class);
        startActivity(in);
    }
    public void collapseTable(View v){
        TableLayout tbl = findViewById(R.id.table);
        Button button4 = findViewById(R.id.button4);


        tbl.setColumnCollapsed(1,tbl_flg);
        tbl.setColumnCollapsed(2,tbl_flg);

        if(tbl_flg){
            tbl_flg = false;
            button4.setText("Show Detail");
        }
        else {
            tbl_flg = true;
            button4.setText("Hide Detail");
        }

    }
}
