package Questoes;

import java.util.*;
import javax.swing.JOptionPane;

public class Questao03 {
	/*
	 * Questão 03 Duas palavras podem ser consideradas anagramas de si mesmas se as
	 * letras de uma palavra podem ser realocadas para formar a outra palavra. Dada
	 * uma string qualquer, desenvolva um algoritmo que encontre o número de pares
	 * de substrings que são anagramas.
	 */
	private static int N = 26;

	/* Aqui faço um método que verifica se é um anagrama */
	private static boolean isAnagram(String a, String b) {
		int[] countA = new int[N];
		int[] countB = new int[N];

		for (char c : a.toCharArray()) {
			countA[c - 'a']++;
		}

		for (char c : b.toCharArray()) {
			countB[c - 'a']++;
		}

		for (int i = 0; i < N; i++) {
			if (countA[i] != countB[i]) {
				return false;
			}
		}

		return true;
	}

	/* aqui eu conto os pares de anagramas */
	private static int getPairsCount(String text) {
		int count = 0;
		int length = text.length();

		List<String> subsets = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			for (int j = 1; j <= length - i; j++) {
				subsets.add(text.substring(i, i + j));
			}
		}

		for (int i = 0; i < subsets.size(); i++) {
			for (int j = i + 1; j < subsets.size(); j++) {
				String s1 = subsets.get(i);
				String s2 = subsets.get(j);
				if (i != j && s1.length() == s2.length() && isAnagram(s1, s2)) {
					count++;
				}
			}
		}
		return count;
	}

	/*
	 * em fim a execução no método main, aonde eu recebo a palavra, aplico o método
	 * e tenho o resultado
	 */
	public static void main(String[] args) {

		String N = JOptionPane.showInputDialog(null, "Informe a palavra");
		for (int i = 0; i < N.length(); i++) {
			System.out.println(getPairsCount(N));
		}
	}
}
