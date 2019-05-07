package com.inducesmile.taxirental.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inducesmile.taxirental.R;
import com.inducesmile.taxirental.adapter.ReservationAdapter;
import com.inducesmile.taxirental.models.ReservationObject;

import java.util.ArrayList;
import java.util.List;


public class CancelledFragment extends Fragment {

    private static final String TAG = CancelledFragment.class.getSimpleName();

    private RecyclerView recyclerView;


    public CancelledFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cancelled, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.upcoming);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        ReservationAdapter mAdapter = new ReservationAdapter(getActivity(), getTestData());
        recyclerView.setAdapter(mAdapter);

        return view;
    }

    public List<ReservationObject> getTestData() {
        List<ReservationObject> mObjects = new ArrayList<ReservationObject>();
        mObjects.add(new ReservationObject(1, "Porche Fx", "Margonda, Depok, Jawa Barat", "May 12, 2019", "Time: 8:40 am", "Rp 900.000", ""));
        mObjects.add(new ReservationObject(1, "Porche Fx", "Margonda, Depok, Jawa Barat", "May 18, 2019", "Time: 8:40 am", "Rp 900.000", ""));
        mObjects.add(new ReservationObject(1, "Porche Fx", "Margonda, Depok, Jawa Barat", "June 01, 2019", "Time: 8:40 am", "Rp 900.000", ""));
        mObjects.add(new ReservationObject(1, "Porche Fx", "Margonda, Depok, Jawa Barat", "June 02, 2019", "Time: 8:40 am", "Rp 900.000", ""));
        return mObjects;
    }

}
