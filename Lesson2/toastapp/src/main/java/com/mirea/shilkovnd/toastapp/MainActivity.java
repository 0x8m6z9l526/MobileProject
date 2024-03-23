package com.mirea.shilkovnd.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(getApplicationContext(),
                "Здравствуй MIREA!",
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickButton(View view){
        EditText text = findViewById(R.id.inputText);
        int founded_X = text.getText().toString().length();

        Toast toastStudent = Toast.makeText(getApplicationContext(),
                String.format("СТУДЕНТ № 33 ГРУППА БСБО-06-22 Количество символов - %d", founded_X),
                Toast.LENGTH_LONG);
        toastStudent.show();
    }
}