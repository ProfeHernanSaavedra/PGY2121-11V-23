/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploColaboracion;

/**
 *
 * @author USRVI-LC4
 */
public class Auto {
    
    private int cantRuedas;
    private String patente,marca,modelo,color;

    public Auto() {
    }

    public Auto(int cantRuedas, String patente, String marca, String modelo, String color) {
        this.cantRuedas = cantRuedas;
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" + "cantRuedas=" + cantRuedas + ", patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
    
    
    
}
