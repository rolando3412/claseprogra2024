/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.claseprogra2024;

import java.util.Scanner;
public class ClaseProgra2024 {
   
  
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        
        int nota;
        System.out.println( "Ingrese nota: ");
        nota = entrada.nextInt();
      
         if (nota >= 90)
             System.out.println("A");
             
         else 
             if (nota >= 80)
             System.out.println("B");
             else 
                 if (nota >= 70)
                     System.out.println("C");
                 else 
                    
                     System.out.println("D");
                    
                     
         


         
    }

    }