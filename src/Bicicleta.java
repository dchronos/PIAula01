
public class Bicicleta extends Veiculo {
	
	private int aro;
	
	
	public Bicicleta() {
		this.setQuantidadeDeRodas(2);
	}
	public Bicicleta(String marca){
		this.setMarca(marca);
	}
	
	
	public int getAro() {
		return aro;
	}
	public void setAro(int aro) {
		this.aro = aro;
	}

	
	
	
}
