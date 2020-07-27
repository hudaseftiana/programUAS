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
public class singglearay {
    public static void main(String[] args) {
        int angka[] = new int[5];
        angka[0]=100;
        angka[1]=150;
        angka[2]=200;
        angka[3]=1000;
        angka[4]=1000;
        
        String namaTeman[] = {"aku","kau","uka","kua"};
        for(int i=0;i<angka.length;i++){
            System.out.println(angka[i]);
        }
        
        for(int i=0;i<namaTeman.length;i++){
        System.out.println(namaTeman[i]);
        }
   }
}
