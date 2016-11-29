package com.example.f0122305.testgr;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class QuestionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //ListView listView = (ListView)findViewById(R.id.listViewQuestionsActivity);
        //List<String> listOfAnswer = loadListOfAnswer();
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,listOfAnswer);


        //ViewPager pager =(ViewPager)findViewById(R.id.questionActivityPager);

        //pager.setAdapter(new PageAdapter(getSupportFragmentManager()));

        //listView.setAdapter(adapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setVisibility(View.INVISIBLE);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private List<String> loadListOfAnswer(){
        List<String> lista = new ArrayList<String>();
        lista.add("a) Resposta 1");
        lista.add("b) Resposta 2");
        lista.add("c) Resposta 3");
        lista.add("d) Resposta 4");
        lista.add("e) Resposta 5");
    return lista;}

}
