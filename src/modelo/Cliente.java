package modelo;

public class Cliente {
    private static int contador = 0; // cuenta cuántos clientes se han creado en total

    private String nombre;
    private boolean preferencial;
    private int orden; // en qué posición llegó (0, 1, 2, 3...)

    public Cliente(String nombre, boolean preferencial) {
        this.nombre = nombre;
        this.preferencial = preferencial;
        this.orden = contador++; // guarda el valor actual y luego suma 1 para el siguiente
    }

    public String getNombre() { return nombre; }
    public boolean isPreferencial() { return preferencial; }
    public int getOrden() { return orden; }

    @Override
    public String toString() {
        return nombre + (preferencial ? " (Preferencial)" : "");
    }
}