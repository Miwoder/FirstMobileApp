package by.govoronok.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import by.govoronok.firstapp.text.TextFunctionRenamed;

//TODO FIRST APP

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int count = 0; count < 10; count++) {
            Log.d("MainActivity", " counter = " + count);
        }
        displayText();
    }

    private void displayText() {
        TextFunctionRenamed tf = new TextFunctionRenamed();
        TextView nt = findViewById(R.id.newtest);
        nt.setText(tf.getValue());
    }
}