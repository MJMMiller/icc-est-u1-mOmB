package controllers;

import models.Persona;

public class MetodoBusquedaBinaria {

    public static int buscarPorNombre(Persona[] arr, String nombre) {
        int izquierda = 0;
        int derecha = arr.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            int comparacion = arr[medio].getNombre().compareTo(nombre);

            if (comparacion == 0) {
                return medio;
            } else if (comparacion < 0) {
                izquierda = medio + 1; 
            } else {
                derecha = medio - 1;
            }
        }

        return -1; 
    }

    public static int buscarPorEdad(Persona[] arr, int edad) {
        int izquierda = 0;
        int derecha = arr.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;

            if (arr[medio].getEdad() == edad) {
                return medio;
            } else if (arr[medio].getEdad() < edad) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1;
    }
}