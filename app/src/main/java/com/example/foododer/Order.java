package com.example.foododer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Order {

     static  int bill = 0;
   final static LinkedHashMap<String,Integer>Map2=new LinkedHashMap<>();
   final static ArrayList<LinkedHashMap>array=new ArrayList<LinkedHashMap>();
Order(){}
    Order(String a,int b){
        Map2.put(a,b);
        //Map2.put("Sandwich",5);
        array.add(Map2);

    }
}
