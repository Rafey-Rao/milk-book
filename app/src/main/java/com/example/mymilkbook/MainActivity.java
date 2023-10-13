package com.example.mymilkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void collect(View view) {
        Intent colectmilk=new Intent(this,Collect_milk.class);
        startActivities(new Intent[]{colectmilk});
    }


    public void addcustomer(View view) {

        Intent addcustomer=new Intent(this,Add_customer.class);
        startActivities(new Intent[]{addcustomer});

    }


    public void paymenthistory(View view) {
        Intent paymenthistroy=new Intent(this,payment_history.class);
        startActivities(new Intent[]{paymenthistroy});
    }

    public void milkhistory(View view) {
        Intent milkhistroy=new Intent(this,milk_history.class);
        startActivities(new Intent[]{milkhistroy});
        // commit g

    }
}