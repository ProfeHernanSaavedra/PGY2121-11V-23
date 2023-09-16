package Unidad2.ejercicioScooting;

/**
 *
 * @author Profe hernan
 */
public class TestEmpresa {
    
    public static void main(String[] args) {
        
        Puesto puesto1 = new Puesto(1,"Programador Junior");
        Puesto puesto2 = new Puesto(2,"Programador Senior");
        
        Empleado empleado1 = new Empleado("1-1", "Juan",'M', 5, 27, puesto1);
        Empleado empleado2 = new Empleado("2-2", "Maria",'F', 10, 37, puesto2);
        
        Empresa empresa = new Empresa(); //creo el arreglo
        
        //agreguemos empleados
        if (empresa.buscarEmpleado(empleado1.getRut())== false) {
            empresa.agregarEmpleado(empleado1);
            System.out.println("Empleado " + empleado1.getNombre() + " se agrego");
        }
        else{
            System.out.println(empleado1.getNombre()+" existe!");
        }
        
        if (empresa.buscarEmpleado(empleado1.getRut())== false) {
            empresa.agregarEmpleado(empleado1);
            System.out.println("Empleado " + empleado1.getNombre() + " se agrego");
        }
        else{
            System.out.println(empleado1.getNombre()+" existe!");
        }
        
          if (empresa.buscarEmpleado(empleado2.getRut())== false) {
            empresa.agregarEmpleado(empleado2);
            System.out.println("Empleado " + empleado2.getNombre() + " se agrego");
        }
        else{
            System.out.println(empleado2.getNombre()+" existe!");
        }
        
         empresa.listarEmpleado();
         
         empresa.eliminarEmpleado(empleado1.getRut());
         System.out.println("");
         empresa.listarEmpleado();
         
    }
    
}
