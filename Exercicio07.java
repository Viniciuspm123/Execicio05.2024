package tarefa05;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um primeiro numero: ");
		int numero1 = sc.nextInt();
		System.out.println("Digite um segundo numero: ");
		int numero2 = sc.nextInt();
		if (numero1 > numero2) {
			System.out.println("Segue os numeros digitados em ordem crescente: "+numero2+", "+numero1);
		} else {
			System.out.println("Segue os numeros digitados em ordem crescente: "+numero1+", "+numero2);
		}
	}

}
