
public class Caminhao extends Veiculo {
	private Boolean temCarreta;
	
	
	public Caminhao() {
		// TODO Auto-generated constructor stub
		this.temCarreta = false;
		this.setQuantidadeDeRodas(4);
	}
	
	public Caminhao(Boolean temCarreta) {
		this.temCarreta = temCarreta;
	}

	public Boolean getTemCarreta() {
		return temCarreta;
	}

	public void setTemCarreta(Boolean temCarreta) {
		this.temCarreta = temCarreta;
	}
	
	

}
