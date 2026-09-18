package logica;
import modelo.Estudiante;
import logica.GestionEstudiantes;
import java.util.ArrayList;
import modelo.Estudiante;
import java.util.ArrayList;

public class GestionEstudiantes {

    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e); // se agrega al final, respetando el orden de llegada
        System.out.println("Estudiante agregado: " + e.getNombre());
    }

    public void mostrarEstudiantes() {
        System.out.println("\n--- Lista de estudiantes inscritos ---");
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }

    public Estudiante buscarPorNombre(String nombre) {
        for (Estudiante e : estudiantes) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null; // no se encontró
    }

    public boolean eliminarEstudiante(String nombre) {
        Estudiante e = buscarPorNombre(nombre);
        if (e != null) {
            estudiantes.remove(e);
            System.out.println("Estudiante eliminado: " + nombre);
            return true;
        }
        System.out.println("No se encontró el estudiante: " + nombre);
        return false;
    }
public java.util.ArrayList<modelo.Estudiante> getEstudiantes() {
    return estudiantes;
 }
}
    