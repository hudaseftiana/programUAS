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
public class arrayduadimensi1 {
    public static void main(String[] args) {
        System.out.println("ARRAY DUA DIMENSI");
    int matriks[][] = {{1,4},
                      {5,7}};
 
   for(int i=0; i<matriks.length; i++)   //print baris
   {
       for(int j=0;j<matriks.length;j++) //print colom
       {
           System.out.print(matriks[i][j] + " ");
       }
       System.out.println(" ");
   }
        System.out.println("ARRAY DUA DIMENSI TIPE STRING");
    String mahasiswa[][] = {{"01","miftahul"},{"02","huda"},{"03","lala"}};
        
     for(int i=0; i<mahasiswa.length; i++){  //print baris
         
       for(int j=0;j<mahasiswa[0].length;j++) //print colom
       {
           System.out.print(mahasiswa[i][j] + " ");
       }
       System.out.println(" ");
    }
     String cari = JOptionPane.showInputDialog(null,"Cari mahasiswa berdasar NIM");

     for(int i=0; i<mahasiswa.length; i++){  //print baris
         
       for(int j=0;j<mahasiswa[0].length;j++) //print colom
       {
          if(mahasiswa[i][j].equals(cari)){
              JOptionPane.showMessageDialog(null, "Mahasiswa dengan NIM "+ cari+" ditemukan bernama "+ mahasiswa[i][j+1]);
          }
           System.out.print(mahasiswa[i][j] + " ");
       }
       System.out.println(" ");
    }
}
}


