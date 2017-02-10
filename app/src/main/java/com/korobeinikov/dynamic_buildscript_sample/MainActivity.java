package com.korobeinikov.dynamic_buildscript_sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView content = (TextView) findViewById(R.id.tvContent);
        content.setText(getFullContent());
    }

    private String getFullContent() {
        return "Application ID: " + BuildConfig.APPLICATION_ID + "\n" +
                "Build type: " + BuildConfig.BUILD_TYPE + "\n" +
                "Flavor: " + BuildConfig.FLAVOR + "\n" +
                "Company name: " + BuildConfig.COMPANY_NAME + "\n" +
                "Country calling code: " + BuildConfig.COUNTRY_CALLING_CODE + "\n" +
                "Country name: " + BuildConfig.COUNTRY_NAME + "\n" +
                "Country population: " + BuildConfig.COUNTY_POPULATION + "\n" +
                "Currency: " + BuildConfig.CURRENCY + "\n" +
                "Locale: " + BuildConfig.DEFAULT_LOCALE + "\n" +
                "Domain-ID: " + BuildConfig.DOMAIN_ID + "\n" +
                "Account service endpoint: " + BuildConfig.ACCOUNT_SERVICE_ENDPOINT + "\n" +
                "Session service endpoint: " + BuildConfig.SESSION_SERVICE_ENDPOINT + "\n" +
                "Help email address: " + BuildConfig.HELP_EMAIL_ADDRESS + "\n";
    }
}
