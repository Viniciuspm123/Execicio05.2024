package tarefa05;

import java.util.Scanner;

public class Exercicio04 {

	static void meuMetodo(double semestre1, double semestre2) {
		double media = (semestre1 + semestre2) / 2;
		System.out.println("A média do semestre é: " + media);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota : ");
		double semestre1 = sc.nextDouble();
		System.out.println("Digite a segunda nota : ");
		double semestre2 = sc.nextDouble();
		double media = semestre1 + semestre2;

		if (media <= 20) {
			meuMetodo(semestre1, semestre2);
		} else {
			System.out.println("A nota é mensurada entre 1 a 10!");
		}
	}
}