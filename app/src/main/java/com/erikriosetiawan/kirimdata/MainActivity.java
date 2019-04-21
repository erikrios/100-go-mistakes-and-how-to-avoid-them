package com.erikriosetiawan.kirimdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.erikriosetiawan.kirimdata.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kirimPesan(View view) {

        Intent moveIntent = new Intent(MainActivity.this, SecondActivity.class);
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();
        moveIntent.putExtra(EXTRA_MESSAGE, message);
        startActivity(moveIntent);
    }
}
