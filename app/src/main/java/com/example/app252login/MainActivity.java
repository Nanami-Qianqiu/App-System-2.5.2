package com.example.app252login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button login;
    TextView text;
    EditText n, p;
    static final String Username = "Nanami_Chiaki", Password = "03140719";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.button);
        text = findViewById(R.id.text);
        n = findViewById(R.id.username);
        p = findViewById(R.id.password);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name = n.getText().toString();
        String pass = p.getText().toString();
        if (name.equals(Username) && pass.equals(Password)){
            text.setTextColor(ContextCompat.getColor(this, R.color.new_green));
            text.setText(getResources().getText(R.string.correct));
        }
        else{
            text.setTextColor(ContextCompat.getColor(this, R.color.red));
            text.setText(getResources().getText(R.string.wrong));
            n.setText("");
            p.setText("");
        }
    }
}