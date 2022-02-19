package Questoes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		/*
		 * Questão 01
		 * 
		 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o
		 * caractere * e espaços. A base e altura da escada devem ser iguais ao valor de
		 * n. A última linha não deve conter nenhum espaço.
		 */
		// Aqui recebe o tamanho da escada
		String valorString = JOptionPane.showInputDialog(null, "Informe o número de degraus da escada");
		/*
		 * Como o JOptionPane input recebe uma String, aqui convertemos para inteiro
		 * para poder trabalhar com o tamnho em número
		 */
		int tamanhoEscada = Integer.parseInt(valorString);
		/*
		 * Declaro um array list pois dependendo do do tamnho da escada ele se adpata ao
		 * tamanho, pois um array de tamnho fixo seria impossível de trabalhar
		 */
		List<String> escada = new ArrayList<>();

		for (int i = 0; i < tamanhoEscada; i++) {
			escada.add(" ".repeat(tamanhoEscada - i) + "*".repeat(i + 1));

		}

		for (String d : escada) {
			System.out.println(d);
		}

	}

}
