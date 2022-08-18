package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        try
        {
            String title, description, city, county, fromOwner, gearType, postType,
                    color, isDamaged, roomCount, area, floor, inSite, bathroomCount;

            title = getInput("İlan başlığı : ");
            description = getInput("İlan açıklaması :");
            fromOwner = getInput("Sahibinden mi ? :");
            city = getInput("Şehir :");
            county = getInput("İlçe :");
            postType = getInput("Ilan tipi Emlak için 'e' Vasıta için 'v' giriniz :").toLowerCase();

            // Kullanıcı hatalı bir ilan tipi seçerse //

            while (!(postType.equals("e") || postType.equals("v")))
            {
                postType = getInput("Ilan tipini hatalı girdiniz,lütfen girdiğiniz bilgileri kontrol ediniz!");
            }

            if (postType.equals("v"))
            {
                // Eğer kullanıcı vasıta tipli bir ilan girerse //

                gearType = getInput("Vites tipi :");
                color = getInput("Arac rengi :");
                isDamaged = getInput("Araç hasarlı mı ?");

                Vasıta vasita = new Vasıta();

                vasita.setTitle(title);
                vasita.setDescription(description);
                vasita.setFromOwner(fromOwner);
                vasita.setCity(city);
                vasita.setCounty(county);
                vasita.setGearType(gearType);
                vasita.setColor(color);
                vasita.setIsDamaged(isDamaged);

                display("İlan Başlığı", vasita.getTitle());
                display("İlan Açıklaması", vasita.getDescription());
                display("Kimden", vasita.getFromOwner());
                display("Şehir", vasita.getCity());
                display("İlçe", vasita.getCounty());
                display("Vites Tipi", vasita.getGearType());
                display("Renk", vasita.getColor());
                display("Kazalı mı?", vasita.getIsDamaged());
            }
            else
            {


                roomCount = getInput("Oda sayısını giriniz :");
                area = getInput("Dairenin alan(m2)sini giriniz :");
                floor = getInput("Kat bilgisi giriniz :");
                inSite = getInput("Site içinde mi?");
                bathroomCount = getInput("Banyo sayısını giriniz : ");


                Emlak emlak = new Emlak();

                emlak.setTitle(title);
                emlak.setDescription(description);
                emlak.setFromOwner(fromOwner);
                emlak.setCity(city);
                emlak.setCounty(county);
                emlak.setRoomCount(roomCount);
                emlak.setArea(area);
                emlak.setFloor(floor);
                emlak.setInSite(inSite);
                emlak.setBathroomCount(bathroomCount);

                display("İLAN BAŞLIĞI", emlak.getTitle());
                display("İLAN AÇIKLAMASI", emlak.getDescription());
                display("KİMDEN", emlak.getFromOwner());
                display("ŞEHİR", emlak.getCity());
                display("İLÇE", emlak.getCounty());
                display("ODA SAYISI", emlak.getRoomCount());
                display("ALANI", emlak.getArea());
                display("KAÇINCI KAT", emlak.getFloor());
                display("SİTE İÇİNDE Mİ", emlak.getInSite());
                display("BANYO SAYISI", emlak.getBathroomCount());


            }
        }
        catch (Exception e)
        {
            System.out.println("Hatali giris yaptınız! Lütfen tekrar deneyiniz! " + e);
        }


    }

    static String getInput(String displayMessage)
    {
        System.out.println(displayMessage);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    static void display(String desc, String msg)
    {
        System.out.println(desc + ": " + msg);
    }
}
