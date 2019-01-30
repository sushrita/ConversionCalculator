package plumpypanda.com.conversioncalculator.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import plumpypanda.com.conversioncalculator.R;
import plumpypanda.com.conversioncalculator.Utils;

public class TempConverterActivity extends AppCompatActivity {
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        text = (EditText) findViewById(R.id.inputValue);

       findViewById(R.id.calcButton).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               switch (v.getId()) {
                   case R.id.calcButton:
                       RadioButton celsiusButton = (RadioButton) findViewById(R.id.celsius);
                       RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.farenheit);
                       TextView output = (TextView) findViewById(R.id.outputValue);
                       if (text.getText().length() == 0) {
                           Toast.makeText(TempConverterActivity.this, "Please enter a valid number", Toast.LENGTH_LONG).show();
                           return;
                       }

                       float inputValue = Float.parseFloat(text.getText().toString());
                       if (celsiusButton.isChecked()) {
                           String result = String.valueOf(Utils.convertCelsiusToFahrenheit(inputValue));
                           output.setText(" " + result + " °F");
                       } else {
                           String result = String.valueOf(Utils.convertFahrenheitToCelsius(inputValue));
                           output.setText(" " + result + " °C");
                       }
                       break;
               }


           }
       });

    }

}
