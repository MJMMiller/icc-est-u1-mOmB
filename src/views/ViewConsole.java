package views;

import models.Persona;

public class ViewConsole {

    public void printPersonaArray(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}