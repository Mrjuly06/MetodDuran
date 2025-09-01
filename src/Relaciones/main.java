package Relaciones;

import models.persona;

public class main {
    public static void main(String[] args) {
        persona persona = new persona();

        persona.firsName="Alice";
        persona.setlastName("Bob");
        persona.setCity("Berlin");
        System.out.println(persona.firsName);
    }
}
