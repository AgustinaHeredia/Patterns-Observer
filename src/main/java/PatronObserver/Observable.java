package PatronObserver;

public interface Observable {
	
	void agregarObservador(Observador observador);
    void eliminarObservador(Observador observador);
    void notificarObservadores();

}
