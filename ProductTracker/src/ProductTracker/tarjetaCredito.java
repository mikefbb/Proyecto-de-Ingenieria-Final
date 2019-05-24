package ProductTracker;

import java.util.Date;

public class tarjetaCredito {
	int numeroTarjetaCredito;
	int civ;
	Date fechaCaducidad;
	
	//Constructor
	public tarjetaCredito(int numeroTarjetaCredito, int civ, Date fechaCaducidad) {
		super();
		this.numeroTarjetaCredito = numeroTarjetaCredito;
		this.civ = civ;
		this.fechaCaducidad = fechaCaducidad;
	}
}
