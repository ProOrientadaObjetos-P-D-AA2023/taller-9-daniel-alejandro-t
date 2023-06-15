/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo{
    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante;
    private double valorAutomovil;
    private double valorMensualAutomovil;

    public PrestamoAutomovil(Persona b, int t, String c, String ta, String ma, Persona g, double va) {
        super(b, t, c);
        tipoAutomovil = ta;
        marcaAutomovil = ma;
        garante = g;
        valorAutomovil = va;
    }

    public void establecerTipoAutomovil(String n) {
        tipoAutomovil = n;
    }

    public String obtenerTipoAutomovil() {
        return tipoAutomovil;
    }

    public void establecerMarcaAutomovil(String n) {
        marcaAutomovil = n;
    }

    public String obtenerMarcaAutomovil() {
        return marcaAutomovil;
    }

    public void establecerGarante(Persona n) {
        garante = n;
    }

    public Persona obtenerGarante() {
        return garante;
    }

    public void establecerValorAutomovil(double n) {
        valorAutomovil = n;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public void establecerValorMensualAutomovil() {
        valorMensualAutomovil = (valorAutomovil / obtenerTiempoPrestamoEnMeses()) 
                + ((valorAutomovil * 0.05) / obtenerTiempoPrestamoEnMeses());
    }

    public double obtenerValorMensualAutomovil() {
        return valorMensualAutomovil;
    }

    @Override
    public String toString() {
        return String.format("%s - Tipo: %s - Marca: %s - Garante: %s - "
                + "Valor Automovil: %.2f - Valor Mensual: %.2f",
                super.toString(),
                obtenerTipoAutomovil(),
                obtenerMarcaAutomovil(),
                obtenerGarante(),
                obtenerValorAutomovil(),
                obtenerValorMensualAutomovil());
    }

    
    
}
