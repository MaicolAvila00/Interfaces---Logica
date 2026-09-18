package modelo;

public class Estudiante {
    private String nombre;
    private String codigo;
    private String fechaInscripcion;

    public Estudiante(String nombre, String codigo, String fechaInscripcion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getNombre() { return nombre; }
    public String getCodigo() { return codigo; }
    public String getFechaInscripcion() { return fechaInscripcion; }

    @Override
    public String toString() {
        return "Estudiante [Codigo: " + codigo + " | Nombre: " + nombre
                + " | Inscrito: " + fechaInscripcion + "]";
    }
}