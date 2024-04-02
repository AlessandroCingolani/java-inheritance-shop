package org.experis.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    //Attributi
    public int imei;
    public int memory;


    public Smartphone(String name, String brand, BigDecimal price, BigDecimal vat,int imei,int memory) {
        super(name, brand, price, vat);
        this.imei = imei;
        this.memory = memory;
    }
}
