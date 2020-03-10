package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class YourReceipt extends AppCompatActivity {
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_receipt);
        setTitle("Your Reciept");

        text = (TextView) findViewById(R.id.text_view);

        Intent receivingIntent = getIntent();
        //String string = receivingIntent.getStringExtra(Keys.QUESTION_KEY);
        Reciept r1 = (Reciept) receivingIntent.getSerializableExtra(Keys.RECIEPT);
        double total = r1.getAmount();
        double sales_tax = total * r1.getTax_Per();
        double tip = total * r1.getTip_Per();
        double grand_total = total + sales_tax + tip;
        text.setText("Total: " + String.valueOf(total) + "\n" + "Sales Tax: " + String.valueOf(sales_tax) + "\n" + "Tip: " + String.valueOf(tip) + "\n" + "Grand Total: " + String.valueOf(grand_total));


    }
}
