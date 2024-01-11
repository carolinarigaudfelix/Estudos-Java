package academy.dojo.maratona_java.introducao;

public class Aula05EstruturasCondicionais04 {
	public static void main(String[] args) {
		//imprima o dia da semana, considerando 1 como domingo
		
		int dia = 12;
		switch(dia) {
		
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;	
		case 7:
			System.out.println("Sabado");
			break;
		
		default:
			System.out.println("Dia invalido");
			break;
		}
		
		
		char sexo = 'F';
		
		switch(sexo) {
			case 'F':
				System.out.println("Sexo feminino");
				break;
			case 'M':
				System.out.println("Sexo Masculino");
				break;
			default:
				System.out.println("Sexo Inválido");
				break;
		}
	}
}
