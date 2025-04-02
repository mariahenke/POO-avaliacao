package hotel_m1;

public class Main {
	public static void main(String[] args) {
		Hospede h1 = new Hospede("Joana", "Rua Uruguai", "147258369");
		Hospede h2 = new Hospede("Jonas", "Rua Janeiro", "963852741");
	
	Hospede[] hospedes = {h1, h2};
	
	Quarto quarto = new Quarto(222, 1);
	Veiculo veiculo = new Veiculo("POO123", "SUV");
	
	Reserva reserva = new Reserva("01/07/2025","05/07/2025", hospedes, quarto, veiculo);
	
	reserva.checkin();
	
	System.out.println("Hóspedes na reserva: ");
	for (Hospede h : reserva.getHospedes()) {
		System.out.println(h.getNome());
	}
	
	
	}
	
	}
	

	


	
	
 