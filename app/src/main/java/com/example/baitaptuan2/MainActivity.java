package com.example.baitaptuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float get_w, get_h, ketqua = 0;
    Button btn_cal;
    TextView show_ketqua, chisobmi, textView8, textView9;
    EditText w, h;
    public void getId(){
        btn_cal = findViewById(R.id.button);
        show_ketqua =findViewById(R.id.editTextTextPersonName);
        chisobmi = findViewById(R.id.editTextTextPersonName2);
        w = findViewById(R.id.editTextTextPersonName);
        h = findViewById(R.id.editTextTextPersonName2);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
    }
    public String check(float bmi){
        String result = null;
        if(bmi<18){
            result = "Nguoi gay";
        }else if(bmi<24.9){
            result = "Nguoi binh thuong";
        }else if(bmi<29.9){
            result = "Do beo phi I";
        }else if(bmi<34.9){
            result = "Do beo phi II";
        }else if(bmi>35) {
            result = "Do beo phi III";
        }
    return result;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void tinh(View view) {

        getId();

        if(w.getText().toString() == null || h.getText().toString() == null) {
            Toast.makeText(this, "Chua nhap du lieu", Toast.LENGTH_SHORT).show();
        } else {
            get_w = Float.valueOf(w.getText().toString());
            get_h = Float.valueOf(h.getText().toString());

            ketqua = get_w/(get_h*get_h);

            textView8.setText("BMI: " + String.valueOf(ketqua));

            textView9.setText(check(ketqua));
        }
    }
}