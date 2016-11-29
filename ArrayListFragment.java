package com.example.f0122305.testgr;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by F0122305 on 28/11/2016.
 */

public class ArrayListFragment extends ListFragment {

    int num;

    static ArrayListFragment newInstance(int num){
        ArrayListFragment arrayListFragment = new ArrayListFragment();

        Bundle extras = new Bundle();
        extras.putInt("num",num);
        arrayListFragment.setArguments(extras);
    return  arrayListFragment;}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.num=getArguments()!=null?getArguments().getInt("num"):1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pager_list,container,false);
        View tv = view.findViewById(R.id.texto);

        ((TextView)tv).setText("Fragment : "+this.num);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<String> lista = new ArrayList<String>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,lista));
    }
}