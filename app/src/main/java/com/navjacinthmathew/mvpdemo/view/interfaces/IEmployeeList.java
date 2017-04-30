package com.navjacinthmathew.mvpdemo.view.interfaces;

import com.navjacinthmathew.mvpdemo.adapter.EmployeeAdapter;

/**
 * Created by Navjacinth Mathew on 4/19/2017.
 */

public interface IEmployeeList {

    void setAdapter(EmployeeAdapter adapter);

    void showEmployeeList();

    void hideEmployeeList();
}
