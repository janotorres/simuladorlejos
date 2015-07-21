

import lejos.nxt.*;

public class Main {
	
	public static final int LUMINOSIDADE = 40; //> Condicional do mÈtodo de Polling, fronteira entre o claro e a escurid„o.
	public static final int INTERVALO = 100;    //> Intervalo de espera, em milisegundos.
	public static final int VELOCIDADE = 75;  //> PontÍncia dos motores, aqui setado ao m·ximo. 
	
	
	public static void main (String[] args) throws Exception {
			Motor.C.rotate(-270);
	}
	
}