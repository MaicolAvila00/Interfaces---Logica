
package techsolutions;



import logica.*;
import modelo.*;
import java.util.Scanner;


public class TechSolutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GestionEstudiantes gestionEstudiantes = new GestionEstudiantes();
        SistemaDeshacer sistemaDeshacer = new SistemaDeshacer();
        AtencionBanco atencionBanco = new AtencionBanco();
        ControlAcceso controlAcceso = new ControlAcceso();

        int opcion;
        do {
            System.out.println("\n===== MENU TECHSOLUTIONS =====");
            System.out.println("1. Probar Punto 1 - Estudiantes (Lista)");
            System.out.println("2. Probar Punto 2 - Deshacer (Pila)");
            System.out.println("3. Probar Punto 3 - Banco (Cola)");
            System.out.println("4. Probar Punto 4 - Evento (Conjunto)");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    gestionEstudiantes.agregarEstudiante(new Estudiante("Ana", "E01", "2026-01-10"));
                    gestionEstudiantes.agregarEstudiante(new Estudiante("Luis", "E02", "2026-01-11"));
                    gestionEstudiantes.agregarEstudiante(new Estudiante("Alejandro", "E03", "2026-01-12"));
                    gestionEstudiantes.agregarEstudiante(new Estudiante("Sofia", "E04", "2026-01-12"));

                    gestionEstudiantes.mostrarEstudiantes();
                    gestionEstudiantes.eliminarEstudiante("Alejandro");
                    gestionEstudiantes.mostrarEstudiantes();
                    break;
                case 2:
                    sistemaDeshacer.registrarAccion(new Accion("Escribir", "Hola a todos"));
                    sistemaDeshacer.registrarAccion(new Accion("Escribir", "este es mi "));
                    sistemaDeshacer.registrarAccion(new Accion("Escribir", "nuevo blog"));
                    sistemaDeshacer.registrarAccion(new Accion("Copiar", "BIENVENIDOS"));
                    sistemaDeshacer.deshacer();
                    break;
                case 3:
                    atencionBanco.registrarCliente(new Cliente("Carlos", false));
                    atencionBanco.registrarCliente(new Cliente("Mario", false));
                    atencionBanco.registrarCliente(new Cliente("Gustavo", false));
                    atencionBanco.registrarCliente(new Cliente("Maria", true));
                    atencionBanco.atenderCliente();
                    break;
                case 4:
                    controlAcceso.registrarParticipante(new Participante("Pedro", "123"));
                    controlAcceso.registrarParticipante(new Participante("Martin", "1234"));
                    controlAcceso.registrarParticipante(new Participante("Diego", "12345"));       
                    controlAcceso.registrarParticipante(new Participante("Pedro", "123")); // duplicado
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
    
}