package Exercicio01;

import java.util.Arrays;
import javax.swing.JOptionPane;

//2 (3 pontos) � Fa�a um programa em que o usu�rio informe 3 n�meros inteiros. Considere
//que o usu�rio ir� informar tr�s n�meros diferentes. Ap�s o cadastro fa�a a ordena��o em
//ordem crescente desses n�meros, de modo que o vetor original fique ordenado. Mostre o
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
