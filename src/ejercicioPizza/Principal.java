package ejercicioPizza;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC7
 */
public class Principal {
    
    //main + tab
    public static void main(String[] args) {
        
        Pizza objPizza1 = new Pizza();
        objPizza1.nombre = "Pepperoni";
        objPizza1.tamaño = "grande";
        objPizza1.masa = "gruesa";
        
        objPizza1.preparar();
        objPizza1.calentar();
        
        System.out.println("********");
        
        Pizza objPizza2 = new Pizza();
        objPizza2.nombre = "vegetariana";
        objPizza2.tamaño = "familiar";
        objPizza2.masa = "delgada";
        
        objPizza2.preparar();
        objPizza2.calentar();
        
        
    }
    
}
