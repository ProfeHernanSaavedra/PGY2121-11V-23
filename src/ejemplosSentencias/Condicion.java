/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosSentencias;

import java.util.Scanner;



/**
 *
 * @author profe Hernán
 * @version 24-08-2023
 */
public class Condicion {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int dia = 0;
        System.out.println("Ingrese dia de la semana: ");
        dia = leer.nextInt();
        //sw+tab
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Sin informacion");
        }
        
        System.out.println("Fin");
    }
    
}
