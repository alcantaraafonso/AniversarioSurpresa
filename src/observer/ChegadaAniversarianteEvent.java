package observer;

import java.util.Date;

public class ChegadaAniversarianteEvent {

	private final Date horaChegada;

	public ChegadaAniversarianteEvent(Date horaChegada) {
		super();
		this.horaChegada = horaChegada;
	}

	public Date getHoraChegada() {
		return horaChegada;
	}
	
		
}
