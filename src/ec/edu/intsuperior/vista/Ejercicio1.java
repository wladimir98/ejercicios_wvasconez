/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author wladi
 */
public class Ejercicio1 {
    public static void main(String[] args){
        
        int n1, n2,n3;
        double op;
        
Scanner sc = new Scanner(System.in);
//Leer el primer numero
System.out.println("Introduce un numero entero");
n1 = sc.nextInt(); //Lee entero por teclado
System.out.println("Introduce otro numero entero");
n2 = sc.nextInt(); //Lee entero por teclado
System.out.println("Elija la operacion a realizar ");
        System.out.println("1.-suma");
        System.out.println("2.-Resta");
        System.out.println("3.-Multiplicacion");
        System.out.println("4.-Divicion"); 
        
                
    n3= sc.nextInt();
    
        switch (n3) {
            case 1 -> {
                op=n1+n2;
                System.out.println("El resultado de la suma es igual a"+op);
            }
            case 2 -> {
                op=n1-n2;
                System.out.println("El resultado de la resta es igual a "+op);
            }
            case 3 -> {
                op=n1*n2;
                System.out.println("El resultado de la multiplicacion es igual a"+ op);
            }
            case 4 -> {
                op=n1/n2;
                System.out.println("El resultado de la divicion es igual a "+ op);
            }
            default -> System.out.println("Error opcion inexistente, zztente otra vez");
        }
    }
}
