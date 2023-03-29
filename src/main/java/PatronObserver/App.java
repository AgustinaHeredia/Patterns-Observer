package PatronObserver;

import java.util.Scanner;

public class App {
	
	static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {
        
    	AgenteBolsa agente = new AgenteBolsa(100);
        

    	int opcion= menu();;
        while (opcion != 4) {
            

            switch (opcion) {
                case 1:
                    String nombreAgencia = pedirString("Ingrese el nombre de la agencia:");
                    AgenciaBolsa agencia = new AgenciaBolsa(nombreAgencia);
                    agente.agregarObservador(agencia);
                    System.out.println("Agencia " + nombreAgencia + " agregada.");
                    break;
                case 2:
                    String nombreAgenciaEliminar = pedirString("Ingrese el nombre de la agencia a eliminar:");
                    AgenciaBolsa agenciaEliminar = null;
                    for (Observador observador : agente.getObservadores()) {
                        AgenciaBolsa agenciaActual = (AgenciaBolsa) observador;
                        if (agenciaActual.getNombre().equals(nombreAgenciaEliminar)) {
                            agenciaEliminar = agenciaActual;
                            break;
                        }
                    }
                    if (agenciaEliminar != null) {
                        agente.eliminarObservador(agenciaEliminar);
                        System.out.println("Agencia " + nombreAgenciaEliminar + " eliminada.");
                    } else {
                        System.out.println("Agencia " + nombreAgenciaEliminar + " no encontrada.");
                    }
                    break;
                case 3:
                    double nuevoValor = pedirDouble("Ingrese el nuevo valor de la bolsa:");
                    agente.setValorActual(nuevoValor);
                    System.out.println("Valor de la bolsa actualizado a " + nuevoValor + ".");
                    break;   
                default:
                    System.out.println("Opción no válida.");
            }
            opcion = menu();
        }
        System.out.println("Saliendo de la aplicación...");
    }
    
    static int menu() {
	      
        System.out.println("1. Agregar agencia");
        System.out.println("2. Eliminar agencia");
        System.out.println("3. Informar cambio en la bolsa");
        System.out.println("4. Salir");
        int opcion = pedirInt("Introduce la opción deseada");
        return opcion;
    }
    static int pedirInt(String texto) {
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;
	}
	static String pedirString(String texto) {
		System.out.println(texto);
		String nom = input.next();
		return nom;
	}
	static double pedirDouble(String texto) {
		System.out.println(texto);
		double v1 = input.nextDouble();
		return v1;
	}
}
