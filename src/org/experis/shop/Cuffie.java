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
}
