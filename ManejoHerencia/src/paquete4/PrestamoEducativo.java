/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo{
    private String nivelEstudio;
    private String centroEstudio;
    private double valorCarrera;
    private double valorMensualCarrera;

    public PrestamoEducativo(Persona b, int tiempoPrestamo, String c, String ne, String ce, double vc) {
        super(b, tiempoPrestamo, c);
        nivelEstudio = ne;
        centroEstudio = ce;
        valorCarrera = vc;
        valorMensualCarrera = (valorCarrera / tiempoPrestamo) * 0.90;
    }

    public void establecerNivelEstudio(String n) {
        nivelEstudio = n;
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public void establecerCentroEstudio(String n) {
        centroEstudio = n;
    }

    public String obtenerCentroEstudio() {
        return centroEstudio;
    }

    public void establecerValorCarrera(double n) {
        valorCarrera = n;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    @Override
    public String toString() {
        return String.format("%s - Nivel: %s - Centro: %s - Valor: %.2f",
                super.toString(),
                obtenerNivelEstudio(),
                obtenerCentroEstudio(),
                obtenerValorCarrera());
    }
    
}
