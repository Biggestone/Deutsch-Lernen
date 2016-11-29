package com.example.f0122305.testgr;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EscolhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setVisibility(View.INVISIBLE);
        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        createButtons();
    }

    private void createButtons(){


        Button button[] = new Button[20];
        int RIds[] = generateRIds();

        for (int  i = 0;i < button.length; i++){
            button[i] =(Button)findViewById(RIds[i]);
            button[i].setText(String.valueOf(i+1));

            final int index = i+1;

            button[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(EscolhaActivity.this,QuestionSwipeActivity.class);
                    startActivity(intent);
                }
            });
        }
    }

    private int[] generateRIds() {
        int rId[]={R.id.mButton0,
                R.id.mButton1,
                R.id.mButton2,
                R.id.mButton3,
                R.id.mButton4,
                R.id.mButton5,
                R.id.mButton6,
                R.id.mButton7,
                R.id.mButton8,
                R.id.mButton9,
                R.id.mButton10,
                R.id.mButton11,
                R.id.mButton12,
                R.id.mButton13,
                R.id.mButton14,
                R.id.mButton15,
                R.id.mButton16,
                R.id.mButton17,
                R.id.mButton18,
                R.id.mButton19};
        return rId;}
}
