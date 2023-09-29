
package Unidad2.ejercicioHerencia.ejercicio232;

/**
 *
 * @author 
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Musica mus = new Musica("ROCK", "admin", "admin", 120, 10);
        Television tv = new Television("SUSPENSO", "jperez", "123", 200, 5);
        RedSocial rs = new RedSocial("Instagram","chimuelo", "nose", 300, 5000);
        
        Coleccion col = new Coleccion();
        
        col.agregar(mus);
        col.agregar(tv);
        col.agregar(rs);
        
        col.listar();
        
        col.masLikes();
        
        mus.visualizar();
        mus.almacenarLikes();
        
        
    }
    
}
