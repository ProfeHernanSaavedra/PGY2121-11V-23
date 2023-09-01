
package ejercicio132;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author USRVI-LC4
 */
public class Fecha {
    
    public static void main(String[] args) {
        
        Date fecha = new Date(); //me da la fecha de hoy
        System.out.println(fecha);
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        System.out.println(formatoFecha.format(fecha));
        System.out.println(formatoHora.format(fecha));
        
        String fechaStr = fecha.toString();
        
    }
    
}
