package com.navjacinthmathew.mvpdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.navjacinthmathew.mvpdemo.R;
import com.navjacinthmathew.mvpdemo.model.EmployeeModel;

import java.util.ArrayList;

/**
 * Created by Navjacinth Mathew on 4/19/2017.
 */

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {

    private ArrayList<EmployeeModel> dataList;

    public EmployeeAdapter(ArrayList<EmployeeModel> dataList) {
        this.dataList = dataList;
    }

    @Override
    public EmployeeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_employee, parent, false);
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EmployeeViewHolder holder, int position) {
        holder.txtEmpName.setText(dataList.get(position).getName());
        holder.txtEmpEmail.setText(dataList.get(position).getEmailId());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class EmployeeViewHolder extends RecyclerView.ViewHolder {

        TextView txtEmpName, txtEmpEmail;

        EmployeeViewHolder(View itemView) {
            super(itemView);
            txtEmpEmail = (TextView) itemView.findViewById(R.id.txt_name_email);
            txtEmpName = (TextView) itemView.findViewById(R.id.txt_emp_name);
        }
    }
}
