package com.navjacinthmathew.mvpdemo.view.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.navjacinthmathew.mvpdemo.R;
import com.navjacinthmathew.mvpdemo.view.fragment.EmployeeListFragment;
import com.navjacinthmathew.mvpdemo.view.interfaces.IEmployeeList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize ButterKnife
        ButterKnife.bind(this);

        loadFragment(new EmployeeListFragment(), R.id.fragment_container, false);
    }

    private void loadFragment(Fragment fragment, int container, boolean isAddToBackStack) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().add(container, fragment);
        if (isAddToBackStack) {
            fragmentTransaction.addToBackStack(null);
        }
        fragmentTransaction.commit();
    }

}
