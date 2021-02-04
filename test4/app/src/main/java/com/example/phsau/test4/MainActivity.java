package com.example.phsau.test4;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener{

    private GestureDetectorCompat gestureDetector;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickMe = (Button)findViewById(R.id.clickMe);
        textView = (TextView)findViewById(R.id.textView);
        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Its Working");
            }
        }
        );

        clickMe.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                textView.setText("Its really Looooooooooonggg!");
                return false;
            }
        }
        );


    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        textView.setText("Single Tap");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        textView.setText("Double Tap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        textView.setText("Double Tap Event");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        textView.setText("Down");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        textView.setText("Press");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        textView.setText("Single Tap Up");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        textView.setText("Scroll");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        textView.setText("Single Tap");

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        textView.setText("Fling");
        return true;
    }
}
