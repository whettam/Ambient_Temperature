package edu.otc.ambienttemperature;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final int TYPE_AMBIENT_TEMPERATURE = 0;

    int currentTemp = Sensor.TYPE_AMBIENT_TEMPERATURE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(currentTemp);
    }
}