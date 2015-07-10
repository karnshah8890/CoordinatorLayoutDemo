package com.ks.coordinatorlayoutdemo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ks.coordinatorlayoutdemo.DetailActivity;
import com.ks.coordinatorlayoutdemo.MainActivity;
import com.ks.coordinatorlayoutdemo.R;
import com.ks.coordinatorlayoutdemo.adapters.RecyclerViewAdapter;
import com.ks.coordinatorlayoutdemo.models.ViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by karn on 10/7/15.
 */
public class CastFragment extends Fragment implements RecyclerViewAdapter.OnItemClickListener  {

    private List<ViewModel> items = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RecyclerView rv = (RecyclerView) inflater.inflate(
                R.layout.fragment_cast, container, false);
        return rv;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupRecyclerView((RecyclerView) getView());
    }

    private void setupRecyclerView(RecyclerView recyclerView) {
        items.add(new ViewModel("Joy", getString(R.string.txt_joy), R.drawable.joy));
        items.add(new ViewModel("Disgust", getString(R.string.txt_digust), R.drawable.disgust));
        items.add(new ViewModel("Fear",getString(R.string.txt_fear), R.drawable.fear));
        items.add(new ViewModel("Anger",getString(R.string.txt_anger), R.drawable.anger));
        items.add(new ViewModel("Clown", getString(R.string.txt_clown),R.drawable.clown));
        items.add(new ViewModel("Forgetters", getString(R.string.txt_forgotter),R.drawable.forgetters));
        items.add(new ViewModel("BingBong",getString(R.string.txt_bingbong), R.drawable.bingbong));

        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(items);
        adapter.setOnItemClickListener(CastFragment.this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, ViewModel viewModel) {
        DetailActivity.navigate((MainActivity)getActivity(), view.findViewById(R.id.image), viewModel);
    }
}
