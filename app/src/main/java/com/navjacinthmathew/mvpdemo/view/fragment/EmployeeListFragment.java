package com.navjacinthmathew.mvpdemo.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.navjacinthmathew.mvpdemo.R;

public class EmployeeListFragment extends Fragment {


    public EmployeeListFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_employee_list, container, false);
        return view;
    }

}
