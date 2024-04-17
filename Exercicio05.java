package tarefa05;

import java.time.Year;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu ano de nascimento : ");
		int ano = sc.nextInt();
		int idade = (2024 - ano);
		if (idade >= 18) {
			System.out.println("Você obrigatóriamente irá votar este ano");
		} else {
			System.out.println("você não tem obrigatoriedade de votação neste ano");
		}

	}

}
