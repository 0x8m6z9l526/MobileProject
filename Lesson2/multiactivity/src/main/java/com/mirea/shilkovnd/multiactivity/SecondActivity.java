package com.mirea.shilkovnd.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.TextView);
        Bundle arguments = getIntent().getExtras();
        if(arguments!=null) {
            String text = arguments.get("string").toString();
            textView.setText(text);
        }

        Log.i(TAG, "onCreate (ACTIVITY-2)");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart (ACTIVITY-2)");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume (ACTIVITY-2)");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause (ACTIVITY-2)");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop (ACTIVITY-2)");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart (ACTIVITY-2)");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy (ACTIVITY-2)");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i(TAG, "onDetachedFromWindow (ACTIVITY-2)");
    }

}