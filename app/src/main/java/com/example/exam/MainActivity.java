package com.example.exam;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText Num1,Num2,res;
    private TextView tvres;
    private Button calcp,calcm,calcmul,calcd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Num1=findViewById(R.id.Num1);
        Num2=findViewById(R.id.Num2);
        tvres=findViewById(R.id.res);

        calcp=findViewById(R.id.buttonP);
        calcp.setOnClickListener(this);
        calcm=findViewById(R.id.buttonM);
        calcm.setOnClickListener(this);
        calcmul=findViewById(R.id.ButtonMul);
        calcmul.setOnClickListener(this);
        calcd=findViewById(R.id.buttonD);
        calcd.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int num1, num2 ;
        if(!(Num1.getText().toString().isEmpty()||Num2.getText().toString().isEmpty())) {
            num1 = Integer.parseInt(Num1.getText().toString());
            num2 = Integer.parseInt(Num2.getText().toString());
            Num1.setText(null);
            Num2.setText(null);

            if (v.getId() == R.id.buttonP) {

                tvres.setText(String.valueOf(num1 + num2));
            }
            if (v.getId() == R.id.buttonM) {
                tvres.setText(String.valueOf(num1 - num2));
            }
            if (v.getId() == R.id.ButtonMul) {
                tvres.setText(String.valueOf(num1 * num2));
            }
            if (v.getId() == R.id.buttonD) {
                if(num2!=0)
                    tvres.setText(String.valueOf(num1 / num2));
                else
                    Toast.makeText(this, "you can't divide num into 0", Toast.LENGTH_LONG).show();
            }
        }
        else
            Toast.makeText(this, "please,enter a number", Toast.LENGTH_LONG).show();
    }
}