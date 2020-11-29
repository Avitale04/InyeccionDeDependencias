package alepruebas.persona.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

    @PostConstruct
    private void init(){System.out.println("Bean iniciado");}

    @PreDestroy
    private void destroy(){System.out.println("Bean destruido");}
}
