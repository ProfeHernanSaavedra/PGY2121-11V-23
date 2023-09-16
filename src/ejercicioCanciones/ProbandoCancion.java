package ejercicioCanciones;

import ejercicioCanciones.Cancion;
import java.util.Scanner;

/**
 *
 * @author profe Hernán
 * @version 24-08-2023
 */
public class ProbandoCancion {

    //main + tab
    public static void main(String[] args) {

        int opcion = 0;
        Scanner leer = new Scanner(System.in);
        //crear canciones
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("SUAVE", "Luis Miguel", 217, true, 'N');

        //modificar cancion1
        cancion1.setTitulo("Creep");
        cancion1.setArtista("Radiohead");
        cancion1.setTiempoDuracion(218);
        cancion1.setDescargada('N');
        //cancion1.setFavorita(true);
        //si no asigno valor, por defecto boolean asigna false

//        System.out.println(cancion1.getTitulo()+" se adelanto.." + cancion1.adelantarCancion(10, 0)+ " segundos");
//        System.out.println("****************************");
//        System.out.println(cancion1.obtenerTipoCancion());
//        System.out.println("**********");
//        cancion1.imprimirCanciones();
//        System.out.println("*****************");
//        cancion2.imprimirCanciones();
//        System.out.println(cancion1);
//        System.out.println(cancion2);
        Lista lista1 = new Lista();
        Lista lista2 = new Lista();
        lista1.agregarCancion(cancion1);
        lista1.agregarCancion(cancion2);
        lista2.agregarCancion(cancion2);
        lista2.agregarCancion(cancion1);

        do {
            System.out.println("1. Lista 1");
            System.out.println("2. Lista 2");
            System.out.println("3. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    lista1.listarCanciones();
                    break;
                case 2:
                    lista2.listarCanciones();
                    break;
                case 3:
                    System.out.println("Saliendo del programa.....");
                    break;
                default:
                    System.out.println("No existe mas opciones");
                    
            }

        } while (opcion != 3);

    }

}
