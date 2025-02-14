/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java;

import java.util.Scanner;

/**
 *
 * @author Acer Nitro 5
 */
public class tugaspertemuan2 {
    public static void main(String[] args){
        Scanner ObjekInput = new Scanner(System.in);
        float a, b, c;
        System.out.println("Soal Pertama");
        System.out.print("Masukan Inputan angka pertama: ");
        a = ObjekInput.nextFloat();
        System.out.print("Masukan Inputan angka kedua: ");
        b = ObjekInput.nextFloat();
        System.out.print("Masukan Inputan angka ketiga: ");
        c = ObjekInput.nextFloat();
        
        System.out.print("Hasil Penjumlahan : ");
        System.out.println(a + b + c);
        System.out.print("Hasil Perkalian : ");
        System.out.println(a * b * c);
        System.out.print("Hasil Pengurangan : ");
        System.out.println(a - b - c);
        System.out.print("Hasil Pembagian : ");
        System.out.println(a / b / c);
        
        System.out.println("Soal Kedua");
        int uangAndika = 150000000;
        boolean pasanganAndika = true;
        int uangAndi = 200000000;
        boolean pasanganAndi = false;
        
        System.out.print("Andika Akan menikah : ");
        System.out.println(uangAndika > 100000000 && pasanganAndika);
        System.out.print("Andi Akan menikah : ");
        System.out.println(uangAndi > 100000000 && pasanganAndi);
        
        System.out.println("Soal Ketiga");
        System.out.println("Penjumlahan kode ASCII 'X' dan 'y' : ");
        int X = 'X';
        int y = 'y';
        System.out.print(X + y);
    }
}
