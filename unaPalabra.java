

package com.idtech.edgartorrellas.unapalabra;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;


public class MainActivity extends AppCompatActivity {


    public EditText oneword;
    public TextView displayword;
    String fullStory;
    int count = 0;
    player1 playOne = new player1();
    player1 playTwo = new player1();
    public int score;
    public TextView first;
    public TextView second;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }


    public void startMe (View view) {
        String[] openingLine = {"A big brown dog ", "The chubby dolphin ", "The die has been cast","The early bird catches the worm","The elephant in the room","The emperor's new clothes","The ends of the earth","The exception which proves the rule","The face that launched a thousand ships","The fat of the land","The female of the species is more deadly then the male","The fifth estate","The floozie in the jacuzzi","The fly in the ointment","The full monty","The game is afoot","The game is up","The great unwashed","The hair of the dog that bit you","The hairy eyeball","The heebie-jeebies","The jury is still out","The land of nod","The last straw","The law is an", "The life of Riley","The living daylights","The love that dare not speak its name","The monstrous regiment of women"};
        int startPhrase;
        Random random = new Random();
        startPhrase = random.nextInt(openingLine.length);
        TextView tv = (TextView) findViewById(R.id.story);
        tv.setText(openingLine[startPhrase]);



    }

    public void restartGame(View view) {

        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);

    }



    public void enterWord (View view) {



        oneword = (EditText) findViewById(R.id.editText);
        fullStory = fullStory + " " + (oneword.getText().toString());
        if(count == 0)
        {
            String toBeReplaced = fullStory.substring(0, 5);
            fullStory = fullStory.replace(toBeReplaced,"");
            count++;

        }
        displayword = (TextView) findViewById(R.id.userInput);
         displayword.setText(fullStory);

    }

    public void wrongInput1 (View view) {

        score = score - oneword.length();
        String textScore;
        first = (TextView) findViewById(R.id.p1score);
        score = playOne.getScore();
        textScore = Integer.toString(score);
        first.setText(textScore);

    }

    public void wrongInput2 (View view) {

        score = score - oneword.length();
        String textScore;
        second = (TextView) findViewById(R.id.p2score);
        score = playTwo.getScore();
        textScore = Integer.toString(score);
        second.setText(textScore);


    }

    public void correctInput (View view) {

        String textScore;
        playOne.scoreSystem(oneword);
        first = (TextView) findViewById(R.id.p1score);
        score = playOne.getScore();
        textScore = Integer.toString(score);
        first.setText(textScore);
        if (score >= 100) {
            Toast.makeText(getApplicationContext(), "Player 1 Wins!", Toast.LENGTH_LONG).show();
            score = score - 100;
        }
        }
    public void correctInput2 (View view) {


        String textScore;
        playTwo.scoreSystem(oneword);
        second = (TextView) findViewById(R.id.p2score);
        score = playTwo.getScore();
        textScore = Integer.toString(score);
        second.setText(textScore);
        if (score >= 100) {
            Toast.makeText(getApplicationContext(), "Player 2 Wins!", Toast.LENGTH_LONG).show();
            score = score - 100;
        }

    }



    }

