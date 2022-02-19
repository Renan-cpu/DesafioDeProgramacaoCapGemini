package Questoes;

import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		/*
		 * Questão 02
		 * 
		 * Débora se inscreveu em uma rede social para se manter em contato com seus
		 * amigos. A página de cadastro exigia o preenchimento dos campos de nome e
		 * senha, porém a senha precisa ser forte. O site considera uma senha forte
		 * quando ela satisfaz os seguintes critérios: Possui no mínimo 6 caracteres.
		 * Contém no mínimo 1 digito. Contém no mínimo 1 letra em minúsculo. Contém no
		 * mínimo 1 letra em maiúsculo. Contém no mínimo 1 caractere especial. Os
		 * caracteres especiais são: !@#$%^&*()-+ Débora digitou uma string aleatória no
		 * campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar
		 * Débora, construa um algoritmo que informe qual é o número mínimo de
		 * caracteres que devem ser adicionados para uma string qualquer ser considerada
		 * segura.
		 */
		/* Aqui recebo o nome e a senha do usuário(a) */
		String nome = JOptionPane.showInputDialog(null, "Informe seu nome", "Seja bem-vindo(a) a nossa rede social",
				JOptionPane.PLAIN_MESSAGE);
		String senha = JOptionPane.showInputDialog(null, "Informe Sua senha", "Seja bem-vindo(a) " + nome,
				JOptionPane.PLAIN_MESSAGE);
		/*
		 * Como no final pede apenas para verificar qual o número mínimo de caracteres
		 * devem ser adcionados para que a senha seja segura, sabendo que o número é 6,
		 * eu simplesmente faço um if que se a quantidade de caracteres for menor que 6
		 * ele retorna o quanto falta para 6, se não está de acordo com o desejado
		 */
		if (senha.length() < 6) {
			JOptionPane.showMessageDialog(null,
					"falta " + (6 - senha.length()) + " dígito(s) para sua senha ser segura");
		} else {
			JOptionPane.showMessageDialog(null, "Excelente sua senha possuí o tamanho mínimo para ser segura");
		}

	}

}
