package com.example.user.vibh_assignment101;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


//Creating class for fragment which is extending Fragment class from support library.
public class SimpleAddition extends android.support.v4.app.Fragment {

    EditText numberTaker;      //Declaring object of EditText to take input number from user.
    TextView numberTaken;      //TextView on the fragment area to display the number taken by the user.

    @Nullable
    @Override
    //onCreateView method to create the View and load into the Fragment area.
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Initializing View from the xml file simple_addition with the help of inflater.
        View view = inflater.inflate(R.layout.activity_simple_addition,null);

        //Setting EditText with its Id in the main activity.
        numberTaker=(EditText)getActivity().findViewById(R.id.number_taker);

        //Storing the number Entered in the EditText in the String.
        String numberStored=numberTaker.getText().toString();

        //Setting TextView with its Id in the fragment.
        numberTaken=(TextView)view.findViewById(R.id.number_taken);

        numberTaken.setText(numberStored);    //Setting Text which is taken from EditText.

        return view;      //returning view.
    }

}    //End of fragment named SimpleAddition.