/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen1progra2;
/*
En la compañía “Paga Bien” solicitan un programa para calcular el nuevo sueldo
de sus empleados, en dicho programa se da a leer el sueldo de cada trabajador
y se le aplica un aumento del 20% si su sueldo es inferior a L 10,000.00 y 10%
en caso contrario, se deberá publicar el nuevo sueldo y al final se deberá indicar 
lo siguiente:

    A cuantos empleados se les aumento el 20% y a cuantos el 10%
    Cuantos empleados hay en total.
  */
  import java.util.Scanner; 
public class Examenuno20171001005 {

    public static void main(String[] args) {
        double sueldo ; 
        int empleados  ;
        int trabajadores ; 
        int a = 1;
        double  b ; 
        double c ;
       
         Scanner entrada = new Scanner(System.in);
         
        System.out.println("ingrese la cantidad de empleados");
        empleados = entrada.nextInt();
                
        
        System.out.println("ingrese el sueldo de los empleados");
        sueldo = entrada.nextInt(); 
          
         while (a == empleados){
            
              if (sueldo < 10000){
             
                  b = sueldo (0.20) ;
          
                 System.out.println("su nuevo suedo es" + b);
                  
                  
                  
              } else {  if (sueldo > 10000){
                  c =  sueldo (0.10); 
                  System.out.println("su nuevo sueldo es " + c);
              }
               
              
              }
              a++;
        
    }

    }

    private static double sueldo(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    
}


