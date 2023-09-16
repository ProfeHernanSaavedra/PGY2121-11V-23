package ejercicioCanciones;

import java.util.ArrayList;

/**
 *
 * @author profe hernan
 */
public class Lista {
    
    private ArrayList<Cancion> listaCanciones;
    

    public Lista() {
        
        listaCanciones = new ArrayList<>();
    }
    
    public boolean agregarCancion(Cancion cancion)
    {
        return listaCanciones.add(cancion);
    }
    
    public void listarCanciones()
    {
        for (Cancion cancion : listaCanciones) {
            cancion.imprimirCanciones();
        }
    }
    
    
    
    
    
    
}
