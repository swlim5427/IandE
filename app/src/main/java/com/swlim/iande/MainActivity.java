package com.swlim.iande;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "TestEvent1";
    private TextView mText;

    public MainActivity(){
    }
    class ButtonWhite_OnClickListener implements OnClickListener{
        public void onClick(View v){
            mText.setBackgroundColor(Color.TRANSPARENT);
        }
    }
    class ButtonRed_OnClickListener implements OnClickListener{
        public void onClick(View v){
            mText.setBackgroundColor(Color.RED);
        }
    }
    class ButtonGreen_OnClickListener implements OnClickListener{
        public void onClick(View v){
            mText.setBackgroundColor(Color.GREEN);
        }
    }
//    private ButtonRed_OnClickListener mListener1 = new ButtonRed_OnClickListener();
//    private ButtonGreen_OnClickListener mListener2 = new ButtonGreen_OnClickListener();

    public void onCreate(Bundle saveIntanceState){
        super.onCreate(saveIntanceState);
        setContentView(R.layout.activity_main);
        mText = (TextView) findViewById(R.id.textView);
        final Button ButtonRed = (Button) findViewById(R.id.redbutton);
        final Button ButtonGreen = (Button) findViewById(R.id.greenbutton);
        final Button ButtonWhite = (Button) findViewById(R.id.whitebutton);
        ButtonRed.setOnClickListener(new ButtonRed_OnClickListener());
        ButtonGreen.setOnClickListener(new ButtonGreen_OnClickListener());

        ButtonWhite.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                mText.setBackgroundColor(Color.TRANSPARENT);
            }
        });
    }

//    @Override
//    public void onCreate(Bundle saveInstanceState){
//        super.onCreate(saveInstanceState);//调用父类的onCreate方法1111
//        setContentView(R.layout.activity_main);
//        final TextView Text = (TextView) findViewById(R.id.textView);
//        final Button ButtonRed = (Button) findViewById(R.id.redbutton);
//        final Button ButtonGreen = (Button) findViewById(R.id.greenbutton);
//        ButtonRed.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Text.setBackgroundColor(Color.RED);
//            }
//        });
//        ButtonGreen.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Text.setBackgroundColor(Color.GREEN);
//            }
//        });
//    }

}
