package Exercicio01;

import java.util.Arrays;
import javax.swing.JOptionPane;

//2 (3 pontos) – Faça um programa em que o usuário informe 3 números inteiros. Considere
//que o usuário irá informar três números diferentes. Após o cadastro faça a ordenação em
//ordem crescente desses números, de modo que o vetor original fique ordenado. Mostre o
//vetor ordenado na tela.

public class Exercicio2_1 {
	public static void main(String[] args) {

		int numeros[] = new int[3];



		for (int i = 0; i < 3; i++) {

			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe os numeros"));
			Arrays.sort(numeros);
		

		}

		JOptionPane.showMessageDialog(null, Arrays.toString(numeros));
	}

}
