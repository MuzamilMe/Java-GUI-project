/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Muzamil
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=7;i>0;i--)
        {
            for(int n=8-i;n>0;n--){
                System.out.print(" ");
         }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            
            System.out.println("");
        }
        for(int i=0;i<8;i++)
        {
            for(int n=8-i;n>0;n--){
                System.out.print(" ");
         }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            
            System.out.println("");
        }
}}
