package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lstCabinas = new ArrayList<>();

        int opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Crear cabina");
            System.out.println("2. Registrar llamada");
            System.out.println("3. Mostrar informacion de la cabina");
            System.out.println("4. Mostrar un consolidado total de toda la información de las cabinas");
            System.out.println("5. Reiniciar cabina");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 ->{
                    System.out.println("Ingrese id de cabina");
                    int numeroCabina = scanner.nextInt();
                    System.out.println("Ingrese su nombre");
                    String nombre = scanner.nextLine();
                    System.out.println("Cabina creada");
                    lstCabinas.add(numeroCabina,nombre);
                }
                case 2 -> {
                    System.out.println("Ingrese id de cabina");
                    int numeroCabina = scanner.nextInt();
                    System.out.println("Ingrese numero a marcar");
                    int numeroMarcado = scanner.nextInt();
                    System.out.println("Ingrese tipo de llamada");
                    int tipoLlamada = scanner.nextInt();
                    System.out.println("Llamada en curso");
                    System.out.println("Ingrese minutos que duro la llamada");
                    int minutosLlamada = scanner.nextInt();
                }
                case 3 ->{

                }
                case 4 -> {

                }
                case 5 ->{
                    System.out.println("Ingrese id de cabina a reiniciar");

                }
                case 6 ->{
                    System.out.println("Saliendo del sistema.");

                    default ->
                            System.out.println("Opción no válida, intente de nuevo.");
                }
    } while (opcion != 8);
}