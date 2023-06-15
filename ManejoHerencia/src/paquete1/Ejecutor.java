/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Scanner;
import paquete2.*;
import paquete3.*;
import paquete4.*;
import paquete5.*;

public class Ejecutor {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos una lista de Prestamos
        List<Prestamo> misPrestamos = new ArrayList<>();
        int opcion = 0;

        // Creamos un beneficiario y un garante vacios
        Persona beneficiario = new Persona("", "", 0, "");
        Persona garante = new Persona("", "", 0, "");

        //  Declaramos e inicilizamos todas las variables correspondientes a todos los prestamos
        String tipoAutomovil = "";
        String marcaAutomovil = "";
        double valorAutomovil = 0;
        double valorMensualAutomovil = 0;
        int tiempoPrestamo = 0;
        String ciudad = "";


        do {
            System.out.println("1) Ingresar un préstamo de automovil: " + "\n" +
                                "2) Ingresar un préstamo educativo" + "\n" +
                                "3) Salir");

            opcion = entrada.nextInt();

            // Si la opción es 1 o 2
            if (opcion == 1 || opcion == 2){
                // Ingresamos los datos aplicables a todos los préstamos
                // pidiendo los datos del beneficiario, garante, tiempo y ciudad
                System.out.println("Ingrese el nombre del beneficiario: ");
                String nombreBeneficiario = entrada.nextLine();
                entrada.nextLine();

                System.out.println("Ingrese el apellido del beneficiario: ");
                String apellidoBeneficiario = entrada.nextLine();
                entrada.nextLine();

                System.out.println("Ingrese la edad: ");
                int edadBeneficiario = entrada.nextInt();
                entrada.nextLine();

                System.out.println("Ingrese el username");
                String usernameBeneficiario = entrada.nextLine();
                entrada.nextLine();

                System.out.println("Ingrese el nombre del garante: ");
                String nombreGarante = entrada.nextLine();
                entrada.nextLine();

                System.out.println("Ingrese el apellido del garante: ");
                String apellidoGarante = entrada.nextLine();
                entrada.nextLine();

                System.out.println("Ingrese la edad: ");
                int edadGarante = entrada.nextInt();
                entrada.nextLine();

                System.out.println("Ingrese el username");
                String usernameGarante = entrada.nextLine();
                entrada.nextLine();

                System.out.println("Ingrese el tiempo del prestamo: ");
                tiempoPrestamo = entrada.nextInt();
                entrada.nextLine();

                System.out.println("Ingrese la ciudad: ");
                ciudad = entrada.nextLine();
                entrada.nextLine();

                // Creamos las instancias de Persona para el beneficiario y el garante
                beneficiario = new Persona(nombreBeneficiario, apellidoBeneficiario, edadBeneficiario, usernameBeneficiario);
                garante = new Persona(nombreGarante, apellidoGarante, edadGarante, usernameGarante);

            }


            switch (opcion) {
                case 1: // Ingreso de los datos del préstamo de automovil
                    
                    System.out.println("Ingrese el tipo de automovil: ");
                    tipoAutomovil = entrada.nextLine();
                    entrada.nextLine();

                    System.out.println("Ingrese la marca del automovil: ");
                    marcaAutomovil = entrada.nextLine();
                    entrada.nextLine();

                    System.out.println("Ingrese el valor del automovil: ");
                    valorAutomovil = entrada.nextDouble();
                    entrada.nextLine();

                    System.out.println("Ingrese el valor mensual del automovil: ");
                    valorMensualAutomovil = entrada.nextDouble();
                    entrada.nextLine();

                    // Creamos la instancia de PrestamoAutomovil
                    PrestamoAutomovil prestamoAutomovil = new PrestamoAutomovil(beneficiario, tiempoPrestamo, ciudad, tipoAutomovil, marcaAutomovil, garante, valorAutomovil);

                    // Agregamos el préstamo a la lista
                    misPrestamos.add(prestamoAutomovil);
                    
                    break;
            
                case 2: // Ingreso de los datos del préstamo educativo
                    System.out.println("Ingrese el nivel de estudio: ");
                    String nivelEstudio = entrada.nextLine();
                    entrada.nextLine();

                    System.out.println("Ingrese el nombre del centro educativo: ");
                    String nombreCentroEducativo = entrada.nextLine();
                    entrada.nextLine();

                    System.out.println("Ingrese el valor de la carrera: ");
                    double valorCarrera = entrada.nextDouble();
                    entrada.nextLine();

                    System.out.println("Ingrese el valor mensual de la carrera: ");
                    double valorMensualCarrera = entrada.nextDouble();
                    entrada.nextLine();

                    // Creamos la instancia de PrestamoEducativo
                    // PrestamoEducativo prestamoEducativo = new PrestamoEducativo(beneficiario, tiempoPrestamo, ciudad, nivelEstudio, nombreCentroEducativo, valorCarrera);

                    // Agregamos el préstamo a la lista
                    misPrestamos.add(new PrestamoEducativo(beneficiario, tiempoPrestamo, ciudad, nivelEstudio, nombreCentroEducativo, valorCarrera));
                    
                    break;
                
                case 3: // Salir
                    System.out.println("Lista de préstamos: ");

                    // Recorremos la lista de préstamos e imprimimos la información

                    for (Prestamo prestamo : misPrestamos) {
                        System.out.println(prestamo);
                    }

                    System.out.println("Gracias por usar el programa");
                
                    break;

                default:
                    break;
            }

        } while (opcion != 3);
    }
}
