package aerolinea;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {

        BD_ArchivoTxt archivo = new BD_ArchivoTxt();
        Avion conexion = new Avion();
        Pasajero persona = new Pasajero();

        int seleccion = 0;
        int clase = 0;
        int bandera = 0;
        int bucle = 0;
        

        Scanner leer = new Scanner(System.in);

        while (bucle != 1) {
            System.out.println("--------------------------------------------");
            System.out.println("Biemvenido a la Aerolinea la Aurora Guatemala");
            System.out.println("Menu");
            System.out.println("1. Asignar Vuelo");
            System.out.println("2. Ver Horarios y Vuelos Disponibles.");
            System.out.println("3. Salir menu");
            System.out.println("--------------------------------------------");
            seleccion = leer.nextInt();

            switch (seleccion) {
                case 1:
                    do {
                        System.out.println("--------------------------------------------");
                        System.out.println("Biemvenido a la seccion de Asignar Vuelo");
                        System.out.println("Porfavor Ingresa tus Datos:");
                        System.out.println("--------------------------------------------");
                        leer.nextLine();
                        System.out.print("No. de DPI : ");
                        persona.setDpi(leer.nextLine());
                        System.out.print("Ingresa tu Nombre : ");
                        persona.setNombre(leer.nextLine());
                        System.out.print("Ingresa tu Apellido : ");
                        persona.setApellido(leer.nextLine());
                        System.out.print("Ingresa tu Edad : ");
                        persona.setEdad(leer.nextInt());
                        System.out.println("--------------------------------------------");
                        System.out.println("?Los Datos estan Correctos?");
                        System.out.println("1. Continuar    2. Regresar");
                        System.out.println("--------------------------------------------");
                        clase = leer.nextInt();

                    } while (clase != 1);
                    System.out.println("--------------------------------------------");
                    System.out.println("Seleccione Su vuelo");
                    System.out.println("Unicamente los Disponibles.");
                    archivo.DatosTxt("datos-avion.txt");
                    System.out.println("--------------------------------------------");
                    clase = leer.nextInt();

                    bandera = clase;
                    //primer pais
                    if (clase == 1) {
                        System.out.println("--------------------------------------------");
                        System.out.println("Porfavor eliga Una Opcion para el Precio del boleto");
                        System.out.println("1. Primera Clase");
                        System.out.println("2. Clase Economica");
                        System.out.println("--------------------------------------------");
                        clase = leer.nextInt();
                        //boleto primera clase pais uno
                        if (clase == 1) {

                            persona.PrimeraClase(bandera);
                            //boleto economico pais uno
                        } else if (clase == 2) {
                            persona.ClaseEconomica(bandera);
                        }
                        //otro pais
                    } else if (clase == 2) {
                        System.out.println("--------------------------------------------");
                        System.out.println("Porfavor eliga Una Opcion para el Precio del boleto");
                        System.out.println("1. Primera Clase");
                        System.out.println("2. Clase Economica");
                        System.out.println("--------------------------------------------");
                        clase = leer.nextInt();
                        //boleto primera clase segundo pais
                        if (clase == 1) {
                            persona.PrimeraClase(bandera);
                        } else if (clase == 2) {
                            persona.ClaseEconomica(bandera);
                        }
                    }
                    break;

                case 2:
                    archivo.DatosTxt("datos-avion.txt");
                    System.out.println("----------------------------");
                    System.out.println("Los Horarios Actuales Son: ");
                    System.out.println("----------------------------");
                    conexion.MostrarAvion1();
                    conexion.MostrarAvion2();
                    break;
                case 3:
                    bucle = 1;
                    System.out.println("Fin del Programa");
                    break;
                default:
                    System.out.println("!!!Eleccion Invalida!!!");
                    break;

            }
        }
    }
}
