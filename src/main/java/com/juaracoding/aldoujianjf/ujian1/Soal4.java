package com.juaracoding.aldoujianjf.ujian1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {

        //Scanner untuk input suatu data dari user
        Scanner x = new Scanner(System.in);

        //pendeklarasian array
        String[] filmName = new String[5];

        //perulangan FOR untuk input nama film menggunakan
        System.out.println("Daftar film bioskop");
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama film "+ (i+1) +": ");
            filmName[i] = x.nextLine();
        }

        //perulangan FOR untuk menampilkan list film yang telah diinput
        System.out.println("Film yang ingin ditonton:");
        for (int j = 0; j < 5; j++) {
            System.out.println((j +1) +". "+filmName[j]);
        }
    }
}
