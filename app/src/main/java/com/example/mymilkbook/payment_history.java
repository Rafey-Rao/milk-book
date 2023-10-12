package com.example.mymilkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class payment_history extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_history);
    }

    public void addpayment(View view) {
        Intent addpayment=new Intent(this,add_payment.class);
        startActivities(new Intent[]{addpayment});

    }
}