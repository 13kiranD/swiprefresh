package com.kiran.swiprefresh;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.mySwipe);
        //TextView textView= (TextView) findViewById(R.id.myTextView);
        TextView textView= (TextView) findViewById(R.id.myTextView);
        SwipeRefreshLayout.setOnRefreshListner (new SwipeRefreshLayout.onRefreshListner())

    }
}
