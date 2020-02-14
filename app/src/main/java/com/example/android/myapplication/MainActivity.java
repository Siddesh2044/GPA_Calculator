package com.example.android.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    //setting some variables

    private Button calculate;
    private EditText a1;
    private EditText a2;
    private EditText a3;
    private EditText a4;
    private EditText a5;
    private TextView res;
    private TextView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//getting variable contents for usage
        a1 = findViewById(R.id.editText4);
        a2 = findViewById(R.id.editText5);
        a3 = findViewById(R.id.editText7);
        a4 = findViewById(R.id.editText8);
        a5 = findViewById(R.id.editText9);
        calculate = findViewById(R.id.button);
        res = findViewById(R.id.editText6);
        background = findViewById(R.id.textView);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //calculations and output provided the input is not null

                if ((a1.getText().length()>0)&&(a2.getText().length()>0)&&(a3.getText().length()>0)&&(a4.getText().length()>0)&&(a5.getText().length()>0)) {

                    //casting and calculating

                    double l = Double.parseDouble(a1.getText().toString());
                    double m = Double.parseDouble(a2.getText().toString());
                    double n = Double.parseDouble(a3.getText().toString());
                    double o = Double.parseDouble(a4.getText().toString());
                    double p = Double.parseDouble(a5.getText().toString());
                    double q = (l + m + n + o + p) / 5;
                    res.setText(String.valueOf(q));
                    calculate.setTextColor(Color.WHITE);

                    //changing color based on result and outputting result

                    if (q>=80)

                        background.setBackgroundColor(Color.GREEN);


                    else if (q<=60)
                        background.setBackgroundColor(Color.RED);


                    else
                        background.setBackgroundColor(Color.YELLOW);



                }

                //sends message to user if input field is blank

                else{
                    Toast toast= Toast.makeText(MainActivity.this,"Invalid Input",Toast.LENGTH_LONG);
                    toast.show();
                }

                calculate.setTextColor(Color.DKGRAY);
            }
        });
    }
}
