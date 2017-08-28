package br.paulo.game.Game;

import javax.swing.JOptionPane;

public class Messages {
	
	private static final String WINS = "Voc� venceu a partida!";
	private static final String LOSE = "Voc� perdeu a partida!";
	private static final String DRAWN = "A partida empatou!";
	private static final String SELECTION_OTHER_POSITION = "Posi��o inv�lida!";
	
	public void Wins() {
		//Este m�todo informa a vit�ria ao jogador
		JOptionPane.showMessageDialog(null, WINS,"Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
	}
	public void Lose() {
		//Este m�todo informa a derrota ao jogador
		JOptionPane.showMessageDialog(null, LOSE,"Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
	}
	public void Drawn() {
		//Este m�todo informa o empate ao jogador
		JOptionPane.showMessageDialog(null, DRAWN,"Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
	}
	public void SelectionOtherPosition() {
		//Este m�todo informa posi��o inv�lida ao jogador
		JOptionPane.showMessageDialog(null, SELECTION_OTHER_POSITION,"Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
	}
}
