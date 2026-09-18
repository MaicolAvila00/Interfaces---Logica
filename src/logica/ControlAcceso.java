package logica;

import modelo.Participante;
import java.util.HashSet;

public class ControlAcceso {
    private HashSet<Participante> participantes = new HashSet<>();

    public String registrarParticipante(Participante p) {
        boolean agregado = participantes.add(p); // false si ya existía (mismo documento)
        if (agregado) {
            return "Participante registrado: " + p;
        } else {
            return "Duplicado detectado, NO se registró: " + p;
        }
    }

    public HashSet<Participante> getParticipantes() {
        return participantes;
    }
}