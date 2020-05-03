package com.example.foododer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Map;

import static com.example.foododer.Order.Map2;
import static com.example.foododer.Order.bill;

public class Thankyou extends AppCompatActivity {

     TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);
       text=findViewById(R.id.textView9);
       text.setText("\n Your Order Is:\n"+Order.array.get(0)+"  \n"+"Total Bill Is:"+bill);
        DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
        myRef.child("Orderdetaile").child(MainActivity.id).child("Bill").setValue(bill);
    }

    void logout(View view)
    {
        Order.Map2.clear();

        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }




}
