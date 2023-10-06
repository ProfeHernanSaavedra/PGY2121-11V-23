
package Unidad2.ejercicioHerencia.ejercicio233;

/**
 *
 * @author 
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Abarrote arroz = new Abarrote(true, 1, 2500, 2, "ArrozG2");
        Aseo poett = new Aseo("liquido", 2, 3000, 2,"Rosas");
        Congelado helado = new Congelado(-18, 3, 1200, 3,"MEGA ");
        Liquido cerveza = new Liquido(7, 4, 12000, 6, "CORONA");
        Oferta tv = new Oferta(10, 5, 200000, 1, "LG");
        Oferta mac = new Oferta(20,6,550000,2,"M1");
        
        Coleccion col = new Coleccion();
        col.agregarProducto(arroz);
        col.agregarProducto(poett);
        col.agregarProducto(helado);
        col.agregarProducto(cerveza);
        col.agregarProducto(tv);
        col.agregarProducto(mac);
                
                
        col.calculaTotalOferta();
        System.out.println("******");
        col.listarProductos();
        System.out.println("");
        System.out.println(arroz.comentarios("RIIICCOOO"));
        
    }
    
}
