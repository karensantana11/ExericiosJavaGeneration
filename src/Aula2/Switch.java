package Aula2;

import java.util.Scanner;

public class Switch {

		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			int codigoProduto, quantidadeProduto;
			String nomeProduto;
			float precoProduto = 0, valorTotal;

			System.out.println("Digite o código do produto: ");
			codigoProduto = ler.nextInt();

			System.out.println("Digite a quantidade que deseja: ");
			quantidadeProduto = ler.nextInt();

			switch (codigoProduto) {

			case 1:
				nomeProduto = "Cachorro quente";
				precoProduto = 10;
				System.out.println("Produto: " + nomeProduto);
				System.out.println("Valor: " + precoProduto);
				break;

			case 2:
				nomeProduto = "X Salada";
				precoProduto = 15;
				break;

			case 3:
				nomeProduto = "X-Bacon";
				precoProduto = 18;
				break;

			case 4:
				nomeProduto = "Bauru";
				precoProduto = 12;
				break;

			case 5:
				nomeProduto = "Refrigerante";
				precoProduto = 8;
				break;

			case 6:
				nomeProduto = "Suco de laranja";
				precoProduto = 13;
				break;

			default:
				System.out.println("Opção invalida...");
				break;
			}
		}
	}