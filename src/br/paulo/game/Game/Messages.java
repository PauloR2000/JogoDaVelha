package br.paulo.game.Game;

import javax.swing.JOptionPane;

public class Messages {
	
	private static final String WINS = "Você venceu a partida!";
	private static final String LOSE = "Você perdeu a partida!";
	private static final String DRAWN = "A partida empatou!";
	private static final String SELECTION_OTHER_POSITION = "Posição inválida!";
	
	public void Wins() {
		//Este método informa a vitória ao jogador
		JOptionPane.showMessageDialog(null, WINS,"Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
	}
	public void Lose() {
		//Este método informa a derrota ao jogador
		JOptionPane.showMessageDialog(null, LOSE,"Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
	}
	public void Drawn() {
		//Este método informa o empate ao jogador
		JOptionPane.showMessageDialog(null, DRAWN,"Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
	}
	public void SelectionOtherPosition() {
		//Este método informa posição inválida ao jogador
		JOptionPane.showMessageDialog(null, SELECTION_OTHER_POSITION,"Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
	}
}
