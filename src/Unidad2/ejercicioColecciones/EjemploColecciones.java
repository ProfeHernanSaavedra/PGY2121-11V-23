
package Unidad2.ejercicioColecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Profe hernan
 */
public class EjemploColecciones {
    
    public static void main(String[] args) {
        
        //crear un arreglo
        ArrayList<String> listaNombres = new ArrayList<>();
      
        listaNombres.add("Juan");
        listaNombres.add("Pedro");
        listaNombres.add("Maria");
        
        System.out.println(listaNombres);
        
        //for para recorrer arreglos
        //fore + tab --> foreach
        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }
        
        System.out.println("");
        System.out.println("******ARREGLO AUTO *****");
        
        ArrayList<Auto> listaAutos = new ArrayList<>();
        
       Auto auto1 = new Auto("KIA", "SPORTAGE", 2018);
       Auto auto2 = new Auto("Toyota","SUPRA",1999);
       
       listaAutos.add(auto1);
       listaAutos.add(auto2);
       
        System.out.println(listaAutos);
        
        System.out.println("MARCAS:");
        for (Auto auto : listaAutos) {
            System.out.println("- "+ auto.getMarca() + " " + auto.getAnno());
        }
        
        
        
    }
    
}
