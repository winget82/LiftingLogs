package com.example.liftinglogs;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Calendar;

public class logdate_fragment extends Fragment{

    DatePicker datePicker;
    private Button selectDateBtn;
    RadioButton splitA;
    RadioButton splitB;
    RadioButton splitC;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.logdate_fragment, container, false);

        datePicker = (DatePicker) view.findViewById(R.id.logDatePicker);
        final TextView selectedDateLbl = (TextView) view.findViewById(R.id.selectedDate_TV);
        selectDateBtn = (Button) view.findViewById(R.id.selectDateBtn);
        splitA = (RadioButton) view.findViewById(R.id.splitA_radioBtn);
        splitB = (RadioButton) view.findViewById(R.id.splitB_radioBtn);
        splitC = (RadioButton) view.findViewById(R.id.splitC_radioBtn);

        selectDateBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                int day = datePicker.getDayOfMonth();
                int month = datePicker.getMonth();
                int year = datePicker.getYear();

                System.out.println(day);
                System.out.println(month);
                System.out.println(year);

                String dayString = String.valueOf(day);
                String monthString = String.valueOf(month+1);
                String yearString = String.valueOf(year);
                String label = monthString + '/' + dayString + '/' + yearString;

                if(splitA.isChecked())
                {

                    selectedDateLbl.setText(label + " Split A selected.");
                }
                else if (splitB.isChecked())
                {
                    selectedDateLbl.setText(label + " Split B selected.");
                }
                else
                {
                    selectedDateLbl.setText(label + " Split C selected.");
                }
            }

        });

        return view;
    }
}


//https://www.youtube.com/watch?v=UqtsyhASW74

//NEED TO FIGURE OUT HOW TO GET DATA FROM FRAGMENT - LOOK AT SCHOOL ASSIGNMENTS TO FIGURE IT OUT

//https://stackoverflow.com/questions/36165386/android-getting-value-from-datepicker-on-a-fragment-tab