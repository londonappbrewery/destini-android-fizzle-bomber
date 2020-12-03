package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mTextView ;
    Button mButtonTop;
    Button mButtonDown;
    private int mStoryIndex = 1;
    private int path  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = findViewById(R.id.storyTextView);
        mButtonDown = findViewById(R.id.buttonBottom);
        mButtonTop = findViewById(R.id.buttonTop);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1 ) {
                    mTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonDown.setText(R.string.T3_Ans2);
                    mStoryIndex = mStoryIndex + 1;
                    path = 1;
                }
                else if(mStoryIndex==2 && path == 1){
                    mTextView.setText(R.string.T6_End);
                    mButtonDown.setVisibility(View.GONE);
                    mButtonTop.setVisibility(View.GONE);
                }
                else if(mStoryIndex ==2 && path==2){
                    mTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonDown.setText(R.string.T3_Ans2);
                    mStoryIndex = mStoryIndex + 1;
                }
                else
                {
                    mTextView.setText(R.string.T6_End);
                    mButtonDown.setVisibility(View.GONE);
                    mButtonTop.setVisibility(View.GONE);
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        View.OnClickListener mListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1) {
                    mTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonDown.setText(R.string.T2_Ans2);
                    mStoryIndex = mStoryIndex + 1;
                    path = 2;
                }
                else if(mStoryIndex ==2 && path==1){
                    mTextView.setText(R.string.T5_End);
                    mButtonDown.setVisibility(View.GONE);
                    mButtonTop.setVisibility(View.GONE);
                }
                else if(mStoryIndex ==2 && path==2){
                    mTextView.setText(R.string.T4_End);
                    mButtonDown.setVisibility(View.GONE);
                    mButtonTop.setVisibility(View.GONE);
                }

            }
        };

        mButtonDown.setOnClickListener(mListener);

    }
}
