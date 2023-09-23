
package Unidad2.ejercicioHerencia1;

import java.util.Date;

/**
 *
 * @author USRVI-LC4
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Date fecha = new Date();
        
        Instagram insta = new Instagram(100, "en clases..", true, "admin", "admin");
        //Twitter twit = new Twitter(200,"se quemo la iglesia", fecha, usuario, password);
        Twitter twit = new Twitter(200,"se quemo la iglesia", new Date(), "admin", "admin");
        
        System.out.println("**************");
        System.out.println(insta.toString());
        System.out.println(twit.toString());
        System.out.println("**************");
        System.out.println(insta.visualizar());
        System.out.println(twit.visualizar());
        
        
        
        
        
        
    }
    
}
