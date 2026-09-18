package logica;

import modelo.Cliente;
import java.util.PriorityQueue;
import java.util.Comparator;

public class AtencionBanco {

    // Regla de orden: primero los preferenciales (reversed invierte false/true),
    // y si hay empate en preferencia, gana el que tenga menor "orden" (llegó primero)
    private PriorityQueue<Cliente> colaClientes = new PriorityQueue<>(
            Comparator.comparing(Cliente::isPreferencial).reversed()
                      .thenComparing(Cliente::getOrden)
    );

    public String registrarCliente(Cliente c) {
        colaClientes.add(c);
        return "Cliente en fila: " + c;
    }

    public String atenderCliente() {
        Cliente atendido = colaClientes.poll();
        if (atendido != null) {
            return "Atendiendo a: " + atendido;
        } else {
            return "No hay clientes en espera.";
        }
    }

    public String obtenerPendientes() {
        if (colaClientes.isEmpty()) {
            return "La fila está vacía.";
        }
        StringBuilder sb = new StringBuilder();
        for (Cliente c : colaClientes) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }
}