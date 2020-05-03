package com.example.foododer;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.fasterxml.jackson.databind.node.NullNode;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.widget.Toast.LENGTH_LONG;

public class Del extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_del);
    }
    public void submit(View view) {
        EditText a=new EditText(this);
         a = findViewById(R.id.editText5);
        String uid = a.getText().toString();

        FirebaseDatabase database = FirebaseDatabase.getInstance();
       final DatabaseReference myRef = database.getReference().child("Orderdetaile").child(uid);
        Toast.makeText(getApplicationContext(), "Order Deleted", LENGTH_LONG).show();
        myRef.removeValue();



    }

}
