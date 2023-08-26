/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploColaboracion;

/**
 *
 * @author USRVI-LC4
 */
public class ProbandoAuto {
    
    public static void main(String[] args) {
        
        Auto auto1 = new Auto(4, "XXJJ65", "SUZUKI", "BALENO", "AZUL");
        Conductor conductor1 = new Conductor("B","JUAN",24, 1234, auto1);

        System.out.println("Nombre: " + conductor1.getNombre());
        System.out.println("Marca: " + conductor1.getAutito().getMarca());
        
    }
    
}
