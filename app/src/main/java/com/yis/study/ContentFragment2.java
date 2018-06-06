package com.yis.study;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by yis on 2018/6/6.
 */

public class ContentFragment2 extends Fragment {

    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_content, container, false);
        listView = view.findViewById(R.id.list_view);

        String[] names = {"hello", "tony", "luce", "jack", "tom", "11", "22", "33", "44", "55"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), R.layout.listview_item, R.id.tv_name, names);
        listView.setAdapter(adapter);
        return view;
    }
}
