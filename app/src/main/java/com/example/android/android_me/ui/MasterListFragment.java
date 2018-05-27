package com.example.android.android_me.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class MasterListFragment extends Fragment {

    Context context;

    public MasterListFragment() {
        Log.e("MasterListFragment", "Called constructor !!");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        MasterListAdapter adapter;

        Log.e("MasterListFragment", "onCreateView called !!");

        adapter = new MasterListAdapter(getActivity(), AndroidImageAssets.getAll());

        // Inflate the fragment layout
        View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);

        GridView gridView = (GridView) rootView.findViewById(R.id.images_grid_view);

        gridView.setAdapter(adapter);

        return (rootView);
    }
}
