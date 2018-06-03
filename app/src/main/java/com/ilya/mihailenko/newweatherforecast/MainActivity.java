package com.ilya.mihailenko.newweatherforecast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ilya.mihailenko.newweatherforecast.di.main.MainActivityComponent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivityComponent component =
                (MainActivityComponent) ForecastApp.getApp(this).getComponentsHolder()
                        .getActivityComponent(getClass());
        component.inject(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            ForecastApp.getApp(this).getComponentsHolder().releaseActivityComponent(getClass());
        }
    }
}
