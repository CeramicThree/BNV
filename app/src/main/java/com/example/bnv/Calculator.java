package com.example.bnv;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

    }


    public void OnClick(View v){

        EditText e1 = (EditText) findViewById(R.id.editText);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        TextView res = (TextView) findViewById(R.id.textView);
        Button p = (Button) findViewById(R.id.plus);


        int num1 = 0;
        int num2 = 0;

        try{
            num1 = Integer.parseInt(e1.getText().toString());
        }
        catch (Exception error)
        {
            Log.d("Data", "" + error);
            num1 = 0;
        }

        try{
            num2 = Integer.parseInt(e2.getText().toString());
        }
        catch (Exception error)
        {
            Log.d("Data", "" + error);
            num2 = 0;
        }

        int result = num1 + num2;


        res.setText(Integer.toString(result));


    }
    public void onBackButtonClick(View v){
        Intent intent = new Intent(Calculator.this, MainActivity.class);
        startActivity(intent);
    }


}