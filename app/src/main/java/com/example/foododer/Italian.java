package com.example.foododer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

import static com.example.foododer.Order.Map2;
import static com.example.foododer.Order.bill;

public class Italian extends AppCompatActivity {
int paneer_makhnai_count;
int margheritea_count;
int veggi_paradise_count;
int Extra_count;
int spaghettie_count;
int rigafoni_count;
int peppy_paneer_count;
int farmhouse_count;
int mex_count;
int cheese_corn_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian2);
    }
    public void Process(View view){
        if(paneer_makhnai_count >0) {
            TextView a = findViewById(R.id.peppy_paneer_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*395;
            Order o = new Order("Paneer Makhnai", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }

        if (margheritea_count > 0) {
            TextView a = findViewById(R.id.margherita_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*199;
            Order o = new Order("Margherita", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (veggi_paradise_count > 0) {
            TextView a = findViewById(R.id.veggie_paradise_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*395;
            Order o = new Order("Veggie Paradise", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (Extra_count > 0) {
            TextView a = findViewById(R.id.veg_extxra_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*450;
            Order o = new Order("Veg Extravaganza", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (spaghettie_count > 0) {
            TextView a = findViewById(R.id.spaghetti_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*120;
            Order o = new Order("spaghettie", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (rigafoni_count > 0) {
            TextView a = findViewById(R.id.rigafoni_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*150;
            Order o = new Order("Rigafoni", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (peppy_paneer_count > 0) {
            TextView a = findViewById(R.id.peppy_paneer_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*100;
            Order o = new Order("Peppy Paneer", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (farmhouse_count > 0) {
            TextView a = findViewById(R.id.farmhouse_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*80;
            Order o = new Order("Farmhouse", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (mex_count > 0) {
            TextView a = findViewById(R.id.mex_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*180;
            Order o = new Order("Mexican Green Wave", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (cheese_corn_count > 0) {
            TextView a = findViewById(R.id.corn_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*120;
            Order o = new Order("Cheese N Corn", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }

        Intent intend=new Intent(this,Thankyou.class);
        startActivity(intend);
    }
    public void MM(View view){
        if(paneer_makhnai_count >0) {
            TextView a = findViewById(R.id.peppy_paneer_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*395;
            Order o = new Order("Paneer Makhnai", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }

        if (margheritea_count > 0) {
            TextView a = findViewById(R.id.margherita_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*199;
            Order o = new Order("Margherita", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (veggi_paradise_count > 0) {
            TextView a = findViewById(R.id.veggie_paradise_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*395;
            Order o = new Order("Veggie Paradise", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (Extra_count > 0) {
            TextView a = findViewById(R.id.veg_extxra_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*450;
            Order o = new Order("Veg Extravaganza", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (spaghettie_count > 0) {
            TextView a = findViewById(R.id.spaghetti_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*120;
            Order o = new Order("spaghettie", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (rigafoni_count > 0) {
            TextView a = findViewById(R.id.rigafoni_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*150;
            Order o = new Order("Rigafoni", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (peppy_paneer_count > 0) {
            TextView a = findViewById(R.id.peppy_paneer_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*100;
            Order o = new Order("Peppy Paneer", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (farmhouse_count > 0) {
            TextView a = findViewById(R.id.farmhouse_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*180;
            Order o = new Order("Farmhouse", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (mex_count > 0) {
            TextView a = findViewById(R.id.mex_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*180;
            Order o = new Order("Mexican Green Wave", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        if (cheese_corn_count > 0) {
            TextView a = findViewById(R.id.corn_order);
            String str = a.getText().toString();
            int b = Integer.parseInt(str);
            bill=bill+b*120;
            Order o = new Order("Cheese N Corn", b);
            DatabaseReference myRef = FirebaseDatabase.getInstance().getReference();
            myRef.child("Orderdetaile").child(MainActivity.id).setValue(Map2);
        }
        Intent intent=new Intent(this,MenuActivity.class);
        startActivity(intent);

    }
    public void paneer_makhnai_inc1(View view){
        paneer_makhnai_count = paneer_makhnai_count + 1;
        TextView a=findViewById(R.id.paneer_makhnai_order);
        a.setText(""+paneer_makhnai_count);

    }
    public void Paneer_makhnai_dec1(View view){
        if(paneer_makhnai_count>0)
            paneer_makhnai_count= paneer_makhnai_count -1;
        TextView a=findViewById(R.id.paneer_makhnai_order);
        a.setText(""+paneer_makhnai_count);
    }
    public void margheritea_inc1(View view){
        margheritea_count = margheritea_count+ 1;
        TextView a=findViewById(R.id.margherita_order);
        a.setText(""+margheritea_count);

    }
    public void margheritea_dec1(View view){
        if( margheritea_count>0)
            margheritea_count=  margheritea_count -1;
        TextView a=findViewById(R.id.margherita_order);
        a.setText(""+ margheritea_count);

    }
    public void veggie_paradise_inc1(View view){
        veggi_paradise_count =veggi_paradise_count  + 1;
        TextView a=findViewById(R.id.veggie_paradise_order);
        a.setText(""+veggi_paradise_count );

    }
    public void veggie_paradise_dec1(View view){
        if(veggi_paradise_count >0)
            veggi_paradise_count = veggi_paradise_count  -1;
        TextView a=findViewById(R.id.veggie_paradise_order);
        a.setText(""+veggi_paradise_count );

    }
    public void extra_inc1(View view){
        Extra_count= Extra_count+ 1;
        TextView a=findViewById(R.id.veg_extxra_order);
        a.setText(""+Extra_count);

    }
    public void extra_dec1(View view){
        if(Extra_count>0)
            Extra_count=Extra_count -1;
        TextView a=findViewById(R.id.veg_extxra_order);
        a.setText(""+Extra_count);

    }
    public void sp_inc1(View view){
       spaghettie_count= spaghettie_count+ 1;
        TextView a=findViewById(R.id.spaghetti_order);
        a.setText(""+spaghettie_count);

    }
    public void sp_dec1(View view){
        if(spaghettie_count>0)
            spaghettie_count= spaghettie_count -1;
        TextView a=findViewById(R.id.spaghetti_order);
        a.setText(""+spaghettie_count);

    }
    public void rigafoni_inc1(View view){
       rigafoni_count=  rigafoni_count+ 1;
        TextView a=findViewById(R.id.rigafoni_order);
        a.setText(""+ rigafoni_count);

    }
    public void rigafoni_dec1(View view){
        if( rigafoni_count>0)
            rigafoni_count=  rigafoni_count -1;
        TextView a=findViewById(R.id.rigafoni_order);
        a.setText(""+ rigafoni_count);

    }
    public void peppy_inc1(View view){
        peppy_paneer_count= peppy_paneer_count+ 1;
        TextView a=findViewById(R.id.peppy_paneer_order);
        a.setText(""+peppy_paneer_count);

    }
    public void peppy_dec1(View view){
        if(peppy_paneer_count>0)
            peppy_paneer_count= peppy_paneer_count-1;
        TextView a=findViewById(R.id.peppy_paneer_order);
        a.setText(""+peppy_paneer_count);

    }
    public void farmhouse_inc1(View view){
        farmhouse_count=  farmhouse_count+ 1;
        TextView a=findViewById(R.id.farmhouse_order);
        a.setText(""+ farmhouse_count);

    }
    public void farmhouse_dec1(View view){
        if( farmhouse_count>0)
            farmhouse_count=  farmhouse_count-1;
        TextView a=findViewById(R.id.farmhouse_order);
        a.setText(""+ farmhouse_count);

    } public void mex_inc1(View view){
        mex_count= mex_count+ 1;
        TextView a=findViewById(R.id.mex_order);
        a.setText(""+mex_count);

    }
    public void mex_dec1(View view){
        if(mex_count>0)
            mex_count= mex_count-1;
        TextView a=findViewById(R.id.mex_order);
        a.setText(""+mex_count);

    } public void corn_inc1(View view){
        cheese_corn_count= cheese_corn_count+ 1;
        TextView a=findViewById(R.id.corn_order);
        a.setText(""+cheese_corn_count);

    }
    public void corn_dec1(View view){
        if(cheese_corn_count>0)
            cheese_corn_count= cheese_corn_count-1;
        TextView a=findViewById(R.id.corn_order);
        a.setText(""+cheese_corn_count);

    }




}

