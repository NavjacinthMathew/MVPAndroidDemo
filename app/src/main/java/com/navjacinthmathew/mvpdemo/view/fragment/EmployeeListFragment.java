package com.navjacinthmathew.mvpdemo.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.navjacinthmathew.mvpdemo.R;
import com.navjacinthmathew.mvpdemo.adapter.EmployeeAdapter;
import com.navjacinthmathew.mvpdemo.presenter.EmployeeListPresenter;
import com.navjacinthmathew.mvpdemo.view.interfaces.IEmployeeList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EmployeeListFragment extends Fragment implements IEmployeeList {

    @BindView(R.id.txt_no_data)
    TextView txtNoDataMessage;
    @BindView(R.id.recycler_employee_list)
    RecyclerView recyclerViewEmployeeList;

    private EmployeeListPresenter presenter;

    public EmployeeListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_employee_list, container, false);
        ButterKnife.bind(this, view);
        presenter = new EmployeeListPresenter(this);
        presenter.getEmployeeData();
        return view;
    }

    @Override
    public void setAdapter(EmployeeAdapter adapter) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        /*Set layout manager initialised before*/
        recyclerViewEmployeeList.setLayoutManager(layoutManager);

        /*Set adapter to the recycler view*/
        recyclerViewEmployeeList.setAdapter(adapter);
    }

    @Override
    public void showEmployeeList() {
        recyclerViewEmployeeList.setVisibility(View.VISIBLE);
        txtNoDataMessage.setVisibility(View.GONE);
    }

    @Override
    public void hideEmployeeList() {
        recyclerViewEmployeeList.setVisibility(View.GONE);
        txtNoDataMessage.setVisibility(View.VISIBLE);
    }
}
