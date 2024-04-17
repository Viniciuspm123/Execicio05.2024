package tarefa05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PROMOÇÃO DE MAÇAS!!! APENAS R$1,30 A UNIDADE!!!");
		System.out.println("Na compra de 12 ou mais maças, saem por R$1,00 cada!!!");
		System.out.println();
		System.out.println("Quantas maças você deseja comprar?");
		float macas = sc.nextFloat();
		if (macas >= 12) {
			System.out.println("O valor a ser pago é de R$" + macas * 1);
		} else {
			System.out.println("O valor a ser pago é de R$" + macas * 1.30);
		}
	}
}