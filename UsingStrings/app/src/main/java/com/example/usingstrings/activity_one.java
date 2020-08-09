package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityOne extends AppCompatActivity {

    TextView textView;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        textView = findViewById(R.id.textView);
        textView.setText(R.string.Msg1);

        Log.i( "Lifecycle", "OnCreate() Invoked");

        textView4 = findViewById(R.id.textView4);
        textView4.setText(R.string.Msg2);
    }

    public void onStart(){
        super.onStart();
        Log.i( "Lifecycle", "OnStart() Invoked");
    }

    public void onRestart(){
        super.onRestart();
        Log.i( "Lifecycle", "OnRestart() Invoked");
    }

    public void onResume(){
        super.onResume();
        Log.i( "Lifecycle", "onResume() Invoked");
    }

    public void onPause(){
        super.onPause();
        Log.i( "Lifecycle", "onPause() Invoked");
    }

    public void onStop(){
        super.onStop();
        Log.i( "Lifecycle", "onStop() Invoked");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.i( "Lifecycle", "onDestroy() Invoked");
    }
}