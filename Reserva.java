package hotel_m1;

public class Reserva {
	private String dataEntrada;
	private String dataSaida;
	private Hospede[] hospedes;
	private Quarto quarto;
	private Veiculo veiculo;
	
	
	public Reserva(String dataEntrada, String dataSaida, Hospede[] hospedes, Quarto quarto,Veiculo veiculo) {
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.hospedes = hospedes;
		this.quarto = quarto;
		this.veiculo = veiculo;
}

	public void checkin() {
		System.out.println("Check-in efetuado para " + hospedes.length + " hóspedes." );
	}
	
	public void checkout() {
		System.out.println ("Check-out efetuado.");
		
	}
	public void cancelar() {
		System.out.println("Reserva cancelada.");
		
	}
	
	
	public String getDataEntrada() {
		return dataEntrada;
	}	
	
	public String getDataSaida() {
		return dataSaida;
	}
	public Hospede[] getHospedes() {
		return hospedes;
	}
	public Quarto getQuarto() {
		return quarto;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
}