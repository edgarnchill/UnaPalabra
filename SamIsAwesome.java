package com.idtech.edgartorrellas.unapalabra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by iD Student on 7/27/2017.
 */

public class SamIsAwesome extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awesome_layout);





    }

public void toGame (View view) {

Intent intent = new Intent(this, MainActivity.class);
    startActivity(intent);


}



}
