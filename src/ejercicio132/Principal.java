
package ejercicio132;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Profe Hernán
 * @version 31-08-2023
 */
public class Principal {
    
    public static void main(String[] args) {
        
        //menu
        int opcion;
        boolean flag; //validaciones
        //cliente
        int rut,telefono;
        String nombre,mail,direccion;
        char dv;
        //producto
        int codigo,precio,cantidad,totalProductos;
        String subcategoria,descripcion;
        char medida;
        //solicitud
        int numero;
        String fecha;
        int porcentaje;
        int descuento;
        
        Scanner leer = new Scanner(System.in);
        
        Valida valida = new Valida();
        Cliente cliente = new Cliente();
        Solicitud sol = new Solicitud();
        
        do {
            System.out.println("*****MENU******");
            System.out.println("1. Ingresar Cliente");
            System.out.println("2. Ingresar Solicitud y sus Productos");
            System.out.println("3. Aplicar descuento");
            System.out.println("4. Salir y Ver Solicitud");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Ingrese Rut: ");
                        rut = leer.nextInt();
                        System.out.println("Ingrese DV: ");
                        dv = leer.next().charAt(0);
                        flag = valida.validarRut(rut, dv);
                        if (flag == false) {
                            System.out.println("Rut no es valido");
                        }
                    } while (flag == false);
                    
                    System.out.println("Ingrese nombre:");
                    nombre = leer.next();
                    
                    do {
                        System.out.println("Ingrese numero de telefono:");
                        telefono = leer.nextInt();
                        flag = valida.validarLargo8(telefono);
                        if (flag == false) {
                            System.out.println("Telefono debe ser largo 8");
                        }
                    } while (flag == false);
                    
                    do {
                        
                        System.out.println("Ingrese mail:");
                        mail = leer.next();
                        flag = valida.largoCorreo6(mail);
                        if (flag == false) {
                            System.out.println("Correo debe tener largo 6");
                        }
                    } while (flag == false);
                    
                    System.out.println("Ingrese Direccion:");
                    direccion = leer.next();
                    
                    //guardar los datos en cliente
//                    Cliente clientito = new Cliente(rut, telefono, dv, nombre, mail, direccion);
                    cliente.setRut(rut);
                    cliente.setDv(dv);
                    cliente.setNombre(nombre);
                    cliente.setDireccion(direccion);
                    cliente.setMail(mail);
                    cliente.setTelefono(telefono);
                    
                    System.out.println("*****DATOS CLIENTE GUARDADOS");
                    System.out.println(cliente);
                    
                    break;
                case 2:
                    //solicitud
                    numero = sol.obtenerNumeroSolicitud();
                    sol.setNumero(numero);
                    sol.setCliente(cliente);
                    Date fechaDate = null;
                    do {
                        System.out.println("Ingrese fecha: (dd/mm/aaaa)");
                        fecha = leer.next();
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        
                        //trycacth+tab
                        try {
                            fechaDate = formato.parse(fecha);
                            //castillo!!
                            flag = valida.validarFecha(fechaDate);
                            if (flag == false) {
                                System.out.println("Esta ingresando una fecha superior a la actual");
                            }
                        } catch (ParseException e) {
                            flag = false;
                            System.out.println("Feche mala, debe ser (dd/mm/aaaa)");
                        }
                              
                    } while (flag == false);
                    sol.setFecha(fechaDate);
                    
                    //Productos
                    
                    System.out.println("Cuantos productos comprara?");
                    totalProductos = leer.nextInt();
                    for (int i = 1; i <= totalProductos; i++) {
                        
                        Producto prod = new Producto();
                        codigo = 0;
                        precio = 0;
                        cantidad = 0;
                        subcategoria = "";
                        descripcion = "";
                        medida = ' ';
                        
                        do {
                            System.out.println("Ingrese codigo: ");
                            codigo = leer.nextInt();
                            flag = valida.validarLargo4(codigo);
                            if (flag == false) {
                                System.out.println("Codigo debe tener largo 4");
                            }
                        } while (flag == false);
                        
                        do {
                            System.out.println("Ingrese Precio: ");
                            precio = leer.nextInt();
                            flag = valida.validarNumeroPositivo(precio);
                            if (flag == false) {
                                System.out.println("Ingrese un numero positivo");
                            }
                        } while (flag == false);
                        
                        do {
                            System.out.println("Ingres subcategoria (FRUTA o VERDURA)");
                            subcategoria = leer.next();
                            flag = valida.validarSubcategoria(subcategoria);
                            if (flag == false) {
                                System.out.println("Debe ser fruta o verdura");
                            }
                        } while (flag == false);
                        
                        System.out.println("Ingrese Descripcion:");
                        descripcion = leer.next();
                        
                        System.out.println("Ingrese medida (U:unidad o G:gramos)");
                        medida = leer.next().toUpperCase().charAt(0);
                        //toUpperCase ---> u --> U
                        if (medida == 'U') {
                            System.out.println("Ingrese unidades:");
                            
                        }else{
                            System.out.println("Ingrese gramos:");
                        
                        }
                        
                        cantidad = leer.nextInt();
                        
                        //guardar los datos de producto
                        prod.setCodigo(codigo);
                        prod.setPrecio(precio);
                        prod.setSubcategoria(subcategoria);
                        prod.setDescripcion(descripcion);
                        prod.setMedida(medida);
                        prod.setCantidad(cantidad);
                        
                        sol.agregarProductos(prod);
                        System.out.println("****SOLICITUD AGREGADA*****");
                        System.out.println(sol);
                    }
                    
                    break;
                case 3:
                    System.out.println("Ingrese porcentaje descuento (1-100%)");
                    porcentaje = leer.nextInt();
                    descuento = sol.descontar(porcentaje);
                    System.out.println("Total: $ "+ sol.getTotal());
                    System.out.println("Descuento $ " + descuento);
                    System.out.println("----------------------");
                    System.out.println("A pagar $ "+ (sol.getTotal()- descuento));
                    break;
                case 4: 
                    System.out.println("");
                    System.out.println("Solicitud terminada");
                    sol.verSolicitud();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            
            
        } while (opcion != 4);
        
        
        
    }
    
}
