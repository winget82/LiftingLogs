package com.example.liftinglogs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

/*
NEED A SPLASH SCREEN / HOME SCREEN

NEED A GRAPH SCREEN

NEED A SCREEN TO LOAD PREVIOUS DATES

NEED A NAVIGATION BAR AT TOP OF SCREEN LAYOUT AND SOMETHING THAT SHOWS THE DATE LOADED / VISIBLE
 */

public class LogActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    //arraylist for current relative layout
    ArrayList<String> relativeLayoutList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.logactivity_layout);
        Toolbar logsToolbar = (Toolbar) findViewById(R.id.logsToolbar);
        setSupportActionBar(logsToolbar);

        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

        //relative layouts
        final RelativeLayout relativeLayout0 = (RelativeLayout) findViewById(R.id.relativeLayout0);
        final RelativeLayout relativeLayout1 = (RelativeLayout) findViewById(R.id.relativeLayout1);
        final RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.relativeLayout2);
        final RelativeLayout relativeLayout3 = (RelativeLayout) findViewById(R.id.relativeLayout3);
        final RelativeLayout relativeLayout4 = (RelativeLayout) findViewById(R.id.relativeLayout4);
        final RelativeLayout relativeLayout5 = (RelativeLayout) findViewById(R.id.relativeLayout5);
        final RelativeLayout relativeLayout6 = (RelativeLayout) findViewById(R.id.relativeLayout6);
        final RelativeLayout relativeLayout7 = (RelativeLayout) findViewById(R.id.relativeLayout7);
        final RelativeLayout relativeLayout8 = (RelativeLayout) findViewById(R.id.relativeLayout8);
        final RelativeLayout relativeLayout9 = (RelativeLayout) findViewById(R.id.relativeLayout9);

        relativeLayoutList.add("relativeLayout0");

        //clear spinners and edit texts and views - make things visible / invisible like did in c#
        //set the spinners to gone originally
        //need add row/remove row button and some way to select the row to remove it
        //such as swiping if unlocked at the right

        final Button addRowButton = (Button) findViewById(R.id.addRowButton);
        addRowButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //set next row visible / not gone

                //call a function to determine what row you are currently on - maybe make a list of rows
                //and when this button is clicked it sets an index to the next row

                if (!relativeLayoutList.contains("relativeLayout0"))
                {
                    relativeLayout0.setVisibility(View.VISIBLE);
                    relativeLayoutList.add("relativeLayout0");
                }
                else if (!relativeLayoutList.contains("relativeLayout1"))
                {
                    relativeLayout1.setVisibility(View.VISIBLE);
                    relativeLayoutList.add("relativeLayout1");
                }
                else if (!relativeLayoutList.contains("relativeLayout2"))
                {
                    relativeLayout2.setVisibility(View.VISIBLE);
                    relativeLayoutList.add("relativeLayout2");
                }
                else if (!relativeLayoutList.contains("relativeLayout3"))
                {
                    relativeLayout3.setVisibility(View.VISIBLE);
                    relativeLayoutList.add("relativeLayout3");
                }
                else if (!relativeLayoutList.contains("relativeLayout4"))
                {
                    relativeLayout4.setVisibility(View.VISIBLE);
                    relativeLayoutList.add("relativeLayout4");
                }
                else if (!relativeLayoutList.contains("relativeLayout5"))
                {
                    relativeLayout5.setVisibility(View.VISIBLE);
                    relativeLayoutList.add("relativeLayout5");
                }
                else if (!relativeLayoutList.contains("relativeLayout6"))
                {
                    relativeLayout6.setVisibility(View.VISIBLE);
                    relativeLayoutList.add("relativeLayout6");
                }
                else if (!relativeLayoutList.contains("relativeLayout7"))
                {
                    relativeLayout7.setVisibility(View.VISIBLE);
                    relativeLayoutList.add("relativeLayout7");
                }
                else if (!relativeLayoutList.contains("relativeLayout8"))
                {
                    relativeLayout8.setVisibility(View.VISIBLE);
                    relativeLayoutList.add("relativeLayout8");
                }
                else if (!relativeLayoutList.contains("relativeLayout9"))
                {
                    relativeLayout9.setVisibility(View.VISIBLE);
                    relativeLayoutList.add("relativeLayout9");
                }
                if (relativeLayoutList.size() == 10)
                {
                    addRowButton.setVisibility(View.INVISIBLE);
                }
            }
        });

        //Lists for exercise and reps.  The exercise name will be index 0, reps will be indices 1-5
        final String[] row0RepsArray = new String[6];
        final String[] row1RepsArray = new String[6];
        final String[] row2RepsArray = new String[6];
        final String[] row3RepsArray = new String[6];
        final String[] row4RepsArray = new String[6];
        final String[] row5RepsArray = new String[6];
        final String[] row6RepsArray = new String[6];
        final String[] row7RepsArray = new String[6];
        final String[] row8RepsArray = new String[6];
        final String[] row9RepsArray = new String[6];

        //Arrays for rowRepWeightArray index 0 matches up to index 1 of rowRepsArray of the same row
        final String[] row0RepWeightArray = new String[5];
        final String[] row1RepWeightArray = new String[5];
        final String[] row2RepWeightArray = new String[5];
        final String[] row3RepWeightArray = new String[5];
        final String[] row4RepWeightArray = new String[5];
        final String[] row5RepWeightArray = new String[5];
        final String[] row6RepWeightArray = new String[5];
        final String[] row7RepWeightArray = new String[5];
        final String[] row8RepWeightArray = new String[5];
        final String[] row9RepWeightArray = new String[5];

        // Spinner element
        final Spinner spinner0 = (Spinner) findViewById(R.id.exerciseSpinnerRow0);
        final Spinner spinner1 = (Spinner) findViewById(R.id.exerciseSpinnerRow1);
        final Spinner spinner2 = (Spinner) findViewById(R.id.exerciseSpinnerRow2);
        final Spinner spinner3 = (Spinner) findViewById(R.id.exerciseSpinnerRow3);
        final Spinner spinner4 = (Spinner) findViewById(R.id.exerciseSpinnerRow4);
        final Spinner spinner5 = (Spinner) findViewById(R.id.exerciseSpinnerRow5);
        final Spinner spinner6 = (Spinner) findViewById(R.id.exerciseSpinnerRow6);
        final Spinner spinner7 = (Spinner) findViewById(R.id.exerciseSpinnerRow7);
        final Spinner spinner8 = (Spinner) findViewById(R.id.exerciseSpinnerRow8);
        final Spinner spinner9 = (Spinner) findViewById(R.id.exerciseSpinnerRow9);

        // Spinner click listener
        spinner0.setOnItemSelectedListener(this);
        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);
        spinner4.setOnItemSelectedListener(this);
        spinner5.setOnItemSelectedListener(this);
        spinner6.setOnItemSelectedListener(this);
        spinner7.setOnItemSelectedListener(this);
        spinner8.setOnItemSelectedListener(this);
        spinner9.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("");
        categories.add("Squats");
        categories.add("Bicep Curls");
        categories.add("Inc Bicep Curls");
        categories.add("Pull Ups");
        categories.add("Chins");
        categories.add("Deadlifts");
        categories.add("Bench Press");
        categories.add("Dec Bench Press");
        categories.add("Inc Bench Press");
        categories.add("DB Press");
        categories.add("Dec DB Press");
        categories.add("Inc DB Press");
        categories.add("Dips");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner0.setAdapter(dataAdapter);
        spinner1.setAdapter(dataAdapter);
        spinner2.setAdapter(dataAdapter);
        spinner3.setAdapter(dataAdapter);
        spinner4.setAdapter(dataAdapter);
        spinner5.setAdapter(dataAdapter);
        spinner6.setAdapter(dataAdapter);
        spinner7.setAdapter(dataAdapter);
        spinner8.setAdapter(dataAdapter);
        spinner9.setAdapter(dataAdapter);

        //Edit texts
        final EditText row0Set1_ET = (EditText) findViewById(R.id.row0Set1_EditTxt);
        final EditText row0Set2_ET = (EditText) findViewById(R.id.row0Set2_EditTxt);
        final EditText row0Set3_ET = (EditText) findViewById(R.id.row0Set3_EditTxt);
        final EditText row0Set4_ET = (EditText) findViewById(R.id.row0Set4_EditTxt);
        final EditText row0Set5_ET = (EditText) findViewById(R.id.row0Set5_EditTxt);

        final EditText row0Set1wt_ET = (EditText) findViewById(R.id.row0Set1wt_EditTxt);
        final EditText row0Set2wt_ET = (EditText) findViewById(R.id.row0Set2wt_EditTxt);
        final EditText row0Set3wt_ET = (EditText) findViewById(R.id.row0Set3wt_EditTxt);
        final EditText row0Set4wt_ET = (EditText) findViewById(R.id.row0Set4wt_EditTxt);
        final EditText row0Set5wt_ET = (EditText) findViewById(R.id.row0Set5wt_EditTxt);

        final EditText row1Set1_ET = (EditText) findViewById(R.id.row1Set1_EditTxt);
        final EditText row1Set2_ET = (EditText) findViewById(R.id.row1Set2_EditTxt);
        final EditText row1Set3_ET = (EditText) findViewById(R.id.row1Set3_EditTxt);
        final EditText row1Set4_ET = (EditText) findViewById(R.id.row1Set4_EditTxt);
        final EditText row1Set5_ET = (EditText) findViewById(R.id.row1Set5_EditTxt);

        final EditText row1Set1wt_ET = (EditText) findViewById(R.id.row1Set1wt_EditTxt);
        final EditText row1Set2wt_ET = (EditText) findViewById(R.id.row1Set2wt_EditTxt);
        final EditText row1Set3wt_ET = (EditText) findViewById(R.id.row1Set3wt_EditTxt);
        final EditText row1Set4wt_ET = (EditText) findViewById(R.id.row1Set4wt_EditTxt);
        final EditText row1Set5wt_ET = (EditText) findViewById(R.id.row1Set5wt_EditTxt);

        final EditText row2Set1_ET = (EditText) findViewById(R.id.row2Set1_EditTxt);
        final EditText row2Set2_ET = (EditText) findViewById(R.id.row2Set2_EditTxt);
        final EditText row2Set3_ET = (EditText) findViewById(R.id.row2Set3_EditTxt);
        final EditText row2Set4_ET = (EditText) findViewById(R.id.row2Set4_EditTxt);
        final EditText row2Set5_ET = (EditText) findViewById(R.id.row2Set5_EditTxt);

        final EditText row2Set1wt_ET = (EditText) findViewById(R.id.row2Set1wt_EditTxt);
        final EditText row2Set2wt_ET = (EditText) findViewById(R.id.row2Set2wt_EditTxt);
        final EditText row2Set3wt_ET = (EditText) findViewById(R.id.row2Set3wt_EditTxt);
        final EditText row2Set4wt_ET = (EditText) findViewById(R.id.row2Set4wt_EditTxt);
        final EditText row2Set5wt_ET = (EditText) findViewById(R.id.row2Set5wt_EditTxt);

        final EditText row3Set1_ET = (EditText) findViewById(R.id.row3Set1_EditTxt);
        final EditText row3Set2_ET = (EditText) findViewById(R.id.row3Set2_EditTxt);
        final EditText row3Set3_ET = (EditText) findViewById(R.id.row3Set3_EditTxt);
        final EditText row3Set4_ET = (EditText) findViewById(R.id.row3Set4_EditTxt);
        final EditText row3Set5_ET = (EditText) findViewById(R.id.row3Set5_EditTxt);

        final EditText row3Set1wt_ET = (EditText) findViewById(R.id.row3Set1wt_EditTxt);
        final EditText row3Set2wt_ET = (EditText) findViewById(R.id.row3Set2wt_EditTxt);
        final EditText row3Set3wt_ET = (EditText) findViewById(R.id.row3Set3wt_EditTxt);
        final EditText row3Set4wt_ET = (EditText) findViewById(R.id.row3Set4wt_EditTxt);
        final EditText row3Set5wt_ET = (EditText) findViewById(R.id.row3Set5wt_EditTxt);

        final EditText row4Set1_ET = (EditText) findViewById(R.id.row4Set1_EditTxt);
        final EditText row4Set2_ET = (EditText) findViewById(R.id.row4Set2_EditTxt);
        final EditText row4Set3_ET = (EditText) findViewById(R.id.row4Set3_EditTxt);
        final EditText row4Set4_ET = (EditText) findViewById(R.id.row4Set4_EditTxt);
        final EditText row4Set5_ET = (EditText) findViewById(R.id.row4Set5_EditTxt);

        final EditText row4Set1wt_ET = (EditText) findViewById(R.id.row4Set1wt_EditTxt);
        final EditText row4Set2wt_ET = (EditText) findViewById(R.id.row4Set2wt_EditTxt);
        final EditText row4Set3wt_ET = (EditText) findViewById(R.id.row4Set3wt_EditTxt);
        final EditText row4Set4wt_ET = (EditText) findViewById(R.id.row4Set4wt_EditTxt);
        final EditText row4Set5wt_ET = (EditText) findViewById(R.id.row4Set5wt_EditTxt);

        final EditText row5Set1_ET = (EditText) findViewById(R.id.row5Set1_EditTxt);
        final EditText row5Set2_ET = (EditText) findViewById(R.id.row5Set2_EditTxt);
        final EditText row5Set3_ET = (EditText) findViewById(R.id.row5Set3_EditTxt);
        final EditText row5Set4_ET = (EditText) findViewById(R.id.row5Set4_EditTxt);
        final EditText row5Set5_ET = (EditText) findViewById(R.id.row5Set5_EditTxt);

        final EditText row5Set1wt_ET = (EditText) findViewById(R.id.row5Set1wt_EditTxt);
        final EditText row5Set2wt_ET = (EditText) findViewById(R.id.row5Set2wt_EditTxt);
        final EditText row5Set3wt_ET = (EditText) findViewById(R.id.row5Set3wt_EditTxt);
        final EditText row5Set4wt_ET = (EditText) findViewById(R.id.row5Set4wt_EditTxt);
        final EditText row5Set5wt_ET = (EditText) findViewById(R.id.row5Set5wt_EditTxt);

        final EditText row6Set1_ET = (EditText) findViewById(R.id.row6Set1_EditTxt);
        final EditText row6Set2_ET = (EditText) findViewById(R.id.row6Set2_EditTxt);
        final EditText row6Set3_ET = (EditText) findViewById(R.id.row6Set3_EditTxt);
        final EditText row6Set4_ET = (EditText) findViewById(R.id.row6Set4_EditTxt);
        final EditText row6Set5_ET = (EditText) findViewById(R.id.row6Set5_EditTxt);

        final EditText row6Set1wt_ET = (EditText) findViewById(R.id.row6Set1wt_EditTxt);
        final EditText row6Set2wt_ET = (EditText) findViewById(R.id.row6Set2wt_EditTxt);
        final EditText row6Set3wt_ET = (EditText) findViewById(R.id.row6Set3wt_EditTxt);
        final EditText row6Set4wt_ET = (EditText) findViewById(R.id.row6Set4wt_EditTxt);
        final EditText row6Set5wt_ET = (EditText) findViewById(R.id.row6Set5wt_EditTxt);

        final EditText row7Set1_ET = (EditText) findViewById(R.id.row7Set1_EditTxt);
        final EditText row7Set2_ET = (EditText) findViewById(R.id.row7Set2_EditTxt);
        final EditText row7Set3_ET = (EditText) findViewById(R.id.row7Set3_EditTxt);
        final EditText row7Set4_ET = (EditText) findViewById(R.id.row7Set4_EditTxt);
        final EditText row7Set5_ET = (EditText) findViewById(R.id.row7Set5_EditTxt);

        final EditText row7Set1wt_ET = (EditText) findViewById(R.id.row7Set1wt_EditTxt);
        final EditText row7Set2wt_ET = (EditText) findViewById(R.id.row7Set2wt_EditTxt);
        final EditText row7Set3wt_ET = (EditText) findViewById(R.id.row7Set3wt_EditTxt);
        final EditText row7Set4wt_ET = (EditText) findViewById(R.id.row7Set4wt_EditTxt);
        final EditText row7Set5wt_ET = (EditText) findViewById(R.id.row7Set5wt_EditTxt);

        final EditText row8Set1_ET = (EditText) findViewById(R.id.row8Set1_EditTxt);
        final EditText row8Set2_ET = (EditText) findViewById(R.id.row8Set2_EditTxt);
        final EditText row8Set3_ET = (EditText) findViewById(R.id.row8Set3_EditTxt);
        final EditText row8Set4_ET = (EditText) findViewById(R.id.row8Set4_EditTxt);
        final EditText row8Set5_ET = (EditText) findViewById(R.id.row8Set5_EditTxt);

        final EditText row8Set1wt_ET = (EditText) findViewById(R.id.row8Set1wt_EditTxt);
        final EditText row8Set2wt_ET = (EditText) findViewById(R.id.row8Set2wt_EditTxt);
        final EditText row8Set3wt_ET = (EditText) findViewById(R.id.row8Set3wt_EditTxt);
        final EditText row8Set4wt_ET = (EditText) findViewById(R.id.row8Set4wt_EditTxt);
        final EditText row8Set5wt_ET = (EditText) findViewById(R.id.row8Set5wt_EditTxt);

        final EditText row9Set1_ET = (EditText) findViewById(R.id.row9Set1_EditTxt);
        final EditText row9Set2_ET = (EditText) findViewById(R.id.row9Set2_EditTxt);
        final EditText row9Set3_ET = (EditText) findViewById(R.id.row9Set3_EditTxt);
        final EditText row9Set4_ET = (EditText) findViewById(R.id.row9Set4_EditTxt);
        final EditText row9Set5_ET = (EditText) findViewById(R.id.row9Set5_EditTxt);

        final EditText row9Set1wt_ET = (EditText) findViewById(R.id.row9Set1wt_EditTxt);
        final EditText row9Set2wt_ET = (EditText) findViewById(R.id.row9Set2wt_EditTxt);
        final EditText row9Set3wt_ET = (EditText) findViewById(R.id.row9Set3wt_EditTxt);
        final EditText row9Set4wt_ET = (EditText) findViewById(R.id.row9Set4wt_EditTxt);
        final EditText row9Set5wt_ET = (EditText) findViewById(R.id.row9Set5wt_EditTxt);

        //Lock image buttons
        final ImageButton row0LockBtn = (ImageButton) findViewById(R.id.row0LockButton);
        final ImageButton row1LockBtn = (ImageButton) findViewById(R.id.row1LockButton);
        final ImageButton row2LockBtn = (ImageButton) findViewById(R.id.row2LockButton);
        final ImageButton row3LockBtn = (ImageButton) findViewById(R.id.row3LockButton);
        final ImageButton row4LockBtn = (ImageButton) findViewById(R.id.row4LockButton);
        final ImageButton row5LockBtn = (ImageButton) findViewById(R.id.row5LockButton);
        final ImageButton row6LockBtn = (ImageButton) findViewById(R.id.row6LockButton);
        final ImageButton row7LockBtn = (ImageButton) findViewById(R.id.row7LockButton);
        final ImageButton row8LockBtn = (ImageButton) findViewById(R.id.row8LockButton);
        final ImageButton row9LockBtn = (ImageButton) findViewById(R.id.row9LockButton);

        //delete row buttons
        final Button row0Delete = (Button) findViewById(R.id.row0DelBtn);
        final Button row1Delete = (Button) findViewById(R.id.row1DelBtn);
        final Button row2Delete = (Button) findViewById(R.id.row2DelBtn);
        final Button row3Delete = (Button) findViewById(R.id.row3DelBtn);
        final Button row4Delete = (Button) findViewById(R.id.row4DelBtn);
        final Button row5Delete = (Button) findViewById(R.id.row5DelBtn);
        final Button row6Delete = (Button) findViewById(R.id.row6DelBtn);
        final Button row7Delete = (Button) findViewById(R.id.row7DelBtn);
        final Button row8Delete = (Button) findViewById(R.id.row8DelBtn);
        final Button row9Delete = (Button) findViewById(R.id.row9DelBtn);

        // Edit Text addTextChangedListeners
        row0Set1_ET.addTextChangedListener(new TextWatcher()
        {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                // Fires as the text is being changed and supplies the range of text
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {
                // Fires before text is changed
            }

            @Override
            public void afterTextChanged(Editable s)
            {
                // Fires after the text has changed

                //select row in database based on profile, logdated, splitlabel, and rownumber

                // if the row exists in the database
                // updateData_liftingLogs_table - update entire sqlite database row here

                // if the row doesn't exist yet, then it will insert it with
                // insertData_liftingLogs_table
            }
        });



        //on click listeners for the delete buttons
        row0Delete.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                relativeLayout0.setVisibility(View.GONE);
                relativeLayoutList.remove("relativeLayout0");
                //currentRelLay = 0;
                row0Set1_ET.setText("");
                row0Set2_ET.setText("");
                row0Set3_ET.setText("");
                row0Set4_ET.setText("");
                row0Set5_ET.setText("");
                spinner0.setSelection(0);

                //set row0RepsArray to the above
                row0RepsArray[0] = spinner0.getSelectedItem().toString();
                row0RepsArray[1] = row0Set1_ET.getText().toString();
                row0RepsArray[2] = row0Set2_ET.getText().toString();
                row0RepsArray[3] = row0Set3_ET.getText().toString();
                row0RepsArray[4] = row0Set4_ET.getText().toString();
                row0RepsArray[5] = row0Set5_ET.getText().toString();

                //set weigths to ""
                row0Set1wt_ET.setText("");
                row0Set2wt_ET.setText("");
                row0Set3wt_ET.setText("");
                row0Set4wt_ET.setText("");
                row0Set5wt_ET.setText("");

                //capture weigths to list
                row0RepWeightArray[0] = row0Set1wt_ET.getText().toString();
                row0RepWeightArray[1] = row0Set2wt_ET.getText().toString();
                row0RepWeightArray[2] = row0Set3wt_ET.getText().toString();
                row0RepWeightArray[3] = row0Set4wt_ET.getText().toString();
                row0RepWeightArray[4] = row0Set5wt_ET.getText().toString();

                //if less than 10 rows showing, show the add row button
                if (relativeLayoutList.size() < 10)
                {
                    addRowButton.setVisibility(View.VISIBLE);
                }

                //print out array for testing
                for (int i=0; i<row0RepsArray.length; i++)
                {
                    System.out.println(row0RepsArray[i]);
                }
                for (int j=0; j<row0RepWeightArray.length; j++)
                {
                    System.out.println(row0RepWeightArray[j]);
                }
            }
        });

        row1Delete.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                relativeLayout1.setVisibility(View.GONE);
                relativeLayoutList.remove("relativeLayout1");
                //currentRelLay = 1;
                row1Set1_ET.setText("");
                row1Set2_ET.setText("");
                row1Set3_ET.setText("");
                row1Set4_ET.setText("");
                row1Set5_ET.setText("");
                spinner1.setSelection(0);

                //set row1RepsArray to the above
                row1RepsArray[0] = spinner1.getSelectedItem().toString();
                row1RepsArray[1] = row1Set1_ET.getText().toString();
                row1RepsArray[2] = row1Set2_ET.getText().toString();
                row1RepsArray[3] = row1Set3_ET.getText().toString();
                row1RepsArray[4] = row1Set4_ET.getText().toString();
                row1RepsArray[5] = row1Set5_ET.getText().toString();

                //set weigths to ""
                row1Set1wt_ET.setText("");
                row1Set2wt_ET.setText("");
                row1Set3wt_ET.setText("");
                row1Set4wt_ET.setText("");
                row1Set5wt_ET.setText("");

                //capture weigths to list
                row1RepWeightArray[0] = row1Set1wt_ET.getText().toString();
                row1RepWeightArray[1] = row1Set2wt_ET.getText().toString();
                row1RepWeightArray[2] = row1Set3wt_ET.getText().toString();
                row1RepWeightArray[3] = row1Set4wt_ET.getText().toString();
                row1RepWeightArray[4] = row1Set5wt_ET.getText().toString();

                //if less than 10 rows showing, show the add row button
                if (relativeLayoutList.size() < 10)
                {
                    addRowButton.setVisibility(View.VISIBLE);
                }

                //print out array for testing
                for (int i=0; i<row1RepsArray.length; i++)
                {
                    System.out.println(row1RepsArray[i]);
                }
                for (int j=0; j<row1RepWeightArray.length; j++)
                {
                    System.out.println(row1RepWeightArray[j]);
                }
            }
        });

        row2Delete.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                relativeLayout2.setVisibility(View.GONE);
                relativeLayoutList.remove("relativeLayout2");
                //currentRelLay = 2;
                row2Set1_ET.setText("");
                row2Set2_ET.setText("");
                row2Set3_ET.setText("");
                row2Set4_ET.setText("");
                row2Set5_ET.setText("");
                spinner2.setSelection(0);

                //set row2RepsArray to the above
                row2RepsArray[0] = spinner2.getSelectedItem().toString();
                row2RepsArray[1] = row2Set1_ET.getText().toString();
                row2RepsArray[2] = row2Set2_ET.getText().toString();
                row2RepsArray[3] = row2Set3_ET.getText().toString();
                row2RepsArray[4] = row2Set4_ET.getText().toString();
                row2RepsArray[5] = row2Set5_ET.getText().toString();

                //set weigths to ""
                row2Set1wt_ET.setText("");
                row2Set2wt_ET.setText("");
                row2Set3wt_ET.setText("");
                row2Set4wt_ET.setText("");
                row2Set5wt_ET.setText("");

                //capture weigths to list
                row2RepWeightArray[0] = row2Set1wt_ET.getText().toString();
                row2RepWeightArray[1] = row2Set2wt_ET.getText().toString();
                row2RepWeightArray[2] = row2Set3wt_ET.getText().toString();
                row2RepWeightArray[3] = row2Set4wt_ET.getText().toString();
                row2RepWeightArray[4] = row2Set5wt_ET.getText().toString();

                //if less than 10 rows showing, show the add row button
                if (relativeLayoutList.size() < 10)
                {
                    addRowButton.setVisibility(View.VISIBLE);
                }

                //print out array for testing
                for (int i=0; i<row2RepsArray.length; i++)
                {
                    System.out.println(row2RepsArray[i]);
                }
                for (int j=0; j<row2RepWeightArray.length; j++)
                {
                    System.out.println(row2RepWeightArray[j]);
                }
            }
        });

        row3Delete.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                relativeLayout3.setVisibility(View.GONE);
                relativeLayoutList.remove("relativeLayout3");
                //currentRelLay = 3;
                row3Set1_ET.setText("");
                row3Set2_ET.setText("");
                row3Set3_ET.setText("");
                row3Set4_ET.setText("");
                row3Set5_ET.setText("");
                spinner3.setSelection(0);

                //set row3RepsArray to the above
                row3RepsArray[0] = spinner3.getSelectedItem().toString();
                row3RepsArray[1] = row3Set1_ET.getText().toString();
                row3RepsArray[2] = row3Set2_ET.getText().toString();
                row3RepsArray[3] = row3Set3_ET.getText().toString();
                row3RepsArray[4] = row3Set4_ET.getText().toString();
                row3RepsArray[5] = row3Set5_ET.getText().toString();

                //set weigths to ""
                row3Set1wt_ET.setText("");
                row3Set2wt_ET.setText("");
                row3Set3wt_ET.setText("");
                row3Set4wt_ET.setText("");
                row3Set5wt_ET.setText("");

                //capture weigths to list
                row3RepWeightArray[0] = row3Set1wt_ET.getText().toString();
                row3RepWeightArray[1] = row3Set2wt_ET.getText().toString();
                row3RepWeightArray[2] = row3Set3wt_ET.getText().toString();
                row3RepWeightArray[3] = row3Set4wt_ET.getText().toString();
                row3RepWeightArray[4] = row3Set5wt_ET.getText().toString();

                //if less than 10 rows showing, show the add row button
                if (relativeLayoutList.size() < 10)
                {
                    addRowButton.setVisibility(View.VISIBLE);
                }

                //print out array for testing
                for (int i=0; i<row3RepsArray.length; i++)
                {
                    System.out.println(row3RepsArray[i]);
                }
                for (int j=0; j<row3RepWeightArray.length; j++)
                {
                    System.out.println(row3RepWeightArray[j]);
                }
            }
        });

        row4Delete.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                relativeLayout4.setVisibility(View.GONE);
                relativeLayoutList.remove("relativeLayout4");
                //currentRelLay = 4;
                row4Set1_ET.setText("");
                row4Set2_ET.setText("");
                row4Set3_ET.setText("");
                row4Set4_ET.setText("");
                row4Set5_ET.setText("");
                spinner4.setSelection(0);

                //set row4RepsArray to the above
                row4RepsArray[0] = spinner4.getSelectedItem().toString();
                row4RepsArray[1] = row4Set1_ET.getText().toString();
                row4RepsArray[2] = row4Set2_ET.getText().toString();
                row4RepsArray[3] = row4Set3_ET.getText().toString();
                row4RepsArray[4] = row4Set4_ET.getText().toString();
                row4RepsArray[5] = row4Set5_ET.getText().toString();

                //set weigths to ""
                row4Set1wt_ET.setText("");
                row4Set2wt_ET.setText("");
                row4Set3wt_ET.setText("");
                row4Set4wt_ET.setText("");
                row4Set5wt_ET.setText("");

                //capture weigths to list
                row4RepWeightArray[0] = row4Set1wt_ET.getText().toString();
                row4RepWeightArray[1] = row4Set2wt_ET.getText().toString();
                row4RepWeightArray[2] = row4Set3wt_ET.getText().toString();
                row4RepWeightArray[3] = row4Set4wt_ET.getText().toString();
                row4RepWeightArray[4] = row4Set5wt_ET.getText().toString();

                //if less than 10 rows showing, show the add row button
                if (relativeLayoutList.size() < 10)
                {
                    addRowButton.setVisibility(View.VISIBLE);
                }

                //print out array for testing
                for (int i=0; i<row4RepsArray.length; i++)
                {
                    System.out.println(row4RepsArray[i]);
                }
                for (int j=0; j<row4RepWeightArray.length; j++)
                {
                    System.out.println(row4RepWeightArray[j]);
                }
            }
        });

        row5Delete.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                relativeLayout5.setVisibility(View.GONE);
                relativeLayoutList.remove("relativeLayout5");
                //currentRelLay = 5;
                row5Set1_ET.setText("");
                row5Set2_ET.setText("");
                row5Set3_ET.setText("");
                row5Set4_ET.setText("");
                row5Set5_ET.setText("");
                spinner5.setSelection(0);

                //set row5RepsArray to the above
                row5RepsArray[0] = spinner5.getSelectedItem().toString();
                row5RepsArray[1] = row5Set1_ET.getText().toString();
                row5RepsArray[2] = row5Set2_ET.getText().toString();
                row5RepsArray[3] = row5Set3_ET.getText().toString();
                row5RepsArray[4] = row5Set4_ET.getText().toString();
                row5RepsArray[5] = row5Set5_ET.getText().toString();

                //set weigths to ""
                row5Set1wt_ET.setText("");
                row5Set2wt_ET.setText("");
                row5Set3wt_ET.setText("");
                row5Set4wt_ET.setText("");
                row5Set5wt_ET.setText("");

                //capture weigths to list
                row5RepWeightArray[0] = row5Set1wt_ET.getText().toString();
                row5RepWeightArray[1] = row5Set2wt_ET.getText().toString();
                row5RepWeightArray[2] = row5Set3wt_ET.getText().toString();
                row5RepWeightArray[3] = row5Set4wt_ET.getText().toString();
                row5RepWeightArray[4] = row5Set5wt_ET.getText().toString();

                //if less than 10 rows showing, show the add row button
                if (relativeLayoutList.size() < 10)
                {
                    addRowButton.setVisibility(View.VISIBLE);
                }

                //print out array for testing
                for (int i=0; i<row5RepsArray.length; i++)
                {
                    System.out.println(row5RepsArray[i]);
                }
                for (int j=0; j<row5RepWeightArray.length; j++)
                {
                    System.out.println(row5RepWeightArray[j]);
                }
            }
        });

        row6Delete.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                relativeLayout6.setVisibility(View.GONE);
                relativeLayoutList.remove("relativeLayout6");
                //currentRelLay = 6;
                row6Set1_ET.setText("");
                row6Set2_ET.setText("");
                row6Set3_ET.setText("");
                row6Set4_ET.setText("");
                row6Set5_ET.setText("");
                spinner6.setSelection(0);

                //set row6RepsArray to the above
                row6RepsArray[0] = spinner3.getSelectedItem().toString();
                row6RepsArray[1] = row6Set1_ET.getText().toString();
                row6RepsArray[2] = row6Set2_ET.getText().toString();
                row6RepsArray[3] = row6Set3_ET.getText().toString();
                row6RepsArray[4] = row6Set4_ET.getText().toString();
                row6RepsArray[5] = row6Set5_ET.getText().toString();

                //set weigths to ""
                row6Set1wt_ET.setText("");
                row6Set2wt_ET.setText("");
                row6Set3wt_ET.setText("");
                row6Set4wt_ET.setText("");
                row6Set5wt_ET.setText("");

                //capture weigths to list
                row6RepWeightArray[0] = row6Set1wt_ET.getText().toString();
                row6RepWeightArray[1] = row6Set2wt_ET.getText().toString();
                row6RepWeightArray[2] = row6Set3wt_ET.getText().toString();
                row6RepWeightArray[3] = row6Set4wt_ET.getText().toString();
                row6RepWeightArray[4] = row6Set5wt_ET.getText().toString();

                //if less than 10 rows showing, show the add row button
                if (relativeLayoutList.size() < 10)
                {
                    addRowButton.setVisibility(View.VISIBLE);
                }

                //print out array for testing
                for (int i=0; i<row6RepsArray.length; i++)
                {
                    System.out.println(row6RepsArray[i]);
                }
                for (int j=0; j<row6RepWeightArray.length; j++)
                {
                    System.out.println(row6RepWeightArray[j]);
                }
            }
        });

        row7Delete.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                relativeLayout7.setVisibility(View.GONE);
                relativeLayoutList.remove("relativeLayout7");
                //currentRelLay = 7;
                row7Set1_ET.setText("");
                row7Set2_ET.setText("");
                row7Set3_ET.setText("");
                row7Set4_ET.setText("");
                row7Set5_ET.setText("");
                spinner7.setSelection(0);

                //set row7RepsArray to the above
                row7RepsArray[0] = spinner7.getSelectedItem().toString();
                row7RepsArray[1] = row7Set1_ET.getText().toString();
                row7RepsArray[2] = row7Set2_ET.getText().toString();
                row7RepsArray[3] = row7Set3_ET.getText().toString();
                row7RepsArray[4] = row7Set4_ET.getText().toString();
                row7RepsArray[5] = row7Set5_ET.getText().toString();

                //set weigths to ""
                row7Set1wt_ET.setText("");
                row7Set2wt_ET.setText("");
                row7Set3wt_ET.setText("");
                row7Set4wt_ET.setText("");
                row7Set5wt_ET.setText("");

                //capture weigths to list
                row7RepWeightArray[0] = row7Set1wt_ET.getText().toString();
                row7RepWeightArray[1] = row7Set2wt_ET.getText().toString();
                row7RepWeightArray[2] = row7Set3wt_ET.getText().toString();
                row7RepWeightArray[3] = row7Set4wt_ET.getText().toString();
                row7RepWeightArray[4] = row7Set5wt_ET.getText().toString();

                //if less than 10 rows showing, show the add row button
                if (relativeLayoutList.size() < 10)
                {
                    addRowButton.setVisibility(View.VISIBLE);
                }

                //print out array for testing
                for (int i=0; i<row7RepsArray.length; i++)
                {
                    System.out.println(row7RepsArray[i]);
                }
                for (int j=0; j<row7RepWeightArray.length; j++)
                {
                    System.out.println(row7RepWeightArray[j]);
                }
            }
        });

        row8Delete.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                relativeLayout8.setVisibility(View.GONE);
                relativeLayoutList.remove("relativeLayout8");
                //currentRelLay = 8;
                row8Set1_ET.setText("");
                row8Set2_ET.setText("");
                row8Set3_ET.setText("");
                row8Set4_ET.setText("");
                row8Set5_ET.setText("");
                spinner8.setSelection(0);

                //set row8RepsArray to the above
                row8RepsArray[0] = spinner8.getSelectedItem().toString();
                row8RepsArray[1] = row8Set1_ET.getText().toString();
                row8RepsArray[2] = row8Set2_ET.getText().toString();
                row8RepsArray[3] = row8Set3_ET.getText().toString();
                row8RepsArray[4] = row8Set4_ET.getText().toString();
                row8RepsArray[5] = row8Set5_ET.getText().toString();

                //set weigths to ""
                row8Set1wt_ET.setText("");
                row8Set2wt_ET.setText("");
                row8Set3wt_ET.setText("");
                row8Set4wt_ET.setText("");
                row8Set5wt_ET.setText("");

                //capture weigths to list
                row8RepWeightArray[0] = row8Set1wt_ET.getText().toString();
                row8RepWeightArray[1] = row8Set2wt_ET.getText().toString();
                row8RepWeightArray[2] = row8Set3wt_ET.getText().toString();
                row8RepWeightArray[3] = row8Set4wt_ET.getText().toString();
                row8RepWeightArray[4] = row8Set5wt_ET.getText().toString();

                //if less than 10 rows showing, show the add row button
                if (relativeLayoutList.size() < 10)
                {
                    addRowButton.setVisibility(View.VISIBLE);
                }

                //print out array for testing
                for (int i=0; i<row8RepsArray.length; i++)
                {
                    System.out.println(row8RepsArray[i]);
                }
                for (int j=0; j<row8RepWeightArray.length; j++)
                {
                    System.out.println(row8RepWeightArray[j]);
                }
            }
        });

        row9Delete.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                relativeLayout9.setVisibility(View.GONE);
                relativeLayoutList.remove("relativeLayout9");
                //currentRelLay = 9;
                row9Set1_ET.setText("");
                row9Set2_ET.setText("");
                row9Set3_ET.setText("");
                row9Set4_ET.setText("");
                row9Set5_ET.setText("");
                spinner9.setSelection(0);

                //set row9RepsArray to the above
                row9RepsArray[0] = spinner9.getSelectedItem().toString();
                row9RepsArray[1] = row9Set1_ET.getText().toString();
                row9RepsArray[2] = row9Set2_ET.getText().toString();
                row9RepsArray[3] = row9Set3_ET.getText().toString();
                row9RepsArray[4] = row9Set4_ET.getText().toString();
                row9RepsArray[5] = row9Set5_ET.getText().toString();

                //set weigths to ""
                row9Set1wt_ET.setText("");
                row9Set2wt_ET.setText("");
                row9Set3wt_ET.setText("");
                row9Set4wt_ET.setText("");
                row9Set5wt_ET.setText("");

                //capture weigths to list
                row9RepWeightArray[0] = row9Set1wt_ET.getText().toString();
                row9RepWeightArray[1] = row9Set2wt_ET.getText().toString();
                row9RepWeightArray[2] = row9Set3wt_ET.getText().toString();
                row9RepWeightArray[3] = row9Set4wt_ET.getText().toString();
                row9RepWeightArray[4] = row9Set5wt_ET.getText().toString();

                addRowButton.setVisibility(View.VISIBLE);

                //print out array for testing
                for (int i=0; i<row9RepsArray.length; i++)
                {
                    System.out.println(row9RepsArray[i]);
                }
                for (int j=0; j<row9RepWeightArray.length; j++)
                {
                    System.out.println(row9RepWeightArray[j]);
                }
            }
        });

        //Locked tags initial setting to false to indicate button and row are unlocked - true is locked
        row0LockBtn.setTag(false);
        row1LockBtn.setTag(false);
        row2LockBtn.setTag(false);
        row3LockBtn.setTag(false);
        row4LockBtn.setTag(false);
        row5LockBtn.setTag(false);
        row6LockBtn.setTag(false);
        row7LockBtn.setTag(false);
        row8LockBtn.setTag(false);
        row9LockBtn.setTag(false);

        //on click listeners for the lock buttons
        row0LockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (row0LockBtn.getTag().equals(false))//if unlocked, lock it and edit texts and spinner
                {
                    row0LockBtn.setImageResource(R.drawable.iconfinder_finance__lock__security__safety_2538671);
                    row0LockBtn.setTag(true);
                    row0Delete.setVisibility(view.INVISIBLE);

                    //set rowRepsArray values to what is in the edit texts for this row
                    row0RepsArray[0] = spinner0.getSelectedItem().toString();
                    row0RepsArray[1] = row0Set1_ET.getText().toString();
                    row0RepsArray[2] = row0Set2_ET.getText().toString();
                    row0RepsArray[3] = row0Set3_ET.getText().toString();
                    row0RepsArray[4] = row0Set4_ET.getText().toString();
                    row0RepsArray[5] = row0Set5_ET.getText().toString();

                    //set values to row0RepWeightArray
                    row0RepWeightArray[0] = row0Set1wt_ET.getText().toString();
                    row0RepWeightArray[1] = row0Set2wt_ET.getText().toString();
                    row0RepWeightArray[2] = row0Set3wt_ET.getText().toString();
                    row0RepWeightArray[3] = row0Set4wt_ET.getText().toString();
                    row0RepWeightArray[4] = row0Set5wt_ET.getText().toString();

                    //print out array for testing
                    for (int i=0; i<row0RepsArray.length; i++)
                    {
                        System.out.println(row0RepsArray[i]);
                    }
                    for (int j=0; j<row0RepWeightArray.length; j++)
                    {
                        System.out.println(row0RepWeightArray[j]);
                    }

                    //lock edit texts
                    row0Set1_ET.setEnabled(false);
                    row0Set2_ET.setEnabled(false);
                    row0Set3_ET.setEnabled(false);
                    row0Set4_ET.setEnabled(false);
                    row0Set5_ET.setEnabled(false);
                    row0Set1_ET.setInputType(InputType.TYPE_NULL);
                    row0Set2_ET.setInputType(InputType.TYPE_NULL);
                    row0Set3_ET.setInputType(InputType.TYPE_NULL);
                    row0Set4_ET.setInputType(InputType.TYPE_NULL);
                    row0Set5_ET.setInputType(InputType.TYPE_NULL);

                    row0Set1wt_ET.setEnabled(false);
                    row0Set2wt_ET.setEnabled(false);
                    row0Set3wt_ET.setEnabled(false);
                    row0Set4wt_ET.setEnabled(false);
                    row0Set5wt_ET.setEnabled(false);
                    row0Set1wt_ET.setInputType(InputType.TYPE_NULL);
                    row0Set2wt_ET.setInputType(InputType.TYPE_NULL);
                    row0Set3wt_ET.setInputType(InputType.TYPE_NULL);
                    row0Set4wt_ET.setInputType(InputType.TYPE_NULL);
                    row0Set5wt_ET.setInputType(InputType.TYPE_NULL);

                    //lock spinner
                    spinner0.setEnabled(false);
                }
                else//if locked, unlock edit texts, show delete button, unlock spinner
                {
                    row0LockBtn.setImageResource(R.drawable.iconfinder_53__safety__security__unlock__unlocked_2538716);
                    row0LockBtn.setTag(false);
                    row0Delete.setVisibility(view.VISIBLE);

                    //unlock edit texts
                    row0Set1_ET.setEnabled(true);
                    row0Set2_ET.setEnabled(true);
                    row0Set3_ET.setEnabled(true);
                    row0Set4_ET.setEnabled(true);
                    row0Set5_ET.setEnabled(true);
                    row0Set1_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row0Set2_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row0Set3_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row0Set4_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row0Set5_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    row0Set1wt_ET.setEnabled(true);
                    row0Set2wt_ET.setEnabled(true);
                    row0Set3wt_ET.setEnabled(true);
                    row0Set4wt_ET.setEnabled(true);
                    row0Set5wt_ET.setEnabled(true);
                    row0Set1wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row0Set2wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row0Set3wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row0Set4wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row0Set5wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    //unlock spinner
                    spinner0.setEnabled(true);
                }

            }
        });

        row1LockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (row1LockBtn.getTag().equals(false))
                {
                    row1LockBtn.setImageResource(R.drawable.iconfinder_finance__lock__security__safety_2538671);
                    row1LockBtn.setTag(true);
                    row1Delete.setVisibility(view.INVISIBLE);

                    //set rowRepsArray values to what is in the edit texts for this row
                    row1RepsArray[0] = spinner1.getSelectedItem().toString();
                    row1RepsArray[1] = row1Set1_ET.getText().toString();
                    row1RepsArray[2] = row1Set2_ET.getText().toString();
                    row1RepsArray[3] = row1Set3_ET.getText().toString();
                    row1RepsArray[4] = row1Set4_ET.getText().toString();
                    row1RepsArray[5] = row1Set5_ET.getText().toString();

                    //set values to row0RepWeightArray
                    row1RepWeightArray[0] = row1Set1wt_ET.getText().toString();
                    row1RepWeightArray[1] = row1Set2wt_ET.getText().toString();
                    row1RepWeightArray[2] = row1Set3wt_ET.getText().toString();
                    row1RepWeightArray[3] = row1Set4wt_ET.getText().toString();
                    row1RepWeightArray[4] = row1Set5wt_ET.getText().toString();

                    //print out array for testing
                    for (int i=0; i<row1RepsArray.length; i++)
                    {
                        System.out.println(row1RepsArray[i]);
                    }
                    for (int j=0; j<row1RepWeightArray.length; j++)
                    {
                        System.out.println(row1RepWeightArray[j]);
                    }

                    //lock edit texts
                    row1Set1_ET.setEnabled(false);
                    row1Set2_ET.setEnabled(false);
                    row1Set3_ET.setEnabled(false);
                    row1Set4_ET.setEnabled(false);
                    row1Set5_ET.setEnabled(false);
                    row1Set1_ET.setInputType(InputType.TYPE_NULL);
                    row1Set2_ET.setInputType(InputType.TYPE_NULL);
                    row1Set3_ET.setInputType(InputType.TYPE_NULL);
                    row1Set4_ET.setInputType(InputType.TYPE_NULL);
                    row1Set5_ET.setInputType(InputType.TYPE_NULL);

                    row1Set1wt_ET.setEnabled(false);
                    row1Set2wt_ET.setEnabled(false);
                    row1Set3wt_ET.setEnabled(false);
                    row1Set4wt_ET.setEnabled(false);
                    row1Set5wt_ET.setEnabled(false);
                    row1Set1wt_ET.setInputType(InputType.TYPE_NULL);
                    row1Set2wt_ET.setInputType(InputType.TYPE_NULL);
                    row1Set3wt_ET.setInputType(InputType.TYPE_NULL);
                    row1Set4wt_ET.setInputType(InputType.TYPE_NULL);
                    row1Set5wt_ET.setInputType(InputType.TYPE_NULL);

                    //lock spinner
                    spinner1.setEnabled(false);
                }
                else
                {
                    row1LockBtn.setImageResource(R.drawable.iconfinder_53__safety__security__unlock__unlocked_2538716);
                    row1LockBtn.setTag(false);
                    row1Delete.setVisibility(view.VISIBLE);

                    //unlock edit texts
                    row1Set1_ET.setEnabled(true);
                    row1Set2_ET.setEnabled(true);
                    row1Set3_ET.setEnabled(true);
                    row1Set4_ET.setEnabled(true);
                    row1Set5_ET.setEnabled(true);
                    row1Set1_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row1Set2_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row1Set3_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row1Set4_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row1Set5_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    row1Set1wt_ET.setEnabled(true);
                    row1Set2wt_ET.setEnabled(true);
                    row1Set3wt_ET.setEnabled(true);
                    row1Set4wt_ET.setEnabled(true);
                    row1Set5wt_ET.setEnabled(true);
                    row1Set1wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row1Set2wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row1Set3wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row1Set4wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row1Set5wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    //unlock spinner
                    spinner1.setEnabled(true);
                }

            }
        });

        row2LockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (row2LockBtn.getTag().equals(false))
                {
                    row2LockBtn.setImageResource(R.drawable.iconfinder_finance__lock__security__safety_2538671);
                    row2LockBtn.setTag(true);
                    row2Delete.setVisibility(view.INVISIBLE);

                    //set rowRepsArray values to what is in the edit texts for this row
                    row2RepsArray[0] = spinner2.getSelectedItem().toString();
                    row2RepsArray[1] = row2Set1_ET.getText().toString();
                    row2RepsArray[2] = row2Set2_ET.getText().toString();
                    row2RepsArray[3] = row2Set3_ET.getText().toString();
                    row2RepsArray[4] = row2Set4_ET.getText().toString();
                    row2RepsArray[5] = row2Set5_ET.getText().toString();

                    //set values to row0RepWeightArray
                    row2RepWeightArray[0] = row2Set1wt_ET.getText().toString();
                    row2RepWeightArray[1] = row2Set2wt_ET.getText().toString();
                    row2RepWeightArray[2] = row2Set3wt_ET.getText().toString();
                    row2RepWeightArray[3] = row2Set4wt_ET.getText().toString();
                    row2RepWeightArray[4] = row2Set5wt_ET.getText().toString();

                    //print out array for testing
                    for (int i=0; i<row2RepsArray.length; i++)
                    {
                        System.out.println(row2RepsArray[i]);
                    }
                    for (int j=0; j<row2RepWeightArray.length; j++)
                    {
                        System.out.println(row2RepWeightArray[j]);
                    }

                    //lock edit texts
                    row2Set1_ET.setEnabled(false);
                    row2Set2_ET.setEnabled(false);
                    row2Set3_ET.setEnabled(false);
                    row2Set4_ET.setEnabled(false);
                    row2Set5_ET.setEnabled(false);
                    row2Set1_ET.setInputType(InputType.TYPE_NULL);
                    row2Set2_ET.setInputType(InputType.TYPE_NULL);
                    row2Set3_ET.setInputType(InputType.TYPE_NULL);
                    row2Set4_ET.setInputType(InputType.TYPE_NULL);
                    row2Set5_ET.setInputType(InputType.TYPE_NULL);

                    row2Set1wt_ET.setEnabled(false);
                    row2Set2wt_ET.setEnabled(false);
                    row2Set3wt_ET.setEnabled(false);
                    row2Set4wt_ET.setEnabled(false);
                    row2Set5wt_ET.setEnabled(false);
                    row2Set1wt_ET.setInputType(InputType.TYPE_NULL);
                    row2Set2wt_ET.setInputType(InputType.TYPE_NULL);
                    row2Set3wt_ET.setInputType(InputType.TYPE_NULL);
                    row2Set4wt_ET.setInputType(InputType.TYPE_NULL);
                    row2Set5wt_ET.setInputType(InputType.TYPE_NULL);

                    //lock spinner
                    spinner2.setEnabled(false);
                }
                else
                {
                    row2LockBtn.setImageResource(R.drawable.iconfinder_53__safety__security__unlock__unlocked_2538716);
                    row2LockBtn.setTag(false);
                    row2Delete.setVisibility(view.VISIBLE);

                    //unlock edit texts
                    row2Set1_ET.setEnabled(true);
                    row2Set2_ET.setEnabled(true);
                    row2Set3_ET.setEnabled(true);
                    row2Set4_ET.setEnabled(true);
                    row2Set5_ET.setEnabled(true);
                    row2Set1_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row2Set2_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row2Set3_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row2Set4_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row2Set5_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    row2Set1wt_ET.setEnabled(true);
                    row2Set2wt_ET.setEnabled(true);
                    row2Set3wt_ET.setEnabled(true);
                    row2Set4wt_ET.setEnabled(true);
                    row2Set5wt_ET.setEnabled(true);
                    row2Set1wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row2Set2wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row2Set3wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row2Set4wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row2Set5wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    //unlock spinner
                    spinner2.setEnabled(true);
                }

            }
        });

        row3LockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (row3LockBtn.getTag().equals(false))
                {
                    row3LockBtn.setImageResource(R.drawable.iconfinder_finance__lock__security__safety_2538671);
                    row3LockBtn.setTag(true);
                    row3Delete.setVisibility(view.INVISIBLE);

                    //set rowRepsArray values to what is in the edit texts for this row
                    row3RepsArray[0] = spinner3.getSelectedItem().toString();
                    row3RepsArray[1] = row3Set1_ET.getText().toString();
                    row3RepsArray[2] = row3Set2_ET.getText().toString();
                    row3RepsArray[3] = row3Set3_ET.getText().toString();
                    row3RepsArray[4] = row3Set4_ET.getText().toString();
                    row3RepsArray[5] = row3Set5_ET.getText().toString();

                    //set values to row0RepWeightArray
                    row3RepWeightArray[0] = row3Set1wt_ET.getText().toString();
                    row3RepWeightArray[1] = row3Set2wt_ET.getText().toString();
                    row3RepWeightArray[2] = row3Set3wt_ET.getText().toString();
                    row3RepWeightArray[3] = row3Set4wt_ET.getText().toString();
                    row3RepWeightArray[4] = row3Set5wt_ET.getText().toString();

                    //print out array for testing
                    for (int i=0; i<row3RepsArray.length; i++)
                    {
                        System.out.println(row3RepsArray[i]);
                    }
                    for (int j=0; j<row3RepWeightArray.length; j++)
                    {
                        System.out.println(row3RepWeightArray[j]);
                    }

                    //lock edit texts
                    row3Set1_ET.setEnabled(false);
                    row3Set2_ET.setEnabled(false);
                    row3Set3_ET.setEnabled(false);
                    row3Set4_ET.setEnabled(false);
                    row3Set5_ET.setEnabled(false);
                    row3Set1_ET.setInputType(InputType.TYPE_NULL);
                    row3Set2_ET.setInputType(InputType.TYPE_NULL);
                    row3Set3_ET.setInputType(InputType.TYPE_NULL);
                    row3Set4_ET.setInputType(InputType.TYPE_NULL);
                    row3Set5_ET.setInputType(InputType.TYPE_NULL);

                    row3Set1wt_ET.setEnabled(false);
                    row3Set2wt_ET.setEnabled(false);
                    row3Set3wt_ET.setEnabled(false);
                    row3Set4wt_ET.setEnabled(false);
                    row3Set5wt_ET.setEnabled(false);
                    row3Set1wt_ET.setInputType(InputType.TYPE_NULL);
                    row3Set2wt_ET.setInputType(InputType.TYPE_NULL);
                    row3Set3wt_ET.setInputType(InputType.TYPE_NULL);
                    row3Set4wt_ET.setInputType(InputType.TYPE_NULL);
                    row3Set5wt_ET.setInputType(InputType.TYPE_NULL);

                    //lock spinner
                    spinner3.setEnabled(false);
                }
                else
                {
                    row3LockBtn.setImageResource(R.drawable.iconfinder_53__safety__security__unlock__unlocked_2538716);
                    row3LockBtn.setTag(false);
                    row3Delete.setVisibility(view.VISIBLE);

                    //unlock edit texts
                    row3Set1_ET.setEnabled(true);
                    row3Set2_ET.setEnabled(true);
                    row3Set3_ET.setEnabled(true);
                    row3Set4_ET.setEnabled(true);
                    row3Set5_ET.setEnabled(true);
                    row3Set1_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row3Set2_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row3Set3_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row3Set4_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row3Set5_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    row3Set1wt_ET.setEnabled(true);
                    row3Set2wt_ET.setEnabled(true);
                    row3Set3wt_ET.setEnabled(true);
                    row3Set4wt_ET.setEnabled(true);
                    row3Set5wt_ET.setEnabled(true);
                    row3Set1wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row3Set2wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row3Set3wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row3Set4wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row3Set5wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    //unlock spinner
                    spinner3.setEnabled(true);
                }

            }
        });

        row4LockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (row4LockBtn.getTag().equals(false))
                {
                    row4LockBtn.setImageResource(R.drawable.iconfinder_finance__lock__security__safety_2538671);
                    row4LockBtn.setTag(true);
                    row4Delete.setVisibility(view.INVISIBLE);

                    //set rowRepsArray values to what is in the edit texts for this row
                    row4RepsArray[0] = spinner4.getSelectedItem().toString();
                    row4RepsArray[1] = row4Set1_ET.getText().toString();
                    row4RepsArray[2] = row4Set2_ET.getText().toString();
                    row4RepsArray[3] = row4Set3_ET.getText().toString();
                    row4RepsArray[4] = row4Set4_ET.getText().toString();
                    row4RepsArray[5] = row4Set5_ET.getText().toString();

                    //set values to row0RepWeightArray
                    row4RepWeightArray[0] = row4Set1wt_ET.getText().toString();
                    row4RepWeightArray[1] = row4Set2wt_ET.getText().toString();
                    row4RepWeightArray[2] = row4Set3wt_ET.getText().toString();
                    row4RepWeightArray[3] = row4Set4wt_ET.getText().toString();
                    row4RepWeightArray[4] = row4Set5wt_ET.getText().toString();

                    //print out array for testing
                    for (int i=0; i<row4RepsArray.length; i++)
                    {
                        System.out.println(row4RepsArray[i]);
                    }
                    for (int j=0; j<row4RepWeightArray.length; j++)
                    {
                        System.out.println(row4RepWeightArray[j]);
                    }

                    //lock edit texts
                    row4Set1_ET.setEnabled(false);
                    row4Set2_ET.setEnabled(false);
                    row4Set3_ET.setEnabled(false);
                    row4Set4_ET.setEnabled(false);
                    row4Set5_ET.setEnabled(false);
                    row4Set1_ET.setInputType(InputType.TYPE_NULL);
                    row4Set2_ET.setInputType(InputType.TYPE_NULL);
                    row4Set3_ET.setInputType(InputType.TYPE_NULL);
                    row4Set4_ET.setInputType(InputType.TYPE_NULL);
                    row4Set5_ET.setInputType(InputType.TYPE_NULL);

                    row4Set1wt_ET.setEnabled(false);
                    row4Set2wt_ET.setEnabled(false);
                    row4Set3wt_ET.setEnabled(false);
                    row4Set4wt_ET.setEnabled(false);
                    row4Set5wt_ET.setEnabled(false);
                    row4Set1wt_ET.setInputType(InputType.TYPE_NULL);
                    row4Set2wt_ET.setInputType(InputType.TYPE_NULL);
                    row4Set3wt_ET.setInputType(InputType.TYPE_NULL);
                    row4Set4wt_ET.setInputType(InputType.TYPE_NULL);
                    row4Set5wt_ET.setInputType(InputType.TYPE_NULL);

                    //lock spinner
                    spinner4.setEnabled(false);
                }
                else
                {
                    row4LockBtn.setImageResource(R.drawable.iconfinder_53__safety__security__unlock__unlocked_2538716);
                    row4LockBtn.setTag(false);
                    row4Delete.setVisibility(view.VISIBLE);

                    //unlock edit texts
                    row4Set1_ET.setEnabled(true);
                    row4Set2_ET.setEnabled(true);
                    row4Set3_ET.setEnabled(true);
                    row4Set4_ET.setEnabled(true);
                    row4Set5_ET.setEnabled(true);
                    row4Set1_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row4Set2_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row4Set3_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row4Set4_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row4Set5_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    row4Set1wt_ET.setEnabled(true);
                    row4Set2wt_ET.setEnabled(true);
                    row4Set3wt_ET.setEnabled(true);
                    row4Set4wt_ET.setEnabled(true);
                    row4Set5wt_ET.setEnabled(true);
                    row4Set1wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row4Set2wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row4Set3wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row4Set4wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row4Set5wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    //unlock spinner
                    spinner4.setEnabled(true);
                }

            }
        });

        row5LockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (row5LockBtn.getTag().equals(false))
                {
                    row5LockBtn.setImageResource(R.drawable.iconfinder_finance__lock__security__safety_2538671);
                    row5LockBtn.setTag(true);
                    row5Delete.setVisibility(view.INVISIBLE);

                    //set rowRepsArray values to what is in the edit texts for this row
                    row5RepsArray[0] = spinner5.getSelectedItem().toString();
                    row5RepsArray[1] = row5Set1_ET.getText().toString();
                    row5RepsArray[2] = row5Set2_ET.getText().toString();
                    row5RepsArray[3] = row5Set3_ET.getText().toString();
                    row5RepsArray[4] = row5Set4_ET.getText().toString();
                    row5RepsArray[5] = row5Set5_ET.getText().toString();

                    //set values to row0RepWeightArray
                    row5RepWeightArray[0] = row5Set1wt_ET.getText().toString();
                    row5RepWeightArray[1] = row5Set2wt_ET.getText().toString();
                    row5RepWeightArray[2] = row5Set3wt_ET.getText().toString();
                    row5RepWeightArray[3] = row5Set4wt_ET.getText().toString();
                    row5RepWeightArray[4] = row5Set5wt_ET.getText().toString();

                    //print out array for testing
                    for (int i=0; i<row5RepsArray.length; i++)
                    {
                        System.out.println(row5RepsArray[i]);
                    }
                    for (int j=0; j<row5RepWeightArray.length; j++)
                    {
                        System.out.println(row5RepWeightArray[j]);
                    }

                    //lock edit texts
                    row5Set1_ET.setEnabled(false);
                    row5Set2_ET.setEnabled(false);
                    row5Set3_ET.setEnabled(false);
                    row5Set4_ET.setEnabled(false);
                    row5Set5_ET.setEnabled(false);
                    row5Set1_ET.setInputType(InputType.TYPE_NULL);
                    row5Set2_ET.setInputType(InputType.TYPE_NULL);
                    row5Set3_ET.setInputType(InputType.TYPE_NULL);
                    row5Set4_ET.setInputType(InputType.TYPE_NULL);
                    row5Set5_ET.setInputType(InputType.TYPE_NULL);

                    row5Set1wt_ET.setEnabled(false);
                    row5Set2wt_ET.setEnabled(false);
                    row5Set3wt_ET.setEnabled(false);
                    row5Set4wt_ET.setEnabled(false);
                    row5Set5wt_ET.setEnabled(false);
                    row5Set1wt_ET.setInputType(InputType.TYPE_NULL);
                    row5Set2wt_ET.setInputType(InputType.TYPE_NULL);
                    row5Set3wt_ET.setInputType(InputType.TYPE_NULL);
                    row5Set4wt_ET.setInputType(InputType.TYPE_NULL);
                    row5Set5wt_ET.setInputType(InputType.TYPE_NULL);

                    //lock spinner
                    spinner5.setEnabled(false);
                }
                else
                {
                    row5LockBtn.setImageResource(R.drawable.iconfinder_53__safety__security__unlock__unlocked_2538716);
                    row5LockBtn.setTag(false);
                    row5Delete.setVisibility(view.VISIBLE);

                    //unlock edit texts
                    row5Set1_ET.setEnabled(true);
                    row5Set2_ET.setEnabled(true);
                    row5Set3_ET.setEnabled(true);
                    row5Set4_ET.setEnabled(true);
                    row5Set5_ET.setEnabled(true);
                    row5Set1_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row5Set2_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row5Set3_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row5Set4_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row5Set5_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    row5Set1wt_ET.setEnabled(true);
                    row5Set2wt_ET.setEnabled(true);
                    row5Set3wt_ET.setEnabled(true);
                    row5Set4wt_ET.setEnabled(true);
                    row5Set5wt_ET.setEnabled(true);
                    row5Set1wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row5Set2wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row5Set3wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row5Set4wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row5Set5wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    //unlock spinner
                    spinner5.setEnabled(true);
                }

            }
        });

        row6LockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (row6LockBtn.getTag().equals(false))
                {
                    row6LockBtn.setImageResource(R.drawable.iconfinder_finance__lock__security__safety_2538671);
                    row6LockBtn.setTag(true);
                    row6Delete.setVisibility(view.INVISIBLE);

                    //set rowRepsArray values to what is in the edit texts for this row
                    row6RepsArray[0] = spinner6.getSelectedItem().toString();
                    row6RepsArray[1] = row6Set1_ET.getText().toString();
                    row6RepsArray[2] = row6Set2_ET.getText().toString();
                    row6RepsArray[3] = row6Set3_ET.getText().toString();
                    row6RepsArray[4] = row6Set4_ET.getText().toString();
                    row6RepsArray[5] = row6Set5_ET.getText().toString();

                    //set values to row0RepWeightArray
                    row6RepWeightArray[0] = row6Set1wt_ET.getText().toString();
                    row6RepWeightArray[1] = row6Set2wt_ET.getText().toString();
                    row6RepWeightArray[2] = row6Set3wt_ET.getText().toString();
                    row6RepWeightArray[3] = row6Set4wt_ET.getText().toString();
                    row6RepWeightArray[4] = row6Set5wt_ET.getText().toString();

                    //print out array for testing
                    for (int i=0; i<row6RepsArray.length; i++)
                    {
                        System.out.println(row6RepsArray[i]);
                    }
                    for (int j=0; j<row6RepWeightArray.length; j++)
                    {
                        System.out.println(row6RepWeightArray[j]);
                    }

                    //lock edit texts
                    row6Set1_ET.setEnabled(false);
                    row6Set2_ET.setEnabled(false);
                    row6Set3_ET.setEnabled(false);
                    row6Set4_ET.setEnabled(false);
                    row6Set5_ET.setEnabled(false);
                    row6Set1_ET.setInputType(InputType.TYPE_NULL);
                    row6Set2_ET.setInputType(InputType.TYPE_NULL);
                    row6Set3_ET.setInputType(InputType.TYPE_NULL);
                    row6Set4_ET.setInputType(InputType.TYPE_NULL);
                    row6Set5_ET.setInputType(InputType.TYPE_NULL);

                    row6Set1wt_ET.setEnabled(false);
                    row6Set2wt_ET.setEnabled(false);
                    row6Set3wt_ET.setEnabled(false);
                    row6Set4wt_ET.setEnabled(false);
                    row6Set5wt_ET.setEnabled(false);
                    row6Set1wt_ET.setInputType(InputType.TYPE_NULL);
                    row6Set2wt_ET.setInputType(InputType.TYPE_NULL);
                    row6Set3wt_ET.setInputType(InputType.TYPE_NULL);
                    row6Set4wt_ET.setInputType(InputType.TYPE_NULL);
                    row6Set5wt_ET.setInputType(InputType.TYPE_NULL);

                    //lock spinner
                    spinner6.setEnabled(false);
                }
                else
                {
                    row6LockBtn.setImageResource(R.drawable.iconfinder_53__safety__security__unlock__unlocked_2538716);
                    row6LockBtn.setTag(false);
                    row6Delete.setVisibility(view.VISIBLE);

                    //unlock edit texts
                    row6Set1_ET.setEnabled(true);
                    row6Set2_ET.setEnabled(true);
                    row6Set3_ET.setEnabled(true);
                    row6Set4_ET.setEnabled(true);
                    row6Set5_ET.setEnabled(true);
                    row6Set1_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row6Set2_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row6Set3_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row6Set4_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row6Set5_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    row6Set1wt_ET.setEnabled(true);
                    row6Set2wt_ET.setEnabled(true);
                    row6Set3wt_ET.setEnabled(true);
                    row6Set4wt_ET.setEnabled(true);
                    row6Set5wt_ET.setEnabled(true);
                    row6Set1wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row6Set2wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row6Set3wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row6Set4wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row6Set5wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    //unlock spinner
                    spinner6.setEnabled(true);
                }

            }
        });

        row7LockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (row7LockBtn.getTag().equals(false))
                {
                    row7LockBtn.setImageResource(R.drawable.iconfinder_finance__lock__security__safety_2538671);
                    row7LockBtn.setTag(true);
                    row7Delete.setVisibility(view.INVISIBLE);

                    //set rowRepsArray values to what is in the edit texts for this row
                    row7RepsArray[0] = spinner7.getSelectedItem().toString();
                    row7RepsArray[1] = row7Set1_ET.getText().toString();
                    row7RepsArray[2] = row7Set2_ET.getText().toString();
                    row7RepsArray[3] = row7Set3_ET.getText().toString();
                    row7RepsArray[4] = row7Set4_ET.getText().toString();
                    row7RepsArray[5] = row7Set5_ET.getText().toString();

                    //set values to row0RepWeightArray
                    row7RepWeightArray[0] = row7Set1wt_ET.getText().toString();
                    row7RepWeightArray[1] = row7Set2wt_ET.getText().toString();
                    row7RepWeightArray[2] = row7Set3wt_ET.getText().toString();
                    row7RepWeightArray[3] = row7Set4wt_ET.getText().toString();
                    row7RepWeightArray[4] = row7Set5wt_ET.getText().toString();

                    //print out array for testing
                    for (int i=0; i<row7RepsArray.length; i++)
                    {
                        System.out.println(row7RepsArray[i]);
                    }
                    for (int j=0; j<row7RepWeightArray.length; j++)
                    {
                        System.out.println(row7RepWeightArray[j]);
                    }

                    //lock edit texts
                    row7Set1_ET.setEnabled(false);
                    row7Set2_ET.setEnabled(false);
                    row7Set3_ET.setEnabled(false);
                    row7Set4_ET.setEnabled(false);
                    row7Set5_ET.setEnabled(false);
                    row7Set1_ET.setInputType(InputType.TYPE_NULL);
                    row7Set2_ET.setInputType(InputType.TYPE_NULL);
                    row7Set3_ET.setInputType(InputType.TYPE_NULL);
                    row7Set4_ET.setInputType(InputType.TYPE_NULL);
                    row7Set5_ET.setInputType(InputType.TYPE_NULL);

                    row7Set1wt_ET.setEnabled(false);
                    row7Set2wt_ET.setEnabled(false);
                    row7Set3wt_ET.setEnabled(false);
                    row7Set4wt_ET.setEnabled(false);
                    row7Set5wt_ET.setEnabled(false);
                    row7Set1wt_ET.setInputType(InputType.TYPE_NULL);
                    row7Set2wt_ET.setInputType(InputType.TYPE_NULL);
                    row7Set3wt_ET.setInputType(InputType.TYPE_NULL);
                    row7Set4wt_ET.setInputType(InputType.TYPE_NULL);
                    row7Set5wt_ET.setInputType(InputType.TYPE_NULL);

                    //lock spinner
                    spinner7.setEnabled(false);
                }
                else
                {
                    row7LockBtn.setImageResource(R.drawable.iconfinder_53__safety__security__unlock__unlocked_2538716);
                    row7LockBtn.setTag(false);
                    row7Delete.setVisibility(view.VISIBLE);

                    //unlock edit texts
                    row7Set1_ET.setEnabled(true);
                    row7Set2_ET.setEnabled(true);
                    row7Set3_ET.setEnabled(true);
                    row7Set4_ET.setEnabled(true);
                    row7Set5_ET.setEnabled(true);
                    row7Set1_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row7Set2_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row7Set3_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row7Set4_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row7Set5_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    row7Set1wt_ET.setEnabled(true);
                    row7Set2wt_ET.setEnabled(true);
                    row7Set3wt_ET.setEnabled(true);
                    row7Set4wt_ET.setEnabled(true);
                    row7Set5wt_ET.setEnabled(true);
                    row7Set1wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row7Set2wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row7Set3wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row7Set4wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row7Set5wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    //unlock spinner
                    spinner7.setEnabled(true);
                }

            }
        });

        row8LockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (row8LockBtn.getTag().equals(false))
                {
                    row8LockBtn.setImageResource(R.drawable.iconfinder_finance__lock__security__safety_2538671);
                    row8LockBtn.setTag(true);
                    row8Delete.setVisibility(view.INVISIBLE);

                    //set rowRepsArray values to what is in the edit texts for this row
                    row8RepsArray[0] = spinner8.getSelectedItem().toString();
                    row8RepsArray[1] = row8Set1_ET.getText().toString();
                    row8RepsArray[2] = row8Set2_ET.getText().toString();
                    row8RepsArray[3] = row8Set3_ET.getText().toString();
                    row8RepsArray[4] = row8Set4_ET.getText().toString();
                    row8RepsArray[5] = row8Set5_ET.getText().toString();

                    //set values to row0RepWeightArray
                    row8RepWeightArray[0] = row8Set1wt_ET.getText().toString();
                    row8RepWeightArray[1] = row8Set2wt_ET.getText().toString();
                    row8RepWeightArray[2] = row8Set3wt_ET.getText().toString();
                    row8RepWeightArray[3] = row8Set4wt_ET.getText().toString();
                    row8RepWeightArray[4] = row8Set5wt_ET.getText().toString();

                    //print out array for testing
                    for (int i=0; i<row8RepsArray.length; i++)
                    {
                        System.out.println(row8RepsArray[i]);
                    }
                    for (int j=0; j<row8RepWeightArray.length; j++)
                    {
                        System.out.println(row8RepWeightArray[j]);
                    }

                    //lock edit texts
                    row8Set1_ET.setEnabled(false);
                    row8Set2_ET.setEnabled(false);
                    row8Set3_ET.setEnabled(false);
                    row8Set4_ET.setEnabled(false);
                    row8Set5_ET.setEnabled(false);
                    row8Set1_ET.setInputType(InputType.TYPE_NULL);
                    row8Set2_ET.setInputType(InputType.TYPE_NULL);
                    row8Set3_ET.setInputType(InputType.TYPE_NULL);
                    row8Set4_ET.setInputType(InputType.TYPE_NULL);
                    row8Set5_ET.setInputType(InputType.TYPE_NULL);

                    row8Set1wt_ET.setEnabled(false);
                    row8Set2wt_ET.setEnabled(false);
                    row8Set3wt_ET.setEnabled(false);
                    row8Set4wt_ET.setEnabled(false);
                    row8Set5wt_ET.setEnabled(false);
                    row8Set1wt_ET.setInputType(InputType.TYPE_NULL);
                    row8Set2wt_ET.setInputType(InputType.TYPE_NULL);
                    row8Set3wt_ET.setInputType(InputType.TYPE_NULL);
                    row8Set4wt_ET.setInputType(InputType.TYPE_NULL);
                    row8Set5wt_ET.setInputType(InputType.TYPE_NULL);

                    //lock spinner
                    spinner8.setEnabled(false);
                }
                else
                {
                    row8LockBtn.setImageResource(R.drawable.iconfinder_53__safety__security__unlock__unlocked_2538716);
                    row8LockBtn.setTag(false);
                    row8Delete.setVisibility(view.VISIBLE);

                    //unlock edit texts
                    row8Set1_ET.setEnabled(true);
                    row8Set2_ET.setEnabled(true);
                    row8Set3_ET.setEnabled(true);
                    row8Set4_ET.setEnabled(true);
                    row8Set5_ET.setEnabled(true);
                    row8Set1_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row8Set2_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row8Set3_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row8Set4_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row8Set5_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    row8Set1wt_ET.setEnabled(true);
                    row8Set2wt_ET.setEnabled(true);
                    row8Set3wt_ET.setEnabled(true);
                    row8Set4wt_ET.setEnabled(true);
                    row8Set5wt_ET.setEnabled(true);
                    row8Set1wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row8Set2wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row8Set3wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row8Set4wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row8Set5wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    //unlock spinner
                    spinner8.setEnabled(true);
                }

            }
        });

        row9LockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (row9LockBtn.getTag().equals(false))
                {
                    row9LockBtn.setImageResource(R.drawable.iconfinder_finance__lock__security__safety_2538671);
                    row9LockBtn.setTag(true);
                    row9Delete.setVisibility(view.INVISIBLE);

                    //set rowRepsArray values to what is in the edit texts for this row
                    row9RepsArray[0] = spinner9.getSelectedItem().toString();
                    row9RepsArray[1] = row9Set1_ET.getText().toString();
                    row9RepsArray[2] = row9Set2_ET.getText().toString();
                    row9RepsArray[3] = row9Set3_ET.getText().toString();
                    row9RepsArray[4] = row9Set4_ET.getText().toString();
                    row9RepsArray[5] = row9Set5_ET.getText().toString();

                    //set values to row0RepWeightArray
                    row9RepWeightArray[0] = row9Set1wt_ET.getText().toString();
                    row9RepWeightArray[1] = row9Set2wt_ET.getText().toString();
                    row9RepWeightArray[2] = row9Set3wt_ET.getText().toString();
                    row9RepWeightArray[3] = row9Set4wt_ET.getText().toString();
                    row9RepWeightArray[4] = row9Set5wt_ET.getText().toString();

                    //print out array for testing
                    for (int i=0; i<row9RepsArray.length; i++)
                    {
                        System.out.println(row9RepsArray[i]);
                    }
                    for (int j=0; j<row9RepWeightArray.length; j++)
                    {
                        System.out.println(row9RepWeightArray[j]);
                    }

                    //lock edit texts
                    row9Set1_ET.setEnabled(false);
                    row9Set2_ET.setEnabled(false);
                    row9Set3_ET.setEnabled(false);
                    row9Set4_ET.setEnabled(false);
                    row9Set5_ET.setEnabled(false);
                    row9Set1_ET.setInputType(InputType.TYPE_NULL);
                    row9Set2_ET.setInputType(InputType.TYPE_NULL);
                    row9Set3_ET.setInputType(InputType.TYPE_NULL);
                    row9Set4_ET.setInputType(InputType.TYPE_NULL);
                    row9Set5_ET.setInputType(InputType.TYPE_NULL);

                    row9Set1wt_ET.setEnabled(false);
                    row9Set2wt_ET.setEnabled(false);
                    row9Set3wt_ET.setEnabled(false);
                    row9Set4wt_ET.setEnabled(false);
                    row9Set5wt_ET.setEnabled(false);
                    row9Set1wt_ET.setInputType(InputType.TYPE_NULL);
                    row9Set2wt_ET.setInputType(InputType.TYPE_NULL);
                    row9Set3wt_ET.setInputType(InputType.TYPE_NULL);
                    row9Set4wt_ET.setInputType(InputType.TYPE_NULL);
                    row9Set5wt_ET.setInputType(InputType.TYPE_NULL);

                    //lock spinner
                    spinner9.setEnabled(false);
                }
                else
                {
                    row9LockBtn.setImageResource(R.drawable.iconfinder_53__safety__security__unlock__unlocked_2538716);
                    row9LockBtn.setTag(false);
                    row9Delete.setVisibility(view.VISIBLE);

                    //unlock edit texts
                    row9Set1_ET.setEnabled(true);
                    row9Set2_ET.setEnabled(true);
                    row9Set3_ET.setEnabled(true);
                    row9Set4_ET.setEnabled(true);
                    row9Set5_ET.setEnabled(true);
                    row9Set1_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row9Set2_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row9Set3_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row9Set4_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row9Set5_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    row9Set1wt_ET.setEnabled(true);
                    row9Set2wt_ET.setEnabled(true);
                    row9Set3wt_ET.setEnabled(true);
                    row9Set4wt_ET.setEnabled(true);
                    row9Set5wt_ET.setEnabled(true);
                    row9Set1wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row9Set2wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row9Set3wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row9Set4wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);
                    row9Set5wt_ET.setInputType(InputType.TYPE_CLASS_NUMBER);

                    //unlock spinner
                    spinner9.setEnabled(true);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.logs_toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {

            case R.id.logstoolbar_Home:
                Toast.makeText(this,"Home",Toast.LENGTH_SHORT).show();
                //navigate to LogActivity for now until date loading page is set up
                Intent intent = new Intent(LogActivity.this, MainActivity.class);
                startActivity(intent);
                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String exerciseChoice = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + exerciseChoice, Toast.LENGTH_LONG).show();

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

}
/* Make an exercise log that has pulldowns for the type of exercise,
then next to each exercise will be options for more pull downs for number of reps
have a progress tab that graphs out progress for a chosen amount of time
by exercise for heaviest amount and also rep amounts and total weight lifted
 */

