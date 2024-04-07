package com.main;

import kendaraan.kendaraan;
import kendaraan.khusus.khusus;
import kendaraan.khusus.tank;
import kendaraan.pribadi.Mobil;
import kendaraan.pribadi.motor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // menyimpan semua object dalam satu array dengan teknik polymorphism
        kendaraan[] kendaraan = new kendaraan[4];
        kendaraan[0] = new motor();
        kendaraan[1] = new Mobil();
        kendaraan[2] = new tank();
        kendaraan[3] = new khusus();

        // input atribut pada setiap object kendaraan
        for (int i = 0; i < kendaraan.length; i++) {
            System.out.printf("Masukkan nama kendaraan ke-%d ", (i + 1));
            kendaraan[i].setName(input.next());
            System.out.printf("Masukkan model kendaraan ke-%d ", (i + 1));
            kendaraan[i].setModel(input.next());
            System.out.printf("Masukkan warna kendaraan ke-%d ", (i + 1));
            kendaraan[i].setWarna(input.next());
            System.out.printf("Masukkan tahun kendaraan ke-%d ", (i + 1));
            kendaraan[i].setTahun(input.nextInt());
            System.out.println();
        }

        // output pada setiap method di kendaraan
        kendaraan[0].Start();
        kendaraan[0].Brake();
        kendaraan[0].Stop();

        kendaraan[0].getInfo();
        System.out.println();
        kendaraan[1].Start();
        kendaraan[1].Brake();
        kendaraan[1].Stop();

        kendaraan[1].getInfo();
        System.out.println();
        tank tank = (tank) kendaraan[2];
        tank.Start();
        tank.Brake();
        tank.Stop();
        tank.Shoot("Truk");

        kendaraan[2].getInfo();
        System.out.println();
        khusus pesawat = (khusus) kendaraan[3];
        pesawat.Start();
        pesawat.fly();
        pesawat.Brake();
        pesawat.Stop();

        kendaraan[3].getInfo();
        System.out.println();
    }
}