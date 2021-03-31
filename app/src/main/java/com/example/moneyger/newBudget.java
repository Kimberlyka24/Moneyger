package com.example.moneyger;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class newBudget extends Fragment {
    View view;
    Button fragmentButton;

    String name;
    int value;

    EditText budgetName;
    EditText budgetValue;

    Button saveBudget;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_new_budget, container, false);
        fragmentButton = (Button)view.findViewById(R.id.newBudget);

        budgetName = view.findViewById(R.id.budgetName);
        budgetValue = view.findViewById(R.id.budgetValue);

        saveBudget = (Button) view.findViewById(R.id.saveBudget);
        saveBudget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = budgetName.getText().toString();
                value = Integer.valueOf( budgetValue.getText().toString());

                savedBudget budget = new savedBudget(name, value);

                showToast();
            }
        });

        return view;
    }
    public void showToast() {
        Toast.makeText(getActivity(), "Your budget has been saved", Toast.LENGTH_SHORT).show();
    }
}