package org.experis.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    // costante numero massimo del codice
    private static final int MAX_CODE = 100000000;

    // ATTRIBUTI
    private int code;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal vat;

    // COSTRUTTORI

    public Prodotto(String name, String brand, BigDecimal price, BigDecimal vat) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.vat = vat;
        // genero il codice del prodotto
        this.code = generateCode();
    }

    // GETTER E SETTER
    public BigDecimal getPrice() {
        return price.setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal getFullPrice() {
        // price + price * vat
        return price.add(price.multiply(vat)).setScale(2, RoundingMode.HALF_EVEN);
    }

    public int getCode() {
        return code;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public String getAllInfo() {
        return String.format("Code: %08d \nName: %s \nBrand: %s\nPrice: %.2f\nVat: %.2f", code, name,brand,price,vat);
    }

    public void setPrice(BigDecimal price) {
        if (price == null) {
            // gestisco null value
            price = BigDecimal.ZERO;
        }
        this.price = price;
    }




    // METODI
    private int generateCode() {
        // logica: genero un numero random di max 8 cifre
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(MAX_CODE);
    }
}
