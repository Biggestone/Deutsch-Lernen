package com.example.f0122305.testgr;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setVisibility(View.INVISIBLE);
        generateButtons();
        /*fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EscolhaActivity.class);
                startActivity(intent);
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    private void generateButtons(){
        int [] buttonArray = loadButtonsIntoArray();
        for(int i=0;i<buttonArray.length;i++){
            Button button = (Button)findViewById(buttonArray[i]);
            final String nivel = String.valueOf(button.getText());
            final int aux = i+1;
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, EscolhaActivity.class);
                    intent.putExtra("nivel",nivel);
                    startActivity(intent);
                }
            });
        }
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };


    public int[] loadButtonsIntoArray(){
        int [] buttons = {R.id.mainButtonFacil,
                R.id.mainButtonIntermediario,
                R.id.mainButtonAvancado,
        R.id.mainButtonAvancado,
        R.id.mainButtonOutroApp,
        R.id.mainButtonAvaliar};
    return buttons;}
}
