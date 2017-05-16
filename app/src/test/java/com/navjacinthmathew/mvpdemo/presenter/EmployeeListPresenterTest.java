package com.navjacinthmathew.mvpdemo.presenter;

import com.navjacinthmathew.mvpdemo.model.EmployeeModel;
import com.navjacinthmathew.mvpdemo.view.interfaces.IEmployeeList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.mockito.Mockito.verify;

/**
 * Created by Navjacinth Mathew on 4/29/2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class EmployeeListPresenterTest {

    @Mock
    private IEmployeeList view;
    private EmployeeListPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new EmployeeListPresenter(view);
    }

    @Test
    public void checkEmptyEmployeeDataSet() {
        ArrayList<EmployeeModel> emptySet = new ArrayList<>();
        presenter.setList(emptySet);
        verify(view).hideEmployeeList();
    }

    @Test
    public void checkListShownWithValidDataSet() {
        ArrayList<EmployeeModel> empTestSet = new ArrayList<>();
        empTestSet.add(new EmployeeModel(1, "Testing", "testing@mvp.com"));

        presenter.setList(empTestSet);
        verify(view).showEmployeeList();
    }

    @Test
    public void checkAdapterCalledWithValidDataSet() {
        ArrayList<EmployeeModel> empTestSet = new ArrayList<>();
        empTestSet.add(new EmployeeModel(1, "Testing 1", "testing1@mvp.com"));
        empTestSet.add(new EmployeeModel(2, "Testing 2", "testing2@mvp.com"));

        presenter.setList(empTestSet);
        verify(view).showEmployeeList();
    }

}