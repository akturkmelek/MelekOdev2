package com.company;

public class Emlak extends Ilan
{
    private String roomCount;
    private String area;
    private String floor;
    private String inSite;
    private String bathroomCount;

    public void setRoomCount(String roomCount)
    {
        this.roomCount = roomCount;
    }

    public void setArea(String area)
    {
        this.area = area;
    }

    public void setFloor(String floor)
    {
        this.floor = floor;
    }

    public void setInSite(String inSite)
    {
        this.inSite = inSite;
    }

    public void setBathroomCount(String bathroomCount)
    {
        this.bathroomCount = bathroomCount;
    }
    public String getRoomCount() {return this.roomCount; }
    public String getArea() {return this.area; }
    public  String getFloor() {return this.floor; }
    public  String getInSite() {return this.inSite; }
    public  String getBathroomCount() {return this.bathroomCount; }


}
