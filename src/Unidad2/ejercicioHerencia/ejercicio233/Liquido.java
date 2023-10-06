package Unidad2.ejercicioHerencia.ejercicio233;

/**
 *
 * @author
 */
public class Liquido extends Producto {

    private double gradosAlcohol;

    public Liquido() {
        super();
    }

    public Liquido(double gradosAlcohol, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.gradosAlcohol = gradosAlcohol;
    }

    public double getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(double gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    @Override
    public String toString() {
        return "Liquido{" + "gradosAlcohol=" + gradosAlcohol + '}' + " " + super.toString();

    }

    @Override
    public void listar() {
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Descrpcion: " + super.getDescripcion());
        System.out.println("Grados Alcohol: " + this.getGradosAlcohol());
    }
    
      @Override
    public String comentarios(String comentario) {
        return "Comentario de Liquido: " + comentario;
    }

}
