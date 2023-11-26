package com.example.crimealert.businessLayer.classes;

public class Citizen extends User {


    //constructor
    public Citizen(int Id, String name, String email, int cnic, int contact, String address, String gender, String password, boolean isLoggedIn){
        super(Id, name, email, cnic, contact, address, gender, password, isLoggedIn);
    }



}
