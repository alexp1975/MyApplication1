package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.*;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    List<String> customerList = new ArrayList<String>();

    TextView cName, cAddress, cTown, cCity,
            cPostcode, cTelephone, cEmail, customerObj;

    String name,address, town,city,postcode,tel,email;

    int telephone;
    int customerID = 0;


    Button btn;
    TextView returnText;
//    CustomerDetails customerData = new CustomerDetails();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cName = (TextView) findViewById(R.id.customerName);
        cAddress = (TextView) findViewById(R.id.customerAddress);
        cTown = (TextView) findViewById(R.id.customerTown);
        cCity = (TextView) findViewById(R.id.customerCity);
        cPostcode = (TextView) findViewById(R.id.customerPostCode);
        cTelephone = (TextView) findViewById(R.id.customerTelephone);
        cEmail = (TextView) findViewById(R.id.customerEmail);


        btn = (Button) findViewById(R.id.button);
        customerObj = (TextView)findViewById(R.id.customerObj);

        name = cName.toString();
        address = cAddress.toString();
        town = cTown.toString();
        city = cCity.toString();
        postcode = cPostcode.toString();
        //tel = cTelephone.toString();
        //telephone = Integer.parseInt(tel);
        email = cEmail.toString();



        btn.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View v) {
        btn.setText("Data Saved");

            customerID++;
            setUpCustomer(customerID, name, address, town, city, postcode, email);


    }


});

}
    public void setUpCustomer(int customerID,String name,String address,String town,
                              String city,String postcode,String email){


        customerList.add(name);
        Customers dave = new Customers(customerID, name, address, town, city, postcode, email);
        customerObj.setText(dave.toString());
    }









    public void generateId(int customerID){

        customerID++;

    }



}