package com.example.liftinglogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class profile_fragment extends Fragment
{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState)
    {
        final View view = inflater.inflate(R.layout.profile_fragment, container, false);
        final LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.profileLinearLayout);

        //Add new user button added programmatically
        Button addNewProfileBtn = new Button(view.getContext());
        addNewProfileBtn.setText("Add New User Profile");
        final Button deleteProfileBtn = new Button(view.getContext());
        deleteProfileBtn.setText("Delete User Profile");

        final Space spacer = new Space(view.getContext());
        spacer.setMinimumHeight(80);

        linearLayout.addView(addNewProfileBtn);
        linearLayout.addView(deleteProfileBtn);
        linearLayout.addView(spacer);
        deleteProfileBtn.setVisibility(View.INVISIBLE);
        spacer.setVisibility(View.INVISIBLE);

        addNewProfileBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //if linear layout doesn't contain deleteProfileBtn add it with spacer before the new user
                if (deleteProfileBtn.getVisibility() == View.INVISIBLE)
                {
                    deleteProfileBtn.setVisibility(View.VISIBLE);
                    spacer.setVisibility(View.VISIBLE);
                }

                String userProfileName;
                //NEED TO POP UP A TEXT FIELD TO ENTER THE PROFILE NAME userProfileName
                //and ok button to accept the name or cancel button to exit out
                TextView enterName = new TextView(view.getContext());
                linearLayout.addView(enterName);




                //then delete text field and the accept button and add the new user button

                //addNewUserBtnClick(linearLayout, userProfileName);

            }



        });

        deleteProfileBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Have a way to choose which user to delete
                //then have a good way to confirm the delete
                //then delete the profile and its data from sql tables
            }
        });


        return view;
    }

    public void addNewUserBtnClick(LinearLayout linearLayout, String userProfileName)
    {
        //bring up text field to enter name of new user
        //add the user to sql database profile table
        //add the user to a list?
        //add a new button for the user to be selected on this screen

        //NEED TO DETERMINE HOW TO BE ABLE TO DO THIS OVER AND OVER PROGRAMMATICALLY for each profile
        Button btn1 = new Button(getView().getContext());
        btn1.setText(userProfileName);

        linearLayout.addView(btn1);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // switch to this profile

            }
        });
    }
}

//https://www.youtube.com/watch?v=UqtsyhASW74
//SEE YOUR EDX FINAL PROJECT FOR IDEAS