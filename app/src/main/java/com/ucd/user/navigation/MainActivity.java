package com.ucd.user.navigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.net.wifi.WifiManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // commment by yawenlu
    TextView textView;
    NetworkInfo wifiCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button enableButton = (Button) findViewById(R.id.button1);
        ConnectivityManager connectionManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        wifiCheck = connectionManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        textView = (TextView) findViewById(R.id.wifi_connection);
        if (wifiCheck.isConnected()) {
            // Do whatever here
            enableButton.setVisibility(View.GONE);
            textView.setText("WiFi is Connected");
        } else {
            textView.setText("WiFi is not Connected");
        }
        enableButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                WifiManager wifi = (WifiManager) getApplicationContext().getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(true);
                Toast.makeText(MainActivity.this,
                        "Wifi turned on", Toast.LENGTH_LONG).show();
            }
        });
    }
}
