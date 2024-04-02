package org.experis.shop;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        Prodotto p = new Prodotto("yogurth", "strawberry yogurth", BigDecimal.valueOf(2.5),
                new BigDecimal("0.18"));


        System.out.println( p.getAllInfo());
    }
}
