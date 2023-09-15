
package Unidad2.ejercicioScooting;

import java.util.ArrayList;

/**
 *
 * @author profe hernan
 */
public class Empresa {
    
    private ArrayList<Empleado> listaEmpleado;

    public Empresa() {
        
        listaEmpleado = new ArrayList<>();
    }
    
    //agregar
    public void agregarEmpleado(Empleado emple)
    {
        listaEmpleado.add(emple);
    }
    
    //buscar
    public boolean buscarEmpleado(String rut)
    {
        //fore+tab
        for (Empleado empleado : listaEmpleado) {
            if (empleado.getRut().equals(rut)) {
                return true;
            }
        }
        return false;
    }
    
    //eliminar
    public void eliminarEmpleado(String rut)
    {
        for (Empleado empleado : listaEmpleado) {
            if (this.buscarEmpleado(rut)) {
                listaEmpleado.remove(empleado);
            }
            else{
                System.out.println("No existe empleado");
            }
        }
    }
    
    //listar
    public void listarEmpleado()
    {
        for (Empleado empleado : listaEmpleado) {
            System.out.println(empleado);
        }
    }
    
    
    
}
