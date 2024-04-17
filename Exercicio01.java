package tarefa05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero : ");
		int numero = sc.nextInt();

		if (numero > 10) {
			System.out.println("É Maior que 10!!!");
		} else {
			System.out.println("Não é Maior que 10!!!");
		}

	}

}
