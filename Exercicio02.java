package tarefa05;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número (Negativo ou Positivo) : ");
		int numero = sc.nextInt();

		if (numero >= 0) {
			System.out.println("O número digitado é POSITIVO!");
		} else {
			System.out.println("O número digitado é Negativo!");
		}
	}

}
