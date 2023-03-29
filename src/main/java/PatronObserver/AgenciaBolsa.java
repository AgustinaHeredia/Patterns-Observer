package PatronObserver;

public class AgenciaBolsa implements Observador {
    private String nombre;

    public AgenciaBolsa(String nombre) {
        this.nombre = nombre;
    }
    
    

    public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
    public void actualizar(double valor) {
        System.out.println("Agencia " + nombre + " recibió la notificación: el valor actual de la Bolsa es " + valor);
    }

	

}
