package com.example.myapplication1;

public class Customers {



    String name, address, town, city, postcode, email;
    int telephone,customerId;

    public Customers(int id, String name, String address, String town, String city, String postcode, String email) {

        this.customerId = id;
        this.name = name;
        this.address = address;
        this.town = town;
        this.city = city;
        this.postcode = postcode;
//        this.telephone = telephone;
        this.email = email;


    }
//    @Override
//    public String toString(){
//        return "Customer" + this.customerId + " " + this.name + " " + this.address + " " + this.town + " " +
//                this.city + " " + this.postcode + " " + this.email;
//    }

}
