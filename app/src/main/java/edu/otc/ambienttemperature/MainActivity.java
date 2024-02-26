package edu.otc.ambienttemperature;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static final int TYPE_AMBIENT_TEMPERATURE = 0;

    int currentTemp = Sensor.TYPE_AMBIENT_TEMPERATURE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(currentTemp);


        String activeTemp = String.valueOf(convertToFarenheit(currentTemp));
        TextView tempTextView = (TextView) findViewById(R.id.textView);
        tempTextView.setText((activeTemp));

    }

    public int convertToFarenheit(int currentTemp) {
        return (currentTemp * 9/5) + 32;
    }
}