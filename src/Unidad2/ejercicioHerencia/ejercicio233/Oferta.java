package Unidad2.ejercicioHerencia.ejercicio233;

/**
 *
 * @author
 */
public class Oferta extends Producto {

    private int descuento;

    public Oferta() {
        super();
    }

    public Oferta(int descuento, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.descuento = descuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Oferta{" + "descuento=" + descuento + '}' + " " + super.toString();
    }

    @Override
    public void listar() {
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Descrpcion: " + super.getDescripcion());
        System.out.println("Descuento: " + this.getDescuento() + "%");
    }

    @Override
    public String comentarios(String comentario) {
        return "Comentario de Oferta: " + comentario;
    }

}
