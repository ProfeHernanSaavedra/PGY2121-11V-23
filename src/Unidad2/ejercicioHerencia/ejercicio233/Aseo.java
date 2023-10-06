package Unidad2.ejercicioHerencia.ejercicio233;

/**
 *
 * @author
 */
public class Aseo extends Producto {

    private String tipo;

    public Aseo() {
        super();
    }

    public Aseo(String tipo, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Aseo{" + "tipo=" + tipo + '}' + " " + super.toString();
    }

    @Override
    public void listar() {
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Descrpcion: " + super.getDescripcion());
        System.out.println("Tipo: " + this.getTipo());
    }
    
      @Override
    public String comentarios(String comentario) {
        return "Comentario de Aseo: " + comentario;
    }

}
