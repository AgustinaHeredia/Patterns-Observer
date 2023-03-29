package PatronObserver;

import java.util.ArrayList;
import java.util.List;

public class AgenteBolsa implements Observable {
    private double valorActual;
    private List<Observador> observadores;

    public AgenteBolsa(double valorActual) {
        this.valorActual = valorActual;
        this.observadores = new ArrayList<>();
    }

    
    public List<Observador> getObservadores() {
		return observadores;
	}


	public void setObservadores(List<Observador> observadores) {
		this.observadores = observadores;
	}


	public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
        notificarObservadores();
    }

    @Override
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        observadores.forEach(observador -> observador.actualizar(valorActual));
    }

}
