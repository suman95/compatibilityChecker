package com.example.sumansahu95.compatibilitychecker;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_page);

        Button continueBtn = (Button) findViewById(R.id.continueButton2);

        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelectWire();
            }
        });
     }

     private void openSelectWire() {
        Intent intent = new Intent(this, SelectWireActivity.class);
        startActivity(intent);
     }
}
