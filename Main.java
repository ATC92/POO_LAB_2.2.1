import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // CREACION DE VARIABLES Y OBJETOS
        Persona persona = new Persona();
        Random random = new Random();
        // INFORMACION DE LA PERSONA
        persona.setNombre("Alan");
        persona.setApellido("Torres");
        persona.setEdad(25);
        persona.setEstatura(179);
        persona.setFechaNacimiento("18/Febrero/1999");
        // AHORA UTILIZAMOS LO METODOS
        System.out.println("Cuantas horas de ejercicio hizo " + persona.getNombre() + " hoy: " + persona.hacerEjercicio((true)) + "horas");
        System.out.println(persona.getNombre()+  " " + persona.getApellido() + ", tiene " + persona.getEdad() + " años y duerme: " + Persona.dormir(true)+ " horas al dia.");
        System.out.println(persona.getNombre() + " comio hoy: " + persona.comer(random));
    }
}