package com.ucd.user.navigation;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.widget.Toast;

/**
 * Created by User on 6/7/2018.
 */

public class ScanWifi extends Activity {
    WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
    //wifi = (WifiManager).
            //(WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);

    public void ScanAPList(Activity activity){
    Toast.makeText(activity,
            "Scanning", Toast.LENGTH_LONG).show();

}
}
