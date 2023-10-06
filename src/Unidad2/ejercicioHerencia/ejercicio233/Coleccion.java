
package Unidad2.ejercicioHerencia.ejercicio233;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Coleccion {
    
    private ArrayList<Producto>listaProductos;

    public Coleccion() {
        listaProductos = new ArrayList<>();
    }
    
    public boolean agregarProducto(Producto prod){
        
        return listaProductos.add(prod);
        
    }
    
    public void listarProductos()
    {
        int suma = 0;
        System.out.println("Codigo\t Descripcion\t Precio\t Cantidad\t Total");
        for (Producto prod : listaProductos) {
            suma = suma + prod.getPrecio()*prod.getCantidad();
            System.out.println(prod.getCodigo()+"\t"+prod.getDescripcion()+"\t\t"+prod.getPrecio()+"\t\t"+prod.getCantidad()+"\t"+suma);
        }
        
        System.out.println("                                            ---------------");
        System.out.println("                                          Total :$"+suma);
    }
    
    public void calculaTotalOferta()
    {
        String clase = "";
        int suma =0;
        for (Producto prod : listaProductos) {
//            clase = prod.getClass().getName();
//            System.out.println(clase);
            if (prod.getClass().getName().equalsIgnoreCase("Unidad2.ejercicioHerencia.ejercicio233.Oferta")) {
                suma = suma + prod.getPrecio()*prod.getCantidad();
            }
            
        }
        System.out.println("La suma de Ofertas es: $" + suma);
    }

    
    
    
}
