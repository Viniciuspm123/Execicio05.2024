package tarefa05;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número da sua conta (Sem digito) : ");
		String conta = sc.next();
		System.out.println("Digite o valor do Saldo (Apenas os numeros) : ");
		float saldo = sc.nextFloat();
		System.out.println("Digite o valor total a ser debitado de sua conta (Apenas os numeros) : ");
		float debito = sc.nextFloat();
		System.out.println("Digite o valor de credito que possui em sua conta (Apenas os numeros) : ");
		float credito = sc.nextFloat();

		float saldoAtual = (saldo - debito) + credito;

		if (saldoAtual >= 0) {
			System.out.println("O saldo atual disponível em conta é de : R$" + saldoAtual);
			System.out.println("Saldo Positivo!! :D");
		} else {
			System.out.println("O saldo atual disponível em conta é de : R$" + saldoAtual);
			System.out.println("Saldo Negativo!! :(");
		}

		sc.close();
	}

}
