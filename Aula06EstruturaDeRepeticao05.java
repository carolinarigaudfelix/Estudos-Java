package academy.dojo.maratona_java.introducao;

public class Aula06EstruturaDeRepeticao05 {
	//Dado o valor de um carro, descubra em quantas ele pode ser parcelado
	//Condição valorParcela >= 1000
	
	public static void main(String[] args) {
		double valorTotal = 3000;
		for(int parcela = (int) valorTotal; parcela >=1; parcela --) {
			double valorParcela = valorTotal / parcela;
			if(valorParcela < 1000) {
				continue;
			}
			System.out.println("Parcela" + parcela + " R$ " + valorParcela);
		}
	}
}
