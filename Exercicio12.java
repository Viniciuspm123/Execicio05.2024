package tarefa05;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("QUADRO KAMBAM!!!");

		System.out.println("Digite a quantidade máxima permitida em estoque de coxinhas congeladas : ");
		int quantidadeMaxima = sc.nextInt();
		System.out.println("Agora digite a quantidade mínima : ");
		int quantidadeMinima = sc.nextInt();
		System.out.println("Digite a quantidade atual de coxinhas congeladas em estoque : ");
		int quantidade = sc.nextInt();

		int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

		if (quantidade >= quantidadeMedia) {
			System.out.println("VERDE!!!!");
			System.out.println("Não comprar mais coxinhas congeladas :D");
		} else if (quantidade >= quantidadeMinima) {
			System.out.println("Amarelo!!!");
			System.out.println("Atenção!! estoque está na metade");
		} else if (quantidade < quantidadeMinima) {
			System.out.println("VERMELHO!!!!");
			System.out.println("Comprar mais coxinhas congeladas!");
		} else {
			System.out.println("Não há valor correspondente.");
		}
		sc.close();
	}

}
