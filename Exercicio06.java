package tarefa05;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número : ");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo número : ");
		int valor2 = sc.nextInt();

		int maior;
		if (valor1 > valor2) {
			System.out.println("Entre os dois numeros digitados o maior valor é : " + valor1);
		} else {
			System.out.println("Entre os dois numeros digitados o maior valor é : " + valor2);
		}

	}

}
