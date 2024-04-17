package tarefa05;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor total das vendas realizas no mês : ");
		float vendas = sc.nextFloat();
		float porcentagem1 = (1500 / 100) * 3;
		float porcentagem2 = (vendas - 1500)  / 100 * 5;
		if (vendas <= 1500) {
			vendas = vendas + porcentagem1;
			System.out.println("o salário bruto deste mês é de : " + vendas);
		} else {
			vendas = vendas + porcentagem1 + porcentagem2;
			System.out.println("o salário bruto deste mês é de : " + vendas);
		}
		sc.close();
	}

}
