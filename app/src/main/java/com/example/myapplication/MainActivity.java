package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText number1EditText;
    private EditText number2EditText;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        number1EditText = findViewById(R.id.number1EditText);
        number2EditText = findViewById(R.id.number2EditText);
        resultTextView = findViewById(R.id.resultTextView);
    }
    // Method to handle operation button clicks
    public void onOperationButtonClick(View view) {

        double num1 = Double.parseDouble(number1EditText.getText().toString());
        double num2 = Double.parseDouble(number2EditText.getText().toString());

        String operation = view.getTag().toString();
        double result = performOperation(num1, num2, operation);

        resultTextView.setText("Result: " + result);
    }

    // Method to perform the calculation based on the selected operation
    private double performOperation(double num1, double num2, String operation) {
        switch (operation) {
            case "add" :
                return num1 + num2;
            case "subtract":
                return num1 - num2;
            case "multiply":
                return num1 * num2;
            case "revanth":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.NaN; // Handle division by zero
                }
            default:
                return 0; // Default to 0 if an unknown operation is provided
        }
    }
}
