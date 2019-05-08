package com.example.sumansahu95.compatibilitychecker;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

import java.util.Arrays;
import java.util.List;

public class SelectWireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_wire_type);

        final List<ToggleButton> toggleButtonList = Arrays.asList(
                (ToggleButton) findViewById(R.id.toggleButton1),
                (ToggleButton) findViewById(R.id.toggleButton2),
                (ToggleButton) findViewById(R.id.toggleButton3),
                (ToggleButton) findViewById(R.id.toggleButton4),
                (ToggleButton) findViewById(R.id.toggleButton5),
                (ToggleButton) findViewById(R.id.toggleButton6),
                (ToggleButton) findViewById(R.id.toggleButton7),
                (ToggleButton) findViewById(R.id.toggleButton8),
                (ToggleButton) findViewById(R.id.toggleButton9),
                (ToggleButton) findViewById(R.id.toggleButton10),
                (ToggleButton) findViewById(R.id.toggleButton11),
                (ToggleButton) findViewById(R.id.toggleButton12),
                (ToggleButton) findViewById(R.id.toggleButton13),
                (ToggleButton) findViewById(R.id.toggleButton14),
                (ToggleButton) findViewById(R.id.toggleButton15),
                (ToggleButton) findViewById(R.id.toggleButton16)
        );

        List<String> buttonContents = Arrays.asList("R", "W", "Y", "AUX", "Rh", "W1", "Y1", "O/B", "Rc", "W2", "Y2", "O", "C", "E", "G/G1", "B");

        for (int i = 0; i < toggleButtonList.size(); i++) {
            toggleButtonList.get(i).setText(buttonContents.get(i));
            toggleButtonList.get(i).setTextOn(buttonContents.get(i));
            toggleButtonList.get(i).setTextOff(buttonContents.get(i));
            toggleButtonList.get(i).setChecked(false);
        }

        toggleButtonList.get(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(toggleButtonList.get(0));
            }
        });

        toggleButtonList.get(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(toggleButtonList.get(1));
            }
        });

        toggleButtonList.get(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(toggleButtonList.get(2));
            }
        });
        toggleButtonList.get(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(toggleButtonList.get(3));
            }
        });
        toggleButtonList.get(4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(toggleButtonList.get(4));
            }
        });
        toggleButtonList.get(5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(toggleButtonList.get(5));
            }
        });
        toggleButtonList.get(6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(toggleButtonList.get(6));
            }
        });
        toggleButtonList.get(7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(toggleButtonList.get(7));
            }
        });
        toggleButtonList.get(8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(toggleButtonList.get(8));
            }
        });
        toggleButtonList.get(9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(toggleButtonList.get(9));
            }
        });
        toggleButtonList.get(10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(toggleButtonList.get(10));
            }
        });
        toggleButtonList.get(11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(toggleButtonList.get(11));
            }
        });
        toggleButtonList.get(12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(toggleButtonList.get(12));
            }
        });
        toggleButtonList.get(13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(toggleButtonList.get(13));
            }
        });
        toggleButtonList.get(14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(toggleButtonList.get(14));
            }
        });
        toggleButtonList.get(15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor(toggleButtonList.get(15));
            }
        });

        Button btn = (Button) findViewById(R.id.fourthButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivityOnButton(toggleButtonList);
            }
        });

    }

    private void changeActivityOnButton(List<ToggleButton> toggleButtons) {
        int count = 0;
        if(toggleButtons.get(0).isChecked()) count++;
        if(toggleButtons.get(4).isChecked()) count++;
        if(toggleButtons.get(8).isChecked()) count++;
        if(count > 1) {
            Intent intent = new Intent(this, JumperActivity.class);
            startActivity(intent);
        }
    }

    private void changeColor(ToggleButton temp) {
        if(temp.isChecked()) {
            temp.setBackgroundColor(Color.parseColor("#4cb7cc"));
        } else {
            temp.setBackgroundColor(Color.parseColor("#ffffff"));
        }
    }
}
