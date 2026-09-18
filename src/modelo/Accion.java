package modelo;

public class Accion {
    private String tipo;         // Escribir, Borrar, Copiar, Pegar
    private String descripcion;

    public Accion(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() { return tipo; }
    public String getDescripcion() { return descripcion; }

    @Override
    public String toString() {
        return "[" + tipo + "] " + descripcion;
    }
}