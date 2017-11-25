package com.example.user.vibh_assignment101;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//Declaring class which is extending the AppCompatActivity class.
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button submitButton;   //Button to display fragment in FrameLayout.

    @Override
    //onCreate method.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);    //Setting contentView with UI.

        submitButton=(Button)findViewById(R.id.submit_btn);    //Setting Button object with its Id in UI.

        submitButton.setOnClickListener(this);    //Setting onClickListener to the button.

    }

    @Override
    //Creating onClick event when button is clicked.
    public void onClick(View v)
    {
        Fragment fragment=null;
        //Declaring fragment to display content in FrameLayout, and initialized to null so that it will not contain any grabage value.

        //Checking weather user has clicked button or something else.
        if(v.getId()==R.id.submit_btn)
        {
            fragment = new SimpleAddition();   //Creating new fragment of name SimpleAddition.
        }

        //Creating object of FragmentManager to handle switching from one fragment to other.
        FragmentManager fragmentManager=getSupportFragmentManager();

        //Creating object of FragmentTransaction to begin the switch from one fragment to another.
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        //Loading fragment in the container.
        fragmentTransaction.replace(R.id.fragment_loading_area,fragment);

        //Starting the fragment transaction.
        fragmentTransaction.commit();

    }
}   ///End of MainActivity class.
