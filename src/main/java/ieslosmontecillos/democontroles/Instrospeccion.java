package ieslosmontecillos.democontroles;

import java.util.Arrays;
import java.util.Scanner;

public class Instrospeccion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el nombre de la clase: ");
        String nombre_clase = sc.nextLine();

        try {
            // MiControl -> ieslosmontecillos.democontroles.MiControl
            Class<?> clase = Class.forName(nombre_clase);

            //Muestra el nombre de la clase completo
            System.out.println(clase.getName());
            //Muestra los constructores declarados en la clase
            System.out.println("Contructores de la clase: " + Arrays.toString(clase.getDeclaredConstructors()));
            //Muestra los campos de la clase
            System.out.println("Campos de la clase: " + Arrays.toString(clase.getDeclaredFields()));

        }catch (ClassNotFoundException e){
            System.out.println("La clase " + nombre_clase + " no existe.");
        }

        sc.close();
    }
}
