package com.navjacinthmathew.mvpdemo.presenter;

import com.navjacinthmathew.mvpdemo.model.EmployeeModel;
import com.navjacinthmathew.mvpdemo.view.interfaces.IEmployeeList;

import java.util.ArrayList;

/**
 * Created by Navjacinth Mathew on 4/19/2017.
 */

public class EmployeeListPresenter {

    private IEmployeeList iEmployeeList;

    public EmployeeListPresenter(IEmployeeList iEmployeeList) {
        this.iEmployeeList = iEmployeeList;
    }

    public void getEmployeeData() {
        ArrayList<EmployeeModel> empDataList = new ArrayList<>();
        empDataList.add(new EmployeeModel(123, "Employee1", "emp1@mvpexample.com"));
        empDataList.add(new EmployeeModel(321, "Employee2", "emp1@mvpexample.com"));
        empDataList.add(new EmployeeModel(456, "Employee3", "emp1@mvpexample.com"));
        empDataList.add(new EmployeeModel(654, "Employee4", "emp1@mvpexample.com"));
        empDataList.add(new EmployeeModel(789, "Employee5", "emp1@mvpexample.com"));
        empDataList.add(new EmployeeModel(987, "Employee6", "emp1@mvpexample.com"));
    }
}
