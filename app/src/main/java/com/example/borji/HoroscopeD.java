package com.example.borji;

public class HoroscopeD {
    private String nameFr;
    private String nameAng;
    private int imageResource;
    private String description;

    public HoroscopeD(String nameFr, String nameAng, int imageResource, String description) {
        this.nameFr = nameFr;
        this.nameAng = nameAng;
        this.imageResource = imageResource;
        this.description = description;
    }

    public String getNameFr() {
        return nameFr;
    }

    public String getNameAng() {
        return nameAng;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getDescription() {
        return description;
    }
}
