import controllers.*;
import models.Persona;
import views.*;

public class App {

    public static void main(String[] args) {

        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)
        };

        ViewConsole view = new ViewConsole();

        System.out.println("Personas originales:");
        view.printPersonaArray(personas);

        MetodoOrdenamientoBurbuja.ordenarPorNombre(personas);
        System.out.println("\nOrdenados por Nombre (Burbuja):");
        view.printPersonaArray(personas);

        // MetodoOrdenamientoBurbuja.ordenarPorEdad(personas);
        // System.out.println("\nOrdenados por Edad (Burbuja):");
        // view.printPersonaArray(personas);

        // MetodoOrdenamientoSeleccion.ordenarPorNombre(personas);
        // System.out.println("\nOrdenados por Nombre (Selección):");
        // view.printPersonaArray(personas);

        // MetodoOrdenamientoSeleccion.ordenarPorEdad(personas);
        // System.out.println("\nOrdenados por Edad (Selección):");
        // view.printPersonaArray(personas);

        // MetodoOrdenamientoInserccion.ordenarPorNombre(personas);
        // System.out.println("\nOrdenados por Nombre (Inserción):");
        // view.printPersonaArray(personas);

        // MetodoOrdenamientoInserccion.ordenarPorEdad(personas);
        // System.out.println("\nOrdenados por Edad (Inserción):");
        // view.printPersonaArray(personas);

        // MetodoOrdenamientoBurbujaMejorado.ordenarPorNombre(personas);
        // System.out.println("\nOrdenados por Nombre (Burbuja Mejorado):");
        // view.printPersonaArray(personas);

        // MetodoOrdenamientoBurbujaMejorado.ordenarPorEdad(personas);
        // System.out.println("\nOrdenados por Edad (Burbuja Mejorado):");
        // view.printPersonaArray(personas);

        String nombreABuscar = "Sofia";
        int index = MetodoBusquedaBinaria.buscarPorNombre(personas, nombreABuscar);
        if (index != -1) {
            System.out.println("\nEncontrado por nombre: " + personas[index]);
        } else {
            System.out.println("\nNo encontrado por nombre");
        }

        int edadABuscar = 30;
        index = MetodoBusquedaBinaria.buscarPorEdad(personas, edadABuscar);
        if (index != -1) {
            System.out.println("\nEncontrado por edad: " + personas[index]);
        } else {
            System.out.println("\nNo encontrado por edad");
        }
    }
}
