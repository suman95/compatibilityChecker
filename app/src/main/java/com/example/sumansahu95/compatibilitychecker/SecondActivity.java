package com.example.sumansahu95.compatibilitychecker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page);

        Button secondButton = (Button) findViewById(R.id.continueButton);

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToThirdPage();
            }
        });
    }

    private void moveToThirdPage() {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
