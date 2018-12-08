package com.codenamerockey.colortap.colortap;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
// connecting the layout  views/widgets to the java code and the mainActivity
    private View windowView;
    private Button tapMeButton;
    private int [ ] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //instantiating / creating a new Array and right away inserting items in this array
        colors = new int[ ] {Color.CYAN, Color.GREEN, Color.RED, Color.BLUE, Color.BLACK, Color.DKGRAY,
        Color.LTGRAY, Color.MAGENTA, Color.YELLOW, Color.GRAY, Color.rgb(86, 66, 244),
        Color.rgb(127, 39, 221), Color.rgb(139, 196, 133), Color.rgb(30, 68, 26),
        Color.rgb(175, 186, 61), Color.rgb(165, 149, 0), Color.rgb(204, 105, 87),
        Color.rgb(51, 7, 0), Color.rgb(175, 88, 7), Color.rgb(249, 0, 229),
        Color.rgb(79, 7, 73), Color.rgb(187, 196, 141), Color.rgb(110, 255, 0),
        Color.rgb(4, 242, 155), Color.rgb(181, 255, 227), Color.rgb(106, 196, 226),
        Color.rgb(5, 139, 183), Color.rgb(160, 8, 147), Color.rgb(8, 15, 160)};

        windowView = findViewById(R.id.windowViewId);


        tapMeButton = (Button) findViewById(R.id.tapMeButton);
        tapMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // creating a variable that stores the length of your array
                int colorArrayLength = colors.length;

                //Creating a Random Number Object/ Instantiating  a Random number Object
                Random random = new Random();
                int randomNumber = random.nextInt(colorArrayLength);

                // setting the background of the  view with the index 2 color
                // windowView.setBackgroundColor(colors[2]);

                //setting the background of the view with your random colors array
                windowView.setBackgroundColor(colors[randomNumber]);
               // Log.d("Test" , "Tap");
            }
        });





    }
}
