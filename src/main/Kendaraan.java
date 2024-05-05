/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Jeremy
 */
public abstract class Kendaraan {
    protected int kecepatan; 
    protected String bahanBakar;
    protected int hargaKendaraan;
    protected int pajakKendaraan;
 
    public Kendaraan(int kecepatan, String bahanBakar,int hargaKendaraan) {
        this.kecepatan = kecepatan;
        this.bahanBakar = bahanBakar;
        this.hargaKendaraan = hargaKendaraan;
    }
 
    public abstract void mulai();
    public abstract void berhenti();
 
    public void tampilkanInfo() {
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Bahan Bakar: " + bahanBakar);
    }
    public void hitungPajak(){
    Double pajak = 0.1 * hargaKendaraan;
    Locale indoLocale = new Locale("id", "ID");
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(indoLocale);
    System.out.println("pajak = " + currencyFormat.format(pajak));
    }
}