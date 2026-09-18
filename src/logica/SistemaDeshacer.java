package logica;

import modelo.Accion;
import java.util.Stack;

public class SistemaDeshacer {
    private Stack<Accion> pilaAcciones = new Stack<>();

    public void registrarAccion(Accion a) {
        pilaAcciones.push(a); // push = pone el plato ENCIMA de la torre
        System.out.println("Accion registrada: " + a);
    }

  public String deshacer() {
    if (pilaAcciones.isEmpty()) {
        return "No hay acciones para deshacer.";
    }
    Accion ultima = pilaAcciones.pop();
    return "Se deshizo la última acción: " + ultima;
}

    public void mostrarUltimaEliminada(Accion ultimaEliminada) {
        if (ultimaEliminada != null) {
            System.out.println("Última accion eliminada: " + ultimaEliminada);
        }
    }
}