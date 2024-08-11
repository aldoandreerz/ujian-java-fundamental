package com.juaracoding.aldoujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        //Scanner untuk input suatu data dari user
        Scanner x = new Scanner(System.in);

        //user memasukkan nama film
        System.out.println("Masukkan nama film: ");

        /*inputan user disimpan dalam bentuk string dan diubah menjadi uppercase
        lalu disimpan dalam variable filmName */
        String filmName = x.nextLine().toUpperCase();

        //menampilkan hasil dari inputan user yang telah diubah menjadi uppercase
        System.out.println("Nama film dalam huruf besar: "+filmName);
    }
}
