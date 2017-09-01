package com.example.android.project3quizzapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.android.project3quizzapp.R.id.editText;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//       Get the id of the button that submits the quiz
        final Button submitButton = (Button) findViewById(R.id.submit_button);
        submitButton.setEnabled(true);


//      // Set a click listener on the button
        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

                //Access the RadioGroup view and save it to a variable.
                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.q_1_rg);

                //Get the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId = radioGroup.getCheckedRadioButtonId();

                //Use if statements to respond based on whether
                //it is the id of the correct answer.
                if (solutionId == R.id.q_1c) {
                    score += 10;
                } else {
                    score += 0;
                }


                //Access the RadioGroup2 view and save it to a variable.
                RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.q_2_rg);

                //Get the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId2 = radioGroup2.getCheckedRadioButtonId();

                //Use if statements to respond based on whether
                //it is the id of the correct answer.
                if (solutionId2 == R.id.q_2c) {
                    score += 10;
                } else {
                    score += 0;
                }

                //Access the RadioGroup3 view and save it to a variable.
                RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.q_3_rg);

                //Get the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId3 = radioGroup3.getCheckedRadioButtonId();

                //Use if statements to respond based on whether
                //it is the id of the correct answer.
                if (solutionId3 == R.id.q_3a) {
                    score += 10;
                } else {
                    score += 0;
                }

                //Access the RadioGroup4 view and save it to a variable.
                RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.q_4_rg);

                //Get the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId4 = radioGroup4.getCheckedRadioButtonId();

                //Use if statements to respond based on whether
                //it is the id of the correct answer.
                if (solutionId4 == R.id.q_4b) {
                    score += 10;
                } else {
                    score += 0;
                }

                //Access the RadioGroup5 view and save it to a variable.
                RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.q_5_rg);

                //Get the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId5 = radioGroup5.getCheckedRadioButtonId();

                //Use if statements to respond based on whether
                //it is the id of the correct answer.
                if (solutionId5 == R.id.q_5c) {
                    score += 10;
                } else {
                    score += 0;
                }

                //Access the RadioGroup6 view and save it to a variable.

                RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.q_6_rg);


                //Get the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId6 = radioGroup6.getCheckedRadioButtonId();

                //Use if statements to respond based on whether
                //it is the id of the correct answer.
                if (solutionId6 == R.id.q_6b) {
                    score += 10;
                } else {
                    score += 0;
                }
                //Access the RadioGroup5 view and save it to a variable.
                RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.q_7_rg);

                //Get the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId7 = radioGroup7.getCheckedRadioButtonId();

                //Use if statements to respond based on whether
                //it is the id of the correct answer.
                if (solutionId7 == R.id.q_7a) {
                    score += 10;
                } else {
                    score += 0;
                }

                //Access the RadioGroup5 view and save it to a variable.
                RadioGroup radioGroup8 = (RadioGroup) findViewById(R.id.q_8_rg);

                //Get the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId8 = radioGroup8.getCheckedRadioButtonId();

                //Use if statements to respond based on whether
                //it is the id of the correct answer.
                if (solutionId8 == R.id.q_8b) {
                    score += 10;
                } else {
                    score += 0;
                }


                submitButton.setEnabled(false);

                EditText nameField = (EditText) findViewById(editText);
                String name = nameField.getText().toString();
                Context context = getApplicationContext();
                CharSequence text = name + " Your score is: " + score + " points out of a possible 100 points";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }

        });




        // Get the id of the button that clear the result of the quiz
        Button clearButton = (Button) findViewById(R.id.clear_button);

        // Set a click listener on the button

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                submitButton.setEnabled(true);

                // clear the selected radio button in the radio group
                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.q_1_rg);
                radioGroup.clearCheck();

                // clear the selected radio button in the radio group
                RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.q_2_rg);
                radioGroup2.clearCheck();

                // clear the selected radio button in the radio group
                RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.q_3_rg);
                radioGroup3.clearCheck();

                // clear the selected radio button in the radio group
                RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.q_4_rg);
                radioGroup4.clearCheck();

                // clear the selected radio button in the radio group
                RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.q_5_rg);
                radioGroup5.clearCheck();

                // clear the selected radio button in the radio group
                RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.q_6_rg);
                radioGroup6.clearCheck();

                // clear the selected radio button in the radio group
                RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.q_7_rg);
                radioGroup7.clearCheck();

                // clear the selected radio button in the radio group
                RadioGroup radioGroup8 = (RadioGroup) findViewById(R.id.q_8_rg);
                radioGroup8.clearCheck();


                // clear the name in the edit text field
                EditText myEditText = ((EditText) findViewById(R.id.editText));
                myEditText.setText("");
                Context context = getApplicationContext();
                CharSequence text = "You ready to go again?";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


            }

    });
        }}


