import java.util.Random;

public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String FechaNacimiento;
    private int Estatura;

    // Constructor sin argumentos
    public Persona() {
        this.Nombre = "";
        this.Apellido = "";
        this.Edad = 0;
        this.FechaNacimiento = "";
        this.Estatura = 0;
    }
    // Setters
    public void setNombre(String nombre) {this.Nombre = nombre;}
    public void setApellido(String apellido) {this.Apellido = apellido;}
    public void setEdad(int edad) {this.Edad = edad;}
    public void setFechaNacimiento(String fechaNacimiento) {this.FechaNacimiento = fechaNacimiento;}
    public void setEstatura(int estatura) {this.Estatura = estatura;}

    // Getters
    public String getNombre() {return Nombre;}
    public String getApellido() {return Apellido;}
    public int getEdad() {return Edad;}
    public String getFechaNacimiento() {return FechaNacimiento;}
    public int getEstatura() {return Estatura;}

    // METODOS DE LA CLASE/OBJETO
    public static boolean comer(Random random){
        return random.nextBoolean();
    }
    public int dormir(boolean N){
        if (N == true)
            return (int)(Math.random() * 8) + 1;
        else
            return 0;
    }

    public int hacerEjercicio(boolean N){
        if(N==true)
            return (int)(Math.random() * 4) + 1;
        else
            return 0;
    }
}
