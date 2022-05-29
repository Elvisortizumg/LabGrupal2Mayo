package aerolinea;

import java.io.*;

public class BD_ArchivoTxt {

    String texto = "";

    public void DatosTxt(String direccion) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direccion));

            String temp = "";
            String bfRead;

            while ((bfRead = bf.readLine()) != null) {

                temp = bfRead;

                String[] arreglo = temp.split("-");

                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println("" + arreglo[i]);
                }

            }
            texto = temp;

        } catch (Exception e) {
            System.out.println("No se encontro archivo");
        }
    }

}
