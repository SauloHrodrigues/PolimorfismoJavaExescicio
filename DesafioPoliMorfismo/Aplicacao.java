package DesafioPoliMorfismo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Produto> produtos = new ArrayList<>();
		System.out.print("Quantos produtos deseja :");
		int qtde = input.nextInt();

		for (int i = 0; i < qtde; i++) {
			int tipo = tipoProd(input);
			System.out.print("Nome do produto: ");
			String nome = input.next();
			System.out.print("Preço do produto: ");
			Double preco = input.nextDouble();
			if (tipo == 1) {
				produtos.add(new Produto(nome, preco));
			} else if (tipo == 2) {
				System.out.print("Data de fabricação: ");
				produtos.add(new ProdutoUsado(nome, preco, input.next()));
			} else {
				System.out.print("Entre com a taxa de importação: ");
				produtos.add(new ProdutoImportado(nome, preco, input.nextDouble()));
			}
		}
		
		//preço da etiqueta
		for(Produto p:produtos) {
			System.out.println(p.toString());
		}

		input.close();
	}

	public static int tipoProd(Scanner input) {
		int tipo = 0;

		System.out.println("Escolha o tipo do produto: ");
		System.out.print("1 - Comum.| 2 - Usado. | 3 - Importado. ");
		int p = input.nextInt();
		switch (p) {
		case 1:
			tipo = 1;
			break;

		case 2:
			tipo = 2;
			break;
		case 3:
			tipo = 3;
			break;
		default:
			System.out.println("tipo inválido");
			tipo = 0;
			break;
		}

		return tipo;
	}

}
