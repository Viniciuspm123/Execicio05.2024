package tarefa05;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Digite a hora de início do jogo (hora inteira):");
		        int inicio = sc.nextInt();

		        System.out.println("Digite a hora de fim do jogo (hora inteira):");
		        int fim = sc.nextInt();

		        int duracao;
		        if (inicio <= fim) {
		            duracao = fim - inicio;
		        } else {
		            duracao = 24 - (inicio + fim);
		        }
		        
		        System.out.println("A duração do jogo foi de " + duracao + " horas.");

		    }
		}