package com.example.lalinkce.cafecentral;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initializeButtons();

        getSupportActionBar().hide();
        setStatusBarTranslucent(true);
    }

    private void initializeButtons() {
        Button order = (Button)findViewById(R.id.orderButton);
        Button pay = (Button)findViewById(R.id.payButton);
        Button settings = (Button)findViewById(R.id.settingsButton);
        order.setOnClickListener(clickOrder);
        pay.setOnClickListener(clickPay);
        settings.setOnClickListener(clickSettings);
    }

    protected void setStatusBarTranslucent(boolean makeTranslucent) {
        if (makeTranslucent) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        } else {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }

    public Button.OnClickListener clickOrder = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent registerForm = new Intent(MainActivity.this, OrderActivity.class);
            startActivity(registerForm);
        }
    };
    public Button.OnClickListener clickPay = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent registerForm = new Intent(MainActivity.this, PayActivity.class);
            startActivity(registerForm);
        }
    };
    public Button.OnClickListener clickSettings = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent registerForm = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(registerForm);
        }
    };
}
