/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayduadimensi;

import javax.swing.JOptionPane;

/**
 *
 * @author acr
 */
public class menu_makanan {
    public static void main(String[] args) {
      System.out.println("MENU MAKANAN");
    String makanan[][] = {{"2000","nasi putih"},
        {"2500","tempe orek"},{"3000","ayam geprek"},
        {"5000","mie goreng"},{"6000","nasi goreng"}};
   
    for(int i=0; i<makanan.length; i++){  //print bari   
       for(int j=0;j<makanan[0].length;j++) //print colom
       {
         System.out.print(makanan[i][j] + " ");
    }
       System.out.println(" ");
    }  
        String cari = JOptionPane.showInputDialog(null,"Cari menu makanan berdasar harga ");
     for(int i=0; i<makanan.length; i++){  //print baris
       for(int j=0;j<makanan[0].length;j++) //print colom
       {
          if(makanan[i][j].equals(cari)){
              JOptionPane.showMessageDialog(null, "Makanan dengan harga "+ cari+" adalah "+ makanan[i][j+1]);
          }
           System.out.print(makanan[i][j] + " ");
       }
       System.out.println(" ");
        }
    }
}