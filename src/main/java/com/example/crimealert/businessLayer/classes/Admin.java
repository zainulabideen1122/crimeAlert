package com.example.crimealert.businessLayer.classes;

public class Admin extends User {

    //constructor
    public Admin(int Id, String name, String email, int cnic, int contact, String address, String gender, String password, boolean isLoggedIn){
        super(Id, name, email, cnic, contact, address, gender, password, isLoggedIn);
    }


}