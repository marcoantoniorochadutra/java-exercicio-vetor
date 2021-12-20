package Exercicio01;

import javax.swing.JOptionPane;

//3 (4 pontos) � Fa�a um programa em que o usu�rio fa�a o cadastro de N marcas, placas e
//ano de fabrica��o de carros. Possibilite o cadastro de no m�ximo 50 carros. Utilize um
//menu com as seguintes op��es:
//1 � Cadastrar Carro (o usu�rio informa a marca e a placa do carro) V
//2 � Listar os carros do ano (o programa mostra todas as informa��es de todos os carros
//fabricados no ano de 2021). V
//3 � Buscar carros por marca (o programa mostra todos os dados de todos os carros que
//possuem a marca pesquisada).
//OBS: Nas op��es 2 e 3, caso n�o tenha nenhum registro que atenda aos filtros, deve ser
//dado uma mensagem ao usu�rio de que n�o existe nenhum cadastro que atenda � busca.

public class Exercicio3 {
	public static void main(String[] args) {
		String[] donos = new String[50];
		String[] marcas = new String[50];
		String[] placas = new String[50];
		String[] modelos = new String[50];

		int qtc = 0;

		String menu = "1 - Cadastrar ve�culo." + "\n" + "2 - Listar ve�culos do ano." + "\n" + "3 - Buscar por marca"
				+ "\n" + "4 - Buscar por placa. \n" + "5 - Sair";
		int op = 0;

		do {
			String lista = "";
			String listaA = "";
			String listaM = "";
			String listaP = "";

			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			if (op == 1) {

				donos[qtc] = JOptionPane.showInputDialog("Informe o dono do ve�culo.");
				marcas[qtc] = JOptionPane.showInputDialog("Informe a marca do ve�culo.");
				modelos[qtc] = JOptionPane.showInputDialog("Informe o modelo do ve�culo e ano de fabrica��o");
				placas[qtc] = JOptionPane.showInputDialog("Informe a placa do ve�culo.");

				lista = lista + donos[qtc] + " | " + marcas[qtc] + " - " + modelos[qtc] + " | " + placas[qtc] + "\n";

				qtc++;
			}

			if (op == 2) {
				for (int i = 0; i < qtc; i++) {
					if (modelos[i].contains("2021")) {
						listaA = listaA + donos[i] + " | " + marcas[i] + " - " + modelos[i] + " | " + placas[i] + "\n";
					}

				}
				JOptionPane.showMessageDialog(null, listaA);

			}

			if (op == 3) {

				String busca = JOptionPane.showInputDialog("Qual marca voc� deseja buscar?");
				boolean achou = false;
				for (int i = 0; i < qtc; i++) {
					if (marcas[i].equals(busca)) {
						listaM = listaM + donos[i] + " | " + marcas[i] + " - " + modelos[i] + " | " + placas[i] + "\n";
						achou = true;
					}
				}

				if (achou == true) {
					JOptionPane.showMessageDialog(null, "Os ve�culos encontrados est�o logo abaixo: " + "\n " + listaM);

				} else {
					JOptionPane.showMessageDialog(null, "N�o foi encontrado nenhum ve�culo com esta marca.");

				}

			}

			if (op == 4) {
				String busca = JOptionPane.showInputDialog("Qual placa voc� deseja encontrar?");
				boolean achou = false;
				for (int i = 0; i < qtc; i++) {
					if (placas[i].equals(busca)) {
						listaP = listaP + donos[i] + " | " + marcas[i] + " - " + modelos[i] + " | " + placas[i] + "\n";
						achou = true;
					}

				}

				if (achou == true) {
					JOptionPane.showMessageDialog(null,
							"O ve�culo cadastrado com esta placa est� abaixo: " + "\n " + listaP);

				} else {
					JOptionPane.showMessageDialog(null, "N�o foi encontrado nenhum ve�culo com esta placa.");

				}

			}

		} while (op != 5);

	}

}
