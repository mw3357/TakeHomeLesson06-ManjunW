package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Amount;
    private EditText tax_percentage;
    private EditText tip_percentage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launchActivity(View view) {

        //String question = questionTextView.getText().toString();
        //Above code gets the question from the textView

        Intent intent = new Intent(this, YourReceipt.class);
        Amount= findViewById(R.id.amount_view);
        double amount = Double.parseDouble(Amount.getText().toString());

        tax_percentage = findViewById(R.id.tax_percentage_view);
        double taxP = Double.parseDouble(tax_percentage.getText().toString());

        tip_percentage = findViewById(R.id.tip_percentage_view);
        double tipP = Double.parseDouble(tip_percentage.getText().toString());


        Reciept r = new Reciept(amount,taxP,tipP);
        intent.putExtra(Keys.RECIEPT, r);
        startActivity(intent);


    }
}
