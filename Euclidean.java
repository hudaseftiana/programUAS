/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayTunggal;

/**
 *
 * @author acr
 */
public class Euclidean {
    public static void main(String[] args) {
        // ecluidien semakin kecil nilai maka semakin mirip
        double saya[]= {26,67,3.67};
        double anton[]= {25,65,3.60};
        double andi[]= {20,70,3.68};
        
        double d_saya_anton = Math.sqrt((Math.pow(26-25,2)) + (Math.pow(67-65, 2)) + (Math.pow(3.67-3.60,2)));
        System.out.println("Hasil jarak euclidean saya dengan anton adalah = " + d_saya_anton);
        double d_saya_andi = Math.sqrt((Math.pow(26-20,2)) + (Math.pow(67-70, 2)) + (Math.pow(3.67-3.68,2)));
        System.out.println("Hasil jarak euclidean saya dengan andi adalah = " + d_saya_andi);
        double hasil = Math.min(d_saya_anton, d_saya_andi);
        System.out.print("Hasil Final adalah " + hasil);

    }
}
