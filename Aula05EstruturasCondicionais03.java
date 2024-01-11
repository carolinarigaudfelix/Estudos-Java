package academy.dojo.maratona_java.introducao;

public class Aula05EstruturasCondicionais03 {
	public static void main(String[] args) {
		double salario = 70000;
		
		
		if(salario >=0 && salario <= 34712) 
			System.out.println("O salario com imposto é :" + salario*(9.7/100));
		else {

			if(salario >34712 && salario <= 68507) {
				System.out.println("O salario com imposto é :" + salario*(37.35/100));
			}
			else {

				if(salario >68507) {
					System.out.println("O salario com imposto é :" + salario*(49.50/100));
				}
			}
			
		}
		
	}
}
