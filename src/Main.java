
public class Main {

	public static void main(String[] args) {
		int ano = 2014;
		System.out.println("Olá Mundo " + ano);
		
		Bicicleta bicicletaDoLuiz = new Bicicleta();
		Caminhao caminhaoDoPaiDoLuiz = new Caminhao();
		Caminhao caminhao2 = new Caminhao();
		
		System.out.println("Bicicleta " + bicicletaDoLuiz.getQuantidadeDeRodas());
		System.out.println("Caminhao " + caminhao2.getQuantidadeDeRodas());
	}

}
