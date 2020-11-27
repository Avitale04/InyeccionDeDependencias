package alepruebas.persona.beans;

public class Persona {

    private int id;
    private String nombre;
    private String apellido;
    private String oficio;

    public Persona(int id,String nombre, String apellido, String oficio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.oficio = oficio;
    }

    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public String getApellido() { return apellido;}
    public String getOficio() {return oficio;}
}
