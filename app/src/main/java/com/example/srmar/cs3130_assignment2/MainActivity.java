package com.example.srmar.cs3130_assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = (EditText) findViewById(R.id.editText);
        final TextView textView = (TextView) findViewById(R.id.textView);
        final Button enter = (Button) findViewById(R.id.button);

        enter.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String password = editText.getText().toString();
                Validate v1 = new Validate();
                if(v1.Validate(password) == true){
                    textView.setText("Password is strong!");
                }
                else{
                    textView.setText("Password is not strong enough!");
                }
            }
        });
        Button reset = (Button) findViewById(R.id.button2);
        reset.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView.setText("Enter your password!");
                editText.setText("");
            }
        });
    }
}
