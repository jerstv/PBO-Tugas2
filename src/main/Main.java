/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Jeremy
 */

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil(130, "Bensin Pertamax", 100000000);
        mobil.mulai();
        mobil.tampilkanInfo();
        mobil.berhenti();
        mobil.hitungPajak();
        mobil = null;
        System.out.println("");
 
        Motor motor = new Motor(60, "Bensin Pertalite", 20000000);
        motor.mulai();
        motor.tampilkanInfo();
        motor.berhenti();
        motor.hitungPajak();
        motor = null;
        System.out.println("");
   
        Bus bus = new Bus(80, "Diesel Solar", 500000000);
        bus.mulai();
        bus.tampilkanInfo();
        bus.berhenti();
        bus.hitungPajak();
        bus = null;
        System.out.println("");
        
        System.gc();
    }
}