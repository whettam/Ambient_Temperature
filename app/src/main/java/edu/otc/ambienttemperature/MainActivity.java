package edu.otc.ambienttemperature;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.*;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static final int TYPE_AMBIENT_TEMPERATURE = 0;
    int currentTemp = Sensor.TYPE_AMBIENT_TEMPERATURE;//ambient temp around user based on sensor

    int internalTemp = Sensor.TYPE_TEMPERATURE;//internal device temp


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(currentTemp);


        String activeTemp = String.valueOf(convertToFarenheit(currentTemp));//convert to farenheit
        TextView tempTextView = (TextView) findViewById(R.id.textView);
        tempTextView.setText((activeTemp));



    }

//    private void getWeather() {
//        RequestQueue weather = Volley.newRequestQueue(MainActivity.this);
//        String url = "https://api.weather.gov/gridpoints/SGF/68,34/forecast";
//
//        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
//                Request.Method.GET,
//                url,
//                null,
//                (Response.Listener<JSONObject>) response -> {
//                    String weatherReturn = response.getString("The Weather");
//                    Glide.with(MainActivity.this).load(weatherReturn).into(currentTemp);
//                } catch (JSONException e){
//            e.printStackTrace();
//        }
//        },
//        );
//    }

    public int convertToFarenheit(int currentTemp) {
        return (currentTemp * 9/5) + 32;
    }

}