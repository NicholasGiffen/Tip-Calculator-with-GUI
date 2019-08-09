package edu.csustan.cs4950.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculate(View v) {

        //get inputBill and inputTipPercent
        EditText inputBill = findViewById(R.id.inputBill);
        EditText inputTipPercent = findViewById(R.id.inputTipPercent);
        String num1Str = inputBill.getText().toString();
        String num2Str = inputTipPercent.getText().toString();

        // multiply Bill by Tip to get Tip in dollars
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double tipInDollar = num1 * (num2 / 100);
        double total = num1 + tipInDollar;

        // show tip in dollars
        TextView lblTipAmount = findViewById(R.id.lblTipAmount);
        lblTipAmount.setText(String.valueOf(tipInDollar));

        // show total price with tip included
        TextView lblTotalAmount = findViewById(R.id.lblTotalAmount);
        lblTotalAmount.setText(String.valueOf(total));
    }

}
