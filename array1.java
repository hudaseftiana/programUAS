/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author acr
 */
public class array1 {
    public static void main(String[] args) {
       int data[][] = new int [2][2];
       
       data[0][0]=1;
       data[0][1]=2;
       data[1][0]=3;
       data[1][1]=4;
       
        System.out.print( data[0][0] +" ");
        System.out.println(data[0][1]+" ");
        System.out.print(data[1][0]+" ");
        System.out.println(data[1][1]+" ");
    }
}
