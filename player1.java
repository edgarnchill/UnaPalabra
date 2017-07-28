package com.idtech.edgartorrellas.unapalabra;

import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by iD Student on 7/26/2017.
 */

public class player1 {

public player1(){

}


    public int getScore()
    {

        return score;
    }

    public void scoreSystem(EditText oneword) {



            for (int i = 0; i < oneword.getText().toString().length(); i++) {
                score++;
            }

    }


    public int score = 0;
