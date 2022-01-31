package com.example.uniconvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);
        EditText editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//                Toast.makeText(MainActivity.this, "Hi it worked!!", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.205 * kg;
                textView.setText("The corresponding value in pounds is " + pound);
            }
        });

        Button button2 = findViewById(R.id.button2);
        TextView textView2 = findViewById(R.id.textView4);
        EditText editText2 = findViewById(R.id.editTextNumber);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//                Toast.makeText(MainActivity.this, "Hi it worked!!", Toast.LENGTH_SHORT).show();
                String s2 = editText2.getText().toString();
                int pound2 = Integer.parseInt(s2);
                double kg2 = pound2 / 2.205;
                textView2.setText("The corresponding value in Kgs is " + kg2);
            }
        });
    }
}