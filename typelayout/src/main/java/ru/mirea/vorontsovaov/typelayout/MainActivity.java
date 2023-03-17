package ru.mirea.vorontsovaov.typelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvMirea = findViewById(R.id.textViewMirea);
        Button btnChangeMireaText = findViewById(R.id.buttonChangeMireaText);

    }
}