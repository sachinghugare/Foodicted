package com.example.foododer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

import static android.widget.Toast.LENGTH_LONG;

public class UpdatePassword extends AppCompatActivity {
    EditText text1, text2;
    DatabaseReference myRef;
    DatabaseReference myRef1;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_password);
        myRef= FirebaseDatabase.getInstance().getReference();
        myRef1= FirebaseDatabase.getInstance().getReference();
    }


    public void update(View view)
    {
        myRef= FirebaseDatabase.getInstance().getReference();

        text1 = findViewById(R.id.editText3);
        text2 = findViewById(R.id.editText4);
        String str1="", str2="";
        str1 = text1.getText().toString();
        str2 = text2.getText().toString();
        myRef1=FirebaseDatabase.getInstance().getReference().child("userdetails").child(str1);
        if (!TextUtils.isEmpty(str1) && !TextUtils.isEmpty(str2)) {
            if (str1.length() != 10) {
                Toast.makeText(getApplicationContext(), "Enter 10 digit Mob No ", LENGTH_LONG).show();

            }
            else if(str1.charAt(0)!='7'&&str1.charAt(0)!='9'&&str1.charAt(0)!='8')
            {
                Toast.makeText(getApplicationContext(), "Invalied  Mobile Number ", LENGTH_LONG).show();

            }
            else   if (str2.length() < 8) {
                Toast.makeText(getApplicationContext(), "Password Contain At List 8 charactor ", LENGTH_LONG).show();

            }

            else {
                final String finalStr = str2;
                final String finalStr1 = str1;
                myRef1.addValueEventListener(new ValueEventListener() {


                    public void onDataChange(DataSnapshot dataSnapshot) {

                        boolean p = dataSnapshot.exists();
                             User us = new User(finalStr, finalStr1);

                            us.setPassword(finalStr);
                            us.setUsername(finalStr1);
                            HashMap map = new HashMap<String, User>();
                            String id = myRef.push().getKey();
                            // map.put("username", us.Username);
                            map.put("password", us.Password);
                            myRef.child("userdetails").child(finalStr1).setValue(map);
                            //  myRef.child("oderdetaile/password").setValue(us.Password);
                            text1.setText("");
                            text2.setText("");
                            Toast.makeText(getApplicationContext(), "UpDate Sucessfully", Toast.LENGTH_LONG).show();


                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }


        }
        else
        {
            Toast.makeText(this, "Please Fill All Details", Toast.LENGTH_LONG).show();

        }

    }


}

