package proyecto1.logica;

import java.io.Serializable;

public class Registro implements Serializable {

    private String nomnbre;
    private String codigo;
    private String apellido;
    private String sala;
    private String carrera;
    private String fecha;
    
    public Registro() {
    }

  

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNomnbre() {
        return nomnbre;
    }
    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }
   

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSala() {
        return sala;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getApellido() {
        return apellido;
    }

    public Registro(String nomnbre, String codigo, String apellido, String sala, String carrera, String fecha) {
        this.nomnbre = nomnbre;
        this.codigo = codigo;
        this.apellido = apellido;
        this.sala = sala;
        this.carrera = carrera;
        this.fecha = fecha;
       
    }
      public Registro(String nomnbre, String codigo, String apellido, String sala, String carrera) {
        this.nomnbre = nomnbre;
        this.codigo = codigo;
        this.apellido = apellido;
        this.sala = sala;
        this.carrera = carrera;
        this.fecha = fecha;
       
    }
    
    
    
}
