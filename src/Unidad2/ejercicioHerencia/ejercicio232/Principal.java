
package Unidad2.ejercicioHerencia.ejercicio232;

/**
 *
 * @author 
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Musica mus = new Musica("ROCK", "admin", "admin", 500, 10000);
        Television tv = new Television("SUSPENSO", "jperez", "123", 200, 50000);
        RedSocial rs = new RedSocial("Instagram","chimuelo", "nose", 300, 5000);
        
        Coleccion col = new Coleccion();
        
        col.agregar(mus);
        col.agregar(tv);
        col.agregar(rs);
        
        col.listar();
        System.out.println("*********************");
        col.masLikes();
        col.masTiempoConectado();
        System.out.println("****************");
        mus.visualizar();
        mus.almacenarLikes();
        
        
    }
    
}
