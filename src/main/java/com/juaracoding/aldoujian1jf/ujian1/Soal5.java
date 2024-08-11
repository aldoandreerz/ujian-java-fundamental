package com.juaracoding.aldoujian1jf.ujian1;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {


        int totalPrice = 0;
        //pendeklarasian array
        int[] ticketPrice = {50000, 60000, 70000, 80000, 90000};

        //perulangan FOR untuk input nama film menggunakan
        for (int i = 0; i < 5; i++) {
            System.out.println("Harga tiket film "+ (i+1) +": " +ticketPrice[i]);
            totalPrice += ticketPrice[i];
        }
        //menampilkan hasil perhitungan total harga tiket
        System.out.println("Total harga tiket: "+totalPrice);
    }
}
