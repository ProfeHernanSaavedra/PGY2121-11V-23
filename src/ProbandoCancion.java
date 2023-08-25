/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author profe Hernán
 * @version 24-08-2023
 */
public class ProbandoCancion {
    
    //main + tab
    public static void main(String[] args) {
        
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
        
        System.out.println(cancion1.getTitulo()+" se adelanto.." + cancion1.adelantarCancion(10, 0)+ " segundos");
        System.out.println("****************************");
        System.out.println(cancion1.obtenerTipoCancion());
        System.out.println("**********");
        cancion1.imprimirCanciones();
        System.out.println("*****************");
        cancion2.imprimirCanciones();
        System.out.println(cancion1);
        System.out.println(cancion2);
        
    }
    
}
