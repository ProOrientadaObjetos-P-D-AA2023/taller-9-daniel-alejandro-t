/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */

import paquete5.*;

public abstract class Prestamo {
    private Persona beneficiario;
    private int tiempoPrestamoEnMeses;
    private String ciudad;

    protected Prestamo(Persona b, int t, String c) {
        beneficiario = b;
        tiempoPrestamoEnMeses = t;
        ciudad = c;
    }

    public void establecerBeneficiario(Persona n) {
        beneficiario = n;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public void establecerTiempoPrestamoEnMeses(int n) {
        tiempoPrestamoEnMeses = n;
    }

    public double obtenerTiempoPrestamoEnMeses() {
        return tiempoPrestamoEnMeses;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return String.format("Beneficiario: %s - Tiempo: %.2f - Ciudad: %s",
                obtenerBeneficiario(),
                obtenerTiempoPrestamoEnMeses(),
                obtenerCiudad());
    }
    
}
