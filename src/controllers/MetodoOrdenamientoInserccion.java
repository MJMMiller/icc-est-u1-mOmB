package controllers;

import models.Persona;

public class MetodoOrdenamientoInserccion {

    public static void ordenarPorNombre(Persona[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Persona key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getNombre().compareTo(key.getNombre()) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void ordenarPorEdad(Persona[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Persona key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getEdad() > key.getEdad()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}