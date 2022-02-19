package Questoes;

import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		/*
		 * Quest�o 02
		 * 
		 * D�bora se inscreveu em uma rede social para se manter em contato com seus
		 * amigos. A p�gina de cadastro exigia o preenchimento dos campos de nome e
		 * senha, por�m a senha precisa ser forte. O site considera uma senha forte
		 * quando ela satisfaz os seguintes crit�rios: Possui no m�nimo 6 caracteres.
		 * Cont�m no m�nimo 1 digito. Cont�m no m�nimo 1 letra em min�sculo. Cont�m no
		 * m�nimo 1 letra em mai�sculo. Cont�m no m�nimo 1 caractere especial. Os
		 * caracteres especiais s�o: !@#$%^&*()-+ D�bora digitou uma string aleat�ria no
		 * campo de senha, por�m ela n�o tem certeza se � uma senha forte. Para ajudar
		 * D�bora, construa um algoritmo que informe qual � o n�mero m�nimo de
		 * caracteres que devem ser adicionados para uma string qualquer ser considerada
		 * segura.
		 */
		/* Aqui recebo o nome e a senha do usu�rio(a) */
		String nome = JOptionPane.showInputDialog(null, "Informe seu nome", "Seja bem-vindo(a) a nossa rede social",
				JOptionPane.PLAIN_MESSAGE);
		String senha = JOptionPane.showInputDialog(null, "Informe Sua senha", "Seja bem-vindo(a) " + nome,
				JOptionPane.PLAIN_MESSAGE);
		/*
		 * Como no final pede apenas para verificar qual o n�mero m�nimo de caracteres
		 * devem ser adcionados para que a senha seja segura, sabendo que o n�mero � 6,
		 * eu simplesmente fa�o um if que se a quantidade de caracteres for menor que 6
		 * ele retorna o quanto falta para 6, se n�o est� de acordo com o desejado
		 */
		if (senha.length() < 6) {
			JOptionPane.showMessageDialog(null,
					"falta " + (6 - senha.length()) + " d�gito(s) para sua senha ser segura");
		} else {
			JOptionPane.showMessageDialog(null, "Excelente sua senha possu� o tamanho m�nimo para ser segura");
		}

	}

}
