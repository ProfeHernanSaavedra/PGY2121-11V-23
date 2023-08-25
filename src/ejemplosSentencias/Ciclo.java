/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosSentencias;

import java.util.Scanner;

/**
 *
 * @author USRVI-LC4
 */
public class Ciclo {

    public Scanner leer; 

    public Ciclo() {
        leer = new Scanner(System.in);
    }
    
    public void mientras() {
        int opcion = 0;
        //mientras
        //wh+tab
        while (opcion != 4) {
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("hacer opcion 1");
                    break;
                case 2:
                    System.out.println("hacer opcion 2");
                    break;
                case 3:
                    System.out.println("hacer opcion 3");
                    break;
                default:
                    System.out.println("No es valida la opcion");
            }

        }
    }

}
