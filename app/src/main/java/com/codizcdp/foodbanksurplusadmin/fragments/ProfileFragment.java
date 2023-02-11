package com.codizcdp.foodbanksurplusadmin.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.codizcdp.foodbanksurplusadmin.R;


public class ProfileFragment extends Fragment {


    Button change_password;
    private void init() {
        initialize();


    }

    private void initialize() {



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        init();



        return view;
    }
}