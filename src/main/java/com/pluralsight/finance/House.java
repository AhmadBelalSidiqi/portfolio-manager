package com.pluralsight.finance;

public class House extends FixedAsset{
    private String name;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double marketValue, String name1, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.name = name1;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return this.squareFeet*160;
    }
}
