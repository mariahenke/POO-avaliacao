package hotel_m1;

public class Quarto {
	private int numero;
	private int andar;
	
	public Quarto(int numero, int andar) {
		this.numero=numero;
	    this.andar=andar;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getAndar() {
		return andar;
	}
}
