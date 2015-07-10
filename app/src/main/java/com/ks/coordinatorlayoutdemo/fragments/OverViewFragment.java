package com.ks.coordinatorlayoutdemo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ks.coordinatorlayoutdemo.R;

/**
 * Created by karn on 10/7/15.
 */
public class OverViewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        NestedScrollView rv = (NestedScrollView) inflater.inflate(
                R.layout.fragment_overview, container, false);
        return rv;
    }
}
