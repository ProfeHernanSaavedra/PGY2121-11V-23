
package ejercicio132;

import java.util.Scanner;

/**
 *
 * @author Profe Hernán
 * @version 31-08-2023
 */
public class Principal {
    
    public static void main(String[] args) {
        
        //menu
        int opcion;
        boolean flag; //validaciones
        //cliente
        int rut,telefono;
        String nombre,mail,direccion;
        char dv;
        //producto
        int codigo,precio,cantidad,totalProductos;
        String subcategoria,descripcion;
        char medida;
        //solicitud
        int numero;
        String fecha;
        int porcentaje;
        int descuento;
        
        Scanner leer = new Scanner(System.in);
        
        Valida valida = new Valida();
        Cliente cliente = new Cliente();
        Solicitud sol = new Solicitud();
        
        do {
            System.out.println("*****MENU******");
            System.out.println("1. Ingresar Cliente");
            System.out.println("2. Ingresar Solicitud y sus Productos");
            System.out.println("3. Aplicar descuento");
            System.out.println("4. Salir y Ver Solicitud");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4: 
                    
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            
            
        } while (opcion != 4);
        
        
        
    }
    
}
