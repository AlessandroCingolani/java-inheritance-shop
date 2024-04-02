package org.experis.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto{
    //Attributi
    private BigDecimal inch;
    private boolean isSmart;

    public Televisori(String name, String brand, BigDecimal price, BigDecimal vat,BigDecimal inch,Boolean isSmart) {
        super(name, brand, price, vat);
        this.inch = inch;
        this.isSmart = isSmart;
    }
}
