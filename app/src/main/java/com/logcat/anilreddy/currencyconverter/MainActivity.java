package com.logcat.anilreddy.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText dollarAmount;
    TextView poundAmount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertMoney(View view){

        dollarAmount = (EditText) findViewById(R.id.amountId);
        poundAmount  = (TextView) findViewById(R.id.poundAmount);
        Double totalAmount = Double.parseDouble(dollarAmount.getText().toString());
        Double totalPoundAmount = totalAmount* 0.75;

       // Toast.makeText(this, "The Pound Value is £" + String.format("%.2f",totalPoundAmount), Toast.LENGTH_SHORT).show();

        poundAmount.setText(String.format("%.2f",totalPoundAmount));

    }

}
