package controllers;

import models.Persona;

public class MetodoOrdenamientoBurbuja {

    public static void ordenarPorNombre(Persona[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].getNombre().compareTo(arr[j + 1].getNombre()) > 0) {
                    Persona temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenarPorEdad(Persona[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].getEdad() > arr[j + 1].getEdad()) {
                    Persona temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}