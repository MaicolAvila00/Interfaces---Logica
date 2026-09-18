package modelo;

import java.util.Objects;

public class Participante {
    private String nombre;
    private String documento; // usamos el documento para identificar si es duplicado

    public Participante(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() { return nombre; }
    public String getDocumento() { return documento; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Participante)) return false;
        Participante otro = (Participante) obj;
        return documento.equals(otro.documento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documento);
    }

    @Override
    public String toString() {
        return "Participante [Doc: " + documento + " | Nombre: " + nombre + "]";
    }
}