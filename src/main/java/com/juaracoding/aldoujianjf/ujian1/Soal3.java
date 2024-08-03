package com.juaracoding.aldoujianjf.ujian1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        //Pendeklarasian variable
        int weekdayPrice = 35000;
        int weekendPrice = 45000;
        float diskon = 0.1f;
        int totalPrice;

        //Scanner untuk input suatu data dari user
        Scanner x = new Scanner(System.in);

        //user input untuk weekday atau weekend
        System.out.println("Weekday or Weekend: ");
        String week = x.nextLine();

        //user input jumlah tiket yang dibeli
        System.out.println("Jumlah Tiket: ");
        int totalTicket = x.nextInt();

        //Kondisi untuk menentukan total harga tiket berdasarkan weekday atau weekend dan jumlah tiket
        if (week == "Weekday" && totalTicket > 5){
            totalPrice = (int ) (totalTicket * (weekdayPrice - weekdayPrice * diskon));
            System.out.println("Total harga (dengan diskon): "+totalPrice);
        } else if (week == "Weekday" && totalTicket <= 5) {
            totalPrice = totalTicket * weekdayPrice;
            System.out.println("Total harga: "+totalPrice);
        } else if (week == "Weekend" && totalTicket > 5) {
            totalPrice = (int ) (totalTicket * (weekendPrice - weekendPrice * diskon));
            System.out.println("Total harga (dengan diskon): "+totalPrice);
        } else {
            totalPrice = totalTicket * weekendPrice;
            System.out.println("Total harga: "+totalPrice);
        }


    }
}
