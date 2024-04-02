package org.experis.shop;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many products? ");
        int size = Integer.parseInt(scan.nextLine());
        Prodotto[] cart = new Prodotto[size];

        for (int i = 0; i < cart.length; i++) {
            System.out.print("Which product do you want to add:\nPress 1 for: Smartphone\nPress 2 for:Televisore\nPress 3 for:Cuffia\n");
            int selection = Integer.parseInt(scan.nextLine());
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Brand: ");
            String brand = scan.nextLine();
            System.out.print("Price: ");
            String price = scan.nextLine();
            System.out.print("Vat: ");
            String vat = scan.nextLine().replaceAll(",",".");
            switch (selection){
                case 1 :
                    System.out.print("IMEI: ");
                    long imei = Long.parseLong(scan.nextLine());
                    System.out.print("Memory: ");
                    int memory = Integer.parseInt(scan.nextLine());
                    Smartphone smartphone = new Smartphone(name,brand,new BigDecimal(price),new BigDecimal(vat), imei,memory);
                    cart[i] = smartphone;
                    break;
                    case 2 :
                        System.out.print("Inch: ");
                        String inch = scan.nextLine();
                        System.out.print("Is smart? ");
                        boolean isSmart = Boolean.parseBoolean(scan.nextLine());
                        Televisori television = new Televisori(name,brand,new BigDecimal(price),new BigDecimal(vat),new BigDecimal(inch),isSmart);
                        cart[i] = television;
                    break;
                    case 3 :
                        System.out.print("Color: ");
                        String color = scan.nextLine();
                        System.out.print("Is wireless? ");
                        boolean isWireless = Boolean.parseBoolean(scan.nextLine());
                        Cuffie headphone = new Cuffie(name,brand,new BigDecimal(price),new BigDecimal(vat),color,isWireless);
                        cart[i] = headphone;
                    break;
            }
        }

        for(Prodotto prodotto : cart ){
            System.out.println(prodotto.getAllInfo());
        }




        scan.close();
    }
}
