
package Unidad2.ejercicioHerencia.ejercicio232;

/**
 *
 * @author 
 */
public class Musica extends Interes implements ILike{
    
    private String tipoMusica;

    public Musica() {
        super();
    }

    public Musica(String tipoMusica, String usuario, String password, int tiempoConectado, int like) {
        super(usuario, password, tiempoConectado, like);
        this.tipoMusica = tipoMusica;
    }
    
    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    @Override
    public String toString() {
        return "Musica{" + "tipoMusica=" + tipoMusica + '}' + super.toString();
    }
    
    public void listar()
    {
        System.out.println("Usuario: " + super.getUsuario());
        System.out.println("Tiempo Conectado: " + super.getTiempoConectado());
        System.out.println("Tipo Musica: " + this.getTipoMusica());
    }

    @Override
    public void visualizar() {
        
        System.out.println("Usuario: " + super.getUsuario());
        System.out.println("Tipo Musica: " + this.getTipoMusica());
        
    }

    @Override
    public void almacenarLikes() {
        System.out.println("Cantidad de Likes: " + super.like);
        System.out.println("Tiempo Conectado: "  + super.getTiempoConectado());
    }
    
   
    
}
