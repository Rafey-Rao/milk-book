package com.example.mymilkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Add_customer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);
    }


     public void addcustomer(View view){
         Intent addcustomer =new Intent(this, customer_add.class);
         startActivities(new Intent[]{addcustomer});


     }
}