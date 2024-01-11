package academy.dojo.maratona_java.introducao;

public class Aula05EstruturasCondicionais {
	public static void main(String[] args) {
		int idade = 19;
		boolean isAutorizadoComprarBebida = idade>=18;
		if(isAutorizadoComprarBebida) {
			System.out.println("Autorizado a comprar bebida alcólica.");
		}
		else{
			System.out.println("Não autorizado a comprar bebida alcólica.");
		}
		//Categoria para menores de 15, entre 15 e 18 e maiores de 18
		
		
		int idade_faixa = 19;

		
		if(idade_faixa <15) {
			System.out.println("Categoria Infatil");
		}
		else {
			if(idade_faixa >= 15 && idade_faixa <=18) {
				System.out.println("Categoria Juvenil");
			}
			else {
				System.out.println("Categoria Adulto");
			}
		}
		
		
	}
	 
}
