package com.example.crimealert.businessLayer.classes;

public class Report {
    private String type;
    private String place;
    private String Description;
    private String Evidence;

    //setters

    public void setType(String type)
    {
        this.type = type;
    }

    public void setPlace(String place)
    {
        this.place = place;
    }

    public void setDescription(String Description)
    {
        this.Description = Description;
    }

    public void setEvidence(String Evidence)
    {
        this.Evidence = Evidence;
    }

    //constucture
    public Report(String type, String place, String description, String evidence)
    {
        this.type = type;
        this.place = place;
        this.Description = description;
        this.Evidence = evidence;
    }

    //getters
    public String getType()
    {
        return this.type;
    }

    public String getPlace()
    {
        return this.place;
    }

    public String getDescription()
    {
        return this.Description;
    }

    public String getEvidence()
    {
        return this.Evidence;
    }
}
