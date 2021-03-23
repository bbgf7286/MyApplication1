package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button enterButton;
    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterButton.findViewById(R.id.enterButton);
        textView.findViewById(R.id.textView);
        editText.findViewById(R.id.editTextName);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                if(name.isEmpty()) {
                    textView.setText("Hello,Bengü");
                }else {
                    textView.setText("Hello " +name);


                }
            }
        });

    }




}