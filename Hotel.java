package hotel_m1;

public class Hotel {
	String nome;
	private Quarto[] quartos;
	
	public Hotel(String nome, Quarto[] quartos) {
		this.nome=nome;
		this.quartos=quartos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Quarto[] getquartos() {
		return quartos;
	}
}
