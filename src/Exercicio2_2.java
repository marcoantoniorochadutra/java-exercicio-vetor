package Exercicio01;

import java.util.Arrays;
import javax.swing.JOptionPane;

//2 (3 pontos) – Faça um programa em que o usuário informe 3 números inteiros. Considere
//que o usuário irá informar três números diferentes. Após o cadastro faça a ordenação em
//ordem crescente desses números, de modo que o vetor original fique ordenado. Mostre o
//vetor ordenado na tela.

public class Exercicio2_2 {
	public static void main(String[] args) {

		int numeros[] = new int[3];
		int n1 = 0, n2 = 0, n3 = 0;
		System.out.println("Pedir certo");

		for (int i = 0; i < 3 ; i++) {
		numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe os numeros"));

		}

		if (numeros[1] < numeros[2] && numeros[1] < numeros[3]) {
			n1 = numeros[1];
			System.out.println("n1 certo");

		}

		if (numeros[2] > numeros[1] && numeros[2] < numeros[3]) {
			n2 = numeros[1];
			System.out.println("n2 certo");

		}

		if (numeros[3] > numeros[2] && numeros[1] > numeros[3]) {
			n3 = numeros[1];
			System.out.println("n3 certo");

		}

		JOptionPane.showMessageDialog(null, n1 + n2 + n3);
	}

}
