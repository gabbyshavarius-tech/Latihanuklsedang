/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author LOQ
 */
package com.mycompany.latihanuklsdg;

import java.util.Scanner;

public class Latihanuklsedang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM PERHITUNGAN ===");
        System.out.println("1. Hitung Faktorial");
        System.out.println("2. Hitung Volume Tabung");
        System.out.print("Pilih menu (1 atau 2): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan bilangan bulat positif: ");
                int n = input.nextInt();
                long hasilFaktorial = HitungDaktorialDanTabung.hitungFaktorial(n);
                System.out.println("Faktorial dari " + n + " adalah: " + hasilFaktorial);
                break;

            case 2:
                System.out.print("Masukkan jari-jari tabung (cm): ");
                double r = input.nextDouble();
                System.out.print("Masukkan tinggi tabung (cm): ");
                double t = input.nextDouble();
                double volume = HitungDaktorialDanTabung.hitungVolumeTabung(r, t);
                System.out.println("Volume tabung adalah: " + volume + " cm³");
                break;

            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

        input.close();
    }
}

class HitungDaktorialDanTabung {
    // Fungsi untuk menghitung faktorial
    public static long hitungFaktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    // Fungsi untuk menghitung volume tabung
    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        return volume;
    }
}

    


    




