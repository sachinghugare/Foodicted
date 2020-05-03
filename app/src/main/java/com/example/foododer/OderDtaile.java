package com.example.foododer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OderDtaile extends AppCompatActivity {
    TextView view1;

    ScrollView view;
    ArrayList<Map> arrayList = new ArrayList<Map>(50);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder_dtaile);

    }

    public void retrive1(View view) {
        final int c = 0;
        arrayList.clear();


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReferenceFromUrl(Conf.url);
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    Map<String, String> map = (Map) postSnapshot.getValue();

                    if (map != null) {
                        int message = map.size();
                        arrayList.add(map);
                        //String userName = map.get("Username");
                        Toast.makeText(getApplicationContext(), "" + message, Toast.LENGTH_LONG).show();
                        int str = arrayList.size();
                        Toast.makeText(getApplicationContext(), "Oder Count Is::" + str, Toast.LENGTH_LONG).show();

                    }
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    public void data(View view) {
        arrayList.clear();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReferenceFromUrl(Conf.url);
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    Map<String, String> map = (Map) postSnapshot.getValue();

                    if (map != null) {
                        int message = map.size();
                        arrayList.add(map);
                        //String userName = map.get("Username");
                        Toast.makeText(getApplicationContext(), "" + message, Toast.LENGTH_LONG).show();
                        int str = arrayList.size();
                        Toast.makeText(getApplicationContext(), "ODER COUNT IS::" + str, Toast.LENGTH_LONG).show();

                    }
                }
                view1 = findViewById(R.id.textView7);
                view1.setMovementMethod(new ScrollingMovementMethod());
                view1.setText("\n**********ODER DETAILS IS*********\n\n");

                for (int i = 0; i < arrayList.size(); i++) {
                    view1.append("\n\n\nODER NO " + (i + 1) + " IS\n\n");
                    view1.append("\n " + arrayList.get(i) + "\n");

                    //view1.append("\n"+arrayList.);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    public void del(View view) {

        Intent intent = new Intent(this, Del.class);
        startActivity(intent);

    }


 }

