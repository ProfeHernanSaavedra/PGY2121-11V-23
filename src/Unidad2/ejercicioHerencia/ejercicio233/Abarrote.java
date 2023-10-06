
package Unidad2.ejercicioHerencia.ejercicio233;

/**
 *
 * @author 
 */
public class Abarrote extends Producto{
    
    private boolean esPerecible;

    public Abarrote() {
        super();
    }

    public Abarrote(boolean esPerecible, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.esPerecible = esPerecible;
    }

    public boolean isEsPerecible() {
        return esPerecible;
    }

    public void setEsPerecible(boolean esPerecible) {
        this.esPerecible = esPerecible;
    }

    @Override
    public String toString() {
        return "Abarrote{" + "esPerecible=" + esPerecible + '}' + " "+super.toString();
    }

    @Override
    public void listar() {
        
        String perecible = "";
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Descrpcion: " + super.getDescripcion());
        
        if (esPerecible) {
            perecible = "Si";
        }
        else{
            perecible = "no";
        }
        System.out.println("Es perecible: " + perecible);
    }

    @Override
    public String comentarios(String comentario) {
        double calculoIVA = super.getPrecio()*IComentario.IVA;
        return "Comentario de Abarrote: " + comentario +
                "El valor del IVA del precio: "+super.getPrecio()+" es: $" + calculoIVA;
        
    }
    
    
    
    
    
    
}