//https://www.youtube.com/watch?v=j6TDDw-3TXA

/*
Need fragments for:
-loading profile
-loading a log date
-loading a graph fragment with options of what to graph
-loading settings
 */

/*
I believe what is currently in the main activity will need partially moved to its own activity
called LogActivity see the fragments video
https://www.youtube.com/watch?v=UqtsyhASW74
 */

/*
Need to fix jumpiness bug when scrolling up and down in the logs
 */

/*
need addtextchange listeners for weight and rep text fields to save to sqlite with every change

EditText etValue = (EditText) findViewById(R.id.etValue);
etValue.addTextChangedListener(new TextWatcher() {
	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		// Fires right as the text is being changed (even supplies the range of text)
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {
		// Fires right before text is changing
	}

	@Override
	public void afterTextChanged(Editable s) {
		// Fires right after the text has changed
		// updateData_liftingLogs_table - update entire sqlite database row here by selecting row based on
		// profile, logdate, splitlabel, and rownumber that should be enough to uniquely identify
		// the correct sqlite db row
		// if the row doesn't exist yet, then it will insert it with
		// insertData_liftingLogs_table
	}
});
 */

/*
NEED TO MAKE THE LOG ACTIVITY ONLY AVAILABLE AFTER CHOOSING PROFILE FROM PROFILE FRAGMENT,
AND DATE AND SPLIT FROM LOGDATE FRAGMENT - use intents
 */