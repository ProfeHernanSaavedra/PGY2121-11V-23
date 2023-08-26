/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploColaboracion;

/**
 *
 * @author profe Hernán
 * @version 25-08-2023
 */
public class Conductor {
    
    private String tipoLicencia,nombre;
    private int edad,rut;
    //private int rut;
    private Auto autito; //colaboracion

    public Conductor() {
    }

    public Conductor(String tipoLicencia, String nombre, int edad, int rut, Auto autito) {
        this.tipoLicencia = tipoLicencia;
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.autito = autito;
    }


    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public Auto getAutito() {
        return autito;
    }

    public void setAutito(Auto autito) {
        this.autito = autito;
    }

    
    
    @Override
    public String toString() {
        return "Conductor{" + "tipoLicencia=" + tipoLicencia + ", nombre=" + nombre + ", edad=" + edad + ", rut=" + rut + '}';
    }

    
    
    

    
    
    
    
}
