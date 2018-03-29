package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String answerOne;
    boolean answerTwoCorrect;
    boolean answerTwoZeroWrong;
    boolean answerTwoOneWrong;
    boolean answerTwoTwoWrong;
    boolean answerThreeCorrect;
    boolean answerThreeNoWrong;
    boolean answerThreeMaybeWrong;
    String answerFour;
    boolean answerFiveCorrect;
    boolean answerFiveNoWrong;
    boolean answerFiveMaybeWrong;

    EditText answerOneET;
    CheckBox answerTwoBoxZero;
    CheckBox answerTwoBoxOne;
    CheckBox answerTwoBoxTwo;
    CheckBox answerTwoBoxFour;
    RadioButton answerThreeRadioYes;
    RadioButton answerThreeRadioNo;
    RadioButton answerThreeRadioMaybe;
    EditText answerFourET;
    RadioButton answerFiveRadioYes;
    RadioButton answerFiveRadioNo;
    RadioButton answerFiveRadioMaybe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerOneET = findViewById(R.id.your_name);
        answerTwoBoxZero = findViewById(R.id.checkboxZero);
        answerTwoBoxOne = findViewById(R.id.checkboxOne);
        answerTwoBoxTwo = findViewById(R.id.checkboxTwo);
        answerTwoBoxFour = findViewById(R.id.checkboxFour);
        answerThreeRadioYes = findViewById(R.id.radioYes);
        answerThreeRadioNo = findViewById(R.id.radioNo);
        answerThreeRadioMaybe = findViewById(R.id.radioMaybe);
        answerFourET = findViewById(R.id.catEmoji);
        answerFiveRadioYes = findViewById(R.id.radioYesTwo);
        answerFiveRadioNo = findViewById(R.id.radioNoTwo);
        answerFiveRadioMaybe = findViewById(R.id.radioMaybeTwo);


    }

    public void checkAnswer(View view) {
        int numberCorrect = 0;


        answerOne = answerOneET.getText().toString();
        answerTwoCorrect = answerTwoBoxFour.isChecked();
        answerThreeCorrect = answerThreeRadioYes.isChecked();
        answerFour = answerFourET.getText().toString();
        answerFiveCorrect = answerFiveRadioYes.isChecked();

        answerTwoZeroWrong = answerTwoBoxZero.isChecked();
        answerTwoOneWrong = answerTwoBoxOne.isChecked();
        answerTwoTwoWrong = answerTwoBoxTwo.isChecked();
        answerThreeNoWrong = answerThreeRadioNo.isChecked();
        answerThreeMaybeWrong = answerThreeRadioMaybe.isChecked();
        answerFiveNoWrong = answerFiveRadioNo.isChecked();
        answerFiveMaybeWrong = answerFiveRadioMaybe.isChecked();


        if (answerOne.equals("Your Name")) {
            numberCorrect += 1;
            answerOneET.setBackgroundResource(R.color.colorCorrect);
        } else {
            answerOneET.setBackgroundResource(R.color.colorWrong);
        }

        if (answerTwoCorrect && !answerTwoZeroWrong && answerTwoOneWrong && answerTwoTwoWrong) {
            numberCorrect += 1;
            answerTwoBoxZero.setBackgroundResource(R.color.cardBackground);
            answerTwoBoxOne.setBackgroundResource(R.color.colorCorrect);
            answerTwoBoxTwo.setBackgroundResource(R.color.colorCorrect);
            answerTwoBoxFour.setBackgroundResource(R.color.colorCorrect);

        } else {

            if (answerTwoZeroWrong) {
                answerTwoBoxZero.setBackgroundResource(R.color.colorWrong);
            }
            if (answerTwoOneWrong) {
                answerTwoBoxOne.setBackgroundResource(R.color.colorWrong);
            }
            if (answerTwoTwoWrong) {
                answerTwoBoxTwo.setBackgroundResource(R.color.colorWrong);
            }
            if (answerTwoCorrect) {
                answerTwoBoxFour.setBackgroundResource(R.color.colorWrong);
            }
        }

        if (answerThreeCorrect) {
            numberCorrect += 1;
            answerThreeRadioYes.setBackgroundResource(R.color.colorCorrect);
            answerThreeRadioNo.setBackgroundResource(R.color.cardBackground);
            answerThreeRadioMaybe.setBackgroundResource(R.color.cardBackground);
        } else {

            if (answerThreeNoWrong) {
                answerThreeRadioNo.setBackgroundResource(R.color.colorWrong);
            }
            if (answerThreeMaybeWrong) {
                answerThreeRadioMaybe.setBackgroundResource(R.color.colorWrong);
            }
        }

        if (answerFour.equals("cat")) {
            numberCorrect += 1;
            answerFourET.setBackgroundResource(R.color.colorCorrect);
        } else {
            answerFourET.setBackgroundResource(R.color.colorWrong);
        }

        if (answerFiveCorrect) {
            numberCorrect += 1;
            answerFiveRadioYes.setBackgroundResource(R.color.colorCorrect);
            answerFiveRadioNo.setBackgroundResource(R.color.cardBackground);
            answerFiveRadioMaybe.setBackgroundResource(R.color.cardBackground);
        } else {
            if (answerFiveNoWrong) {
                answerFiveRadioNo.setBackgroundResource(R.color.colorWrong);
            }
            if (answerFiveMaybeWrong) {
                answerFiveRadioMaybe.setBackgroundResource(R.color.colorWrong);
            }
        }


        Toast toast = Toast.makeText(this, "You have " + numberCorrect + " correct out of 5", Toast.LENGTH_LONG);
        toast.show();
    }
}
