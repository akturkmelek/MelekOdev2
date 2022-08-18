package com.company;

public class Vasıta extends Ilan
{
    private String gearType;
    private String color;
    private String isDamaged;

    public void setGearType(String gearType)
    {
        this.gearType = gearType;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setIsDamaged(String isDamaged)
    {
        this.isDamaged = isDamaged;
    }

    public String getGearType()
    {
        return this.gearType;
    }

    public String getColor()
    {
        return this.color;
    }

    public String getIsDamaged()
    {
        return this.isDamaged;
    }
}
