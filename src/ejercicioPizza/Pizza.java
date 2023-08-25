package ejercicioPizza;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Profe Hernán
 * @version 16-08-2023
 */
public class Pizza {
    
    public String nombre;
    public String tamaño;
    public String masa;
    
    //métodos
    public void preparar()
    {
        System.out.println("Preparando..." + nombre + " de tamaño.. "+ tamaño );
    }
    
    public void calentar()
    {
        System.out.println("Calentando..." + nombre+ " con masa.." + masa);
    }
    
}
