package academy.dojo.maratona_java.introducao;

public class Aula06EstruturaDeRepeticao04 {
	public static void main(String[] args) {
		//Dado o valor de um carro, descubra em quantas ele pode ser parcelado
		// Condição valorParcela >=1000
		
		double valorTotal = 4000;
		for(int parcela = 1; parcela<=valorTotal ; parcela++) {
			double valorParcela = valorTotal / parcela;
			if(valorParcela < 1000) {
				break;
			}
			else {
				System.out.println("Parcela " + parcela + " R$" + valorParcela);
			}
		}
	}
}
