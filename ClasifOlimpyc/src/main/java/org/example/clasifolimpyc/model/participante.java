package org.example.clasifolimpyc.model;

public class participante {
    private String nombreCompleto;
    private Integer edad;
    private String correo;
    private String grupo;

    public participante() {}

    public participante(String nombreCompleto, Integer edad, String correo, String grupo) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.correo = correo;
        this.grupo = grupo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.correo = correo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
