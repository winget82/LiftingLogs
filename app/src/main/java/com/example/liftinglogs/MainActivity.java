package com.example.liftinglogs;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import androidx.viewpager.widget.ViewPager;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;
import java.util.ArrayList;


/*
NEED A SPLASH SCREEN / HOME SCREEN

NEED A GRAPH SCREEN

NEED A SCREEN TO LOAD PREVIOUS DATES

NEED A NAVIGATION BAR AT TOP OF SCREEN LAYOUT AND SOMETHING THAT SHOWS THE DATE LOADED / VISIBLE
 */

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    //arraylist for current relative layout
    ArrayList<String> relativeLayoutList = new ArrayList<>();

    private SectionsStatePagerAdapter mSectionsStatePagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);


        mSectionsStatePagerAdapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        setUpViewPager(mViewPager);


    }

    private void setUpViewPager(ViewPager viewPager)
    {
        SectionsStatePagerAdapter adapter = new SectionsStatePagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new home_fragment(), "home_fragment");
        adapter.addFragment(new profile_fragment(), "profile_fragment");
        adapter.addFragment(new logdate_fragment(), "logdate_fragment");
        adapter.addFragment(new graph_fragment(), "graph_fragment");
        adapter.addFragment(new settings_fragment(), "settings_fragment");

        viewPager.setAdapter(adapter);
    }

    public void setViewPager(int fragmentNumber)
    {
        mViewPager.setCurrentItem(fragmentNumber);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.toolbar_profile:
                Toast.makeText(this,"Profile",Toast.LENGTH_SHORT).show();
                MainActivity.this.setViewPager(1);
                return true;

            case R.id.toolbar_logDate:
                Toast.makeText(this,"Log Date",Toast.LENGTH_SHORT).show();
                MainActivity.this.setViewPager(2);
                return true;

            case R.id.toolbar_currentLog:
                Toast.makeText(this,"Log",Toast.LENGTH_SHORT).show();
                //navigate to LogActivity for now until date loading page is set up
                Intent intent = new Intent(MainActivity.this, LogActivity.class);
                startActivity(intent);
                return true;

            case R.id.toolbar_graph:
                Toast.makeText(this,"Graph",Toast.LENGTH_SHORT).show();
                MainActivity.this.setViewPager(3);
                return true;

            case R.id.toolbar_settings:
                Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show();
                MainActivity.this.setViewPager(4);
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