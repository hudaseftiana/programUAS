/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayTunggal;

import javax.swing.JOptionPane;

/**
 *
 * @author acr
 */
public class programnama {
    public static void main(String[] args) {
        
     String namamhs[] = new String[5];
     for(int i=0; i<namamhs.length;i++){
         namamhs[i] = JOptionPane.showInputDialog(null, "Inputkan Nama Mahasiswa ke-" + i );
         System.out.println(namamhs[i]);}
     
     String cari = JOptionPane.showInputDialog(null, "Cari Nama Mahasiswa !");
     
     for(int i=0; i <namamhs.length;i++){
         if (namamhs[i].equals(cari)){
             JOptionPane.showMessageDialog(null, "Nama yang anda cari adalah " + cari +" berada pada indeks ke-" + i);
         }
     }
    }
}
