package com.example.crimealert.businessLayer.classes;

public abstract class User {
    private int id;
    private String name;
    private String email;
    private int cnic;
    private int contact;
    private String address;
    private String gender;
    private String password;
    public boolean isLoggedIn = false;


    //constructor
    public User(int Id, String name, String email, int cnic, int contact, String address, String gender, String password, boolean isLoggedIn){
        this.id = Id;
        this.name = name;
        this.email = email;
        this.cnic = cnic;
        this.contact = contact;
        this.address = address;
        this.gender = gender;
        this.password = password;
        this.isLoggedIn = isLoggedIn;
    }


    //setters.
    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setCnic(int cnic)
    {
        this.cnic = cnic;
    }
    public void setContact(int contact)
    {
        this.contact = contact;
    }
    public void setAddress(String address)
    {
        this.address = password;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }


    //getters
    public int getId()
    {
        return this.id ;
    }
    public String getName()
    {
        return this.name ;
    }
    public String getEmail()
    {
        return this.email ;
    }
    public int getCnic()
    {
        return this.cnic ;
    }
    public int getContact()
    {
        return this.contact;
    }
    public String getAddress()
    {
        return this.address;
    }
    public String getGender()
    {
        return this.gender;
    }
    public String getPassword()
    {
        return this.password ;
    }

}