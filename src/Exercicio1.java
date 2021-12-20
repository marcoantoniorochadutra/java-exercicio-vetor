//
//1 (3 pontos) – Escreva um algoritmo, que leia um conjunto de N alunos (nome, altura (em
//cm) e sexo) e armazene em vetores. APÓS a leitura dos N Alunos (não é necessário utilizar
//menu), imprima:
//- O nome do aluno com maior altura;
//- O nome de todas as mulheres com altura acima da média da altura das mulheres;
//- O nome de todas as pessoas com altura abaixo da média.

package Exercicio01;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {

		String[] nomes = new String[1000];
		String nomAlt = "";
		Integer[] alturas = new Integer[1000];
		char[] sexos = new char[1000];
		char continua = 'S';
		int maiorAlt = 0, qtc = 1, somaF = 0, contF = 1, mediaF = 0, somaM = 0, mediaG = 0;
		String listaM = "";
		String listaG = "";

		while (continua == 'S') {

			nomes[qtc] = JOptionPane.showInputDialog("Qual o nome do aluno?");
			alturas[qtc] = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura."));
			sexos[qtc] = JOptionPane.showInputDialog("Qual o sexo do aluno?" + "\n Informe Masculino ou Feminino")
					.toUpperCase().charAt(0);

			if (alturas[qtc] > maiorAlt) {
				maiorAlt = alturas[qtc];
				nomAlt = nomes[qtc];
			}

			if (sexos[qtc] == 'F') {
				somaF = somaF + alturas[qtc];
				contF = contF + 1;

			}

			mediaF = somaF / contF;
			if (alturas[qtc] >= mediaF && sexos[qtc] == 'F') {
				listaM = nomes[qtc] + alturas[qtc] + "\n";

			} else if (listaM == "") {
				listaM = "Nenhuma";
			}

			somaM = somaM + alturas[qtc];
			mediaG = somaM / qtc;
			if (alturas[qtc] < mediaG) {
				listaG = nomes[qtc] + alturas[qtc] + "\n";

			}

			qtc++;
			continua = JOptionPane.showInputDialog("Adicionar mais um aluno?").toUpperCase().charAt(0);
			if (listaM == "") {
				listaM = "Nenhuma";
			}

		}

		JOptionPane.showMessageDialog(null,
				"O aluno com maior altura é: " + nomAlt + " sua altura é: " + maiorAlt + "\n"
						+ "Lista de mulheres com altura superior a média feminina: " + "\n" + listaM + "\n"
						+ "Lista de pessoas com a altura menor que media geral: " + "\n" + listaG);

	}
}
