package Unidad2.ejercicioHerencia.ejercicio233;

/**
 *
 * @author
 */
public class Congelado extends Producto {

    private double temperatura;

    public Congelado() {
        super();
    }

    public Congelado(double temperatura, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Congelado{" + "temperatura=" + temperatura + '}' + " " + super.toString();
    }

    @Override
    public void listar() {
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Descrpcion: " + super.getDescripcion());
        System.out.println("Temperatura: " + this.getTemperatura());
    }
    
      @Override
    public String comentarios(String comentario) {
        return "Comentario de Abarrote: " + comentario;
    }

}
