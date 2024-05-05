/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Jeremy
 */
public class Motor extends Kendaraan {
    public Motor(int kecepatan, String bahanBakar, int hargaKendaraan) {
        super(kecepatan, bahanBakar, hargaKendaraan);
    }
 
    @Override
    public void mulai() {
        System.out.println("Motor dihidupkan");
    }
 
    @Override
    public void berhenti() {
        System.out.println("Motor dihentikan");
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Objek Motor telah dihapus");
        super.finalize();
    }
}