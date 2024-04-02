package org.experis.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    //Attributi
    public long imei;
    public int memory;


    public Smartphone(String name, String brand, BigDecimal price, BigDecimal vat,long imei,int memory) {
        super(name, brand, price, vat);
        this.imei = imei;
        this.memory = memory;
    }
}
