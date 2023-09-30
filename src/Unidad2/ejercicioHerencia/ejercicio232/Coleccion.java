
package Unidad2.ejercicioHerencia.ejercicio232;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Coleccion {
    
    private ArrayList<Interes>listaIntereses;

    public Coleccion() {
        listaIntereses = new ArrayList<>();
    }
    
    public boolean agregar(Interes interes)
    {
        return listaIntereses.add(interes);
    }
    
    public void listar()
    {
        for (Interes interes : listaIntereses) {
            System.out.println(interes);
        }
    }
    
    public void masLikes()
    {
        int mayor = 0;
        String claseInteres = "";
        for (Interes interes : listaIntereses) {
            if (interes.getLike()>mayor) {
                mayor = interes.getLike();
                claseInteres = interes.getClass().getName();
                
            }
            
        }
        //System.out.println(mayor);
        //System.out.println("El mayor iteres con mas likes es:"+ claseInteres);
        
        
        
        switch (claseInteres) {
                    
            case "Unidad2.ejercicioHerencia.ejercicio232.RedSocial":
                System.out.print("El mayor interes con mas likes es: Red Social");
                break;
            case "Unidad2.ejercicioHerencia.ejercicio232.Television":
                System.out.print("El mayor interes con mas likes es: Television");
                break;
            case "Unidad2.ejercicioHerencia.ejercicio232.Musica":
                System.out.print("El mayor interes con mas likes es: Musica");
                break;
            
        } 
    }
    
   public void masTiempoConectado()
    {
        int mayor = 0;
        String claseInteres = "";
        for (Interes interes : listaIntereses) {
            if (interes.getTiempoConectado()>mayor) {
                mayor = interes.getTiempoConectado();
                claseInteres = interes.getClass().getName();
                
            }
            
        }
        //System.out.println(mayor);
        //System.out.println("El mayor iteres con mas likes es:"+ claseInteres);
        
        
        
        switch (claseInteres) {
                    
            case "Unidad2.ejercicioHerencia.ejercicio232.RedSocial":
                System.out.println(" y El mayor tiempo conectado es: Red Social");
                break;
            case "Unidad2.ejercicioHerencia.ejercicio232.Television":
                System.out.println(" y El mayor tiempo conectado es: Television");
                break;
            case "Unidad2.ejercicioHerencia.ejercicio232.Musica":
                System.out.println(" y El mayor tiempo conectado es: Musica");
                break;
            
        }
        
        
    }
    
}
