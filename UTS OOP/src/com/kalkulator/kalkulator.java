package com.kalkulator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {

        float  x , y;
        int pilihan;

        Scanner hasil = new Scanner(System.in);
        System.out.println("KALKULATOR");
        System.out.println("1.Tambah");
        System.out.println("2.Kurang");
        System.out.println("3.Kali");
        System.out.println("4.Bagi");
        System.out.print("Pilihan [1/2/3/4] = ");
        pilihan = hasil.nextInt();

        System.out.print("Masukan Angka I = ");
        x = hasil.nextFloat();
        System.out.print("Masukan Angka II = ");
        y = hasil.nextFloat();

        switch(pilihan){

            case 1:
                System.out.println( + x + " + " + y + " = ");
                System.out.println("Hasil = " + penjumlahan.topenjumlahan(x,y));
                break;
            case 2:
                System.out.println( + x + " - " + y + " = ");
                System.out.println("Hasil = " + pengurangan.topengurangan(x,y));
                break;
            case 3:
                System.out.println( + x + " * " + y + " = ");
                System.out.println("Hasil = " + perkalian.toperkalian(x,y));
                break;
            case 4:
                System.out.println( + x + " / " + y + " = ");
                System.out.println("Hasil = " + pembagian.topembagian(x,y));
                break;
            default:
                System.out.println("ULANGI");

        }

    }
}
