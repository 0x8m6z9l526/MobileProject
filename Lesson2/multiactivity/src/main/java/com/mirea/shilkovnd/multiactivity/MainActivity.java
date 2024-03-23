package com.mirea.shilkovnd.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate (ACTIVITY-1)");
    }
    public void onClickNewActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
    public void onClickDoSend(View view) {
        EditText text = findViewById(R.id.TextInputer);
        String myText = text.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("string", myText);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart (ACTIVITY-1)");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume (ACTIVITY-1)");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause (ACTIVITY-1)");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop (ACTIVITY-1)");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart (ACTIVITY-1)");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy (ACTIVITY-1)");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i(TAG, "onDetachedFromWindow (ACTIVITY-1)");
    }
}