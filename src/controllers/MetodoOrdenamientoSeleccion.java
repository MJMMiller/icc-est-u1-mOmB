package controllers;

import models.Persona;

public class MetodoOrdenamientoSeleccion {

    public static void ordenarPorNombre(Persona[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getNombre().compareTo(arr[indiceMinimo].getNombre()) < 0) {
                    indiceMinimo = j;
                }
            }
            Persona temp = arr[indiceMinimo];
            arr[indiceMinimo] = arr[i];
            arr[i] = temp;
        }
    }

    public static void ordenarPorEdad(Persona[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].getEdad() < arr[indiceMinimo].getEdad()) {
                    indiceMinimo = j;
                }
            }
            Persona temp = arr[indiceMinimo];
            arr[indiceMinimo] = arr[i];
            arr[i] = temp;
        }
    }
}