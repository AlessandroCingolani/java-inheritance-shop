package org.experis.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{
    //Attributi
    private String color;
    private boolean isWireless;
    public Cuffie(String name, String brand, BigDecimal price, BigDecimal vat,String color,boolean isWireless) {
        super(name, brand, price, vat);
        this.color = color;
        this.isWireless = isWireless;
    }

    @Override
    public String getAllInfo(){
        return String.format("Code: %08d \nName: %s \nBrand: %s\nPrice: %.2f\nVat: %.2f\nColor: %s\nWireless: %b", getCode(), getName(),getBrand(),getPrice(),getVat(),color,isWireless);
    }
}
