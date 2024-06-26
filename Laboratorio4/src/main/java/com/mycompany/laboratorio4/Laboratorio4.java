/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio4;

/**
 * Se leera el sueldo por hora y horas trabajadas por semana 
 * por empleado y se nesecita conocer la cuota de deduccion y salario neto.
 * la deduccion es calculada de acuerdo con el salario bruto mensual.
 * si el salario bruto es menor de 14.000 mil, no existe deduccion.
 * si el salario bruto mensual esta entre 14.000 mil y 20.000 mil lps 
 * la deduccion es de un 3% sin enbargo si el salario es mayor a los 20.000 mil 
 * la deducion es de un 7.5%  del salario.
 * 
 * @author ROLANDO FLORES. 
 */
  import java.util.Scanner; 

public class Laboratorio4 {

    public static void main(String[] args) {
        
          /*int Salario_Bruto ;
          //int sueldo_por_hora ; 
          //int Horas_Trabajas_Semana;
          //int Salario_Neto;
          double A;
          double B;
          double C;
          double D;
          double E; */
          int canest = 1 ; //cantidad estudiante. 
          int suma = 0 ;
         int cantest = 0;
         int cal; 
         int sumcal = 0 ; 
         Scanner entrada = new Scanner(System.in);
         
        System.out.println("ingrese el sueldo por horas");
         sueldo_por_hora = entrada.nextInt();
         System.out.println("ingrese las horas trabajadas ala semana ");
          Horas_Trabajas_Semana = entrada.nextInt();
          
          // cuota de dedeuccion 
         System.out.println("Salario Bruto es " ); // sueldo completo
         A =  Salario_Bruto = sueldo_por_hora * Horas_Trabajas_Semana  ; 
        System.out.println(""+ A);
        
        ///salario neto las deducciones 
        if (A < 14000){
               System.out.println("no hay deducciones");
               }
        else {
               if (  A > 14000 && A < 20000 ){
               B =(A * 0.03); // verifivar este heror 
                System.out.println("su salario neto es " + B);
                E = (A - B);
                   System.out.println("su deducion es de "+ E);
            }
               
         } if (A > 20000) {
             C = (A * 0.075);
            D =( A - C) ;
             System.out.println("su salario neto es " + D );
         }  */
         
          while ( canest <= cantest) {
            System.out.println("ingrese la calificacion");
            cal = entrada.nextInt();
            sumcal = sumcal + cal ;
            canest = canest + 1; 
            
    }
          
          
          
    }
    
}

