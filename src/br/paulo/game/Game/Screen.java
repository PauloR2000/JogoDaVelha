package br.paulo.game.Game;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Screen extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private static final int height = 307;
	private static final int width = 285;
	public JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	Messages msg;
	private int num;
	private boolean newNum = true, end = false;
	
	@SuppressWarnings("static-access")
	public Screen() {
		
		/*-----------------------------------------JFrame-----------------------------------------*/
		
		this.setTitle("Jogo da Velha");
		this.setSize(width,height);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		/*-----------------------------------------JButton-----------------------------------------*/
		
		btn1 = new JButton();
		btn2 = new JButton();
		btn3 = new JButton();
		btn4 = new JButton();
		btn5 = new JButton();
		btn6 = new JButton();
		btn7 = new JButton();
		btn8 = new JButton();
		btn9 = new JButton();
		
		btn1.setFont(new Font("Arial", 0, 40));
		btn2.setFont(new Font("Arial", 0, 40));
		btn3.setFont(new Font("Arial", 0, 40));
		btn4.setFont(new Font("Arial", 0, 40));
		btn5.setFont(new Font("Arial", 0, 40));
		btn6.setFont(new Font("Arial", 0, 40));
		btn7.setFont(new Font("Arial", 0, 40));
		btn8.setFont(new Font("Arial", 0, 40));
		btn9.setFont(new Font("Arial", 0, 40));
			
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		
		/*-----------------------------------------JPanel-----------------------------------------*/
		
		JPanel pn1 = new JPanel();
		pn1.setLayout(new GridLayout(3,2));
		pn1.setBounds(0,0,280,280);
		pn1.add(btn1);
		pn1.add(btn2);
		pn1.add(btn3);
		pn1.add(btn4);
		pn1.add(btn5);
		pn1.add(btn6);
		pn1.add(btn7);
		pn1.add(btn8);
		pn1.add(btn9);
		
		/*-----------------------------------------JFrame-----------------------------------------*/
		
		this.add(pn1);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				if (e.getID() == WindowEvent.WINDOW_CLOSING){
					int selectedOption = JOptionPane.showConfirmDialog(null,"Deseja sair realmente do jogo?", "Jogo da Velha", JOptionPane.YES_NO_OPTION);
					if(selectedOption == JOptionPane.YES_OPTION) {
						System.exit(0);
					}
				}
			}
		});
	}
	
	/*-----------------------------------------Action JButton-----------------------------------------*/
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		/**
		 * newNum: Permite o acesso ao método getNum() para gerar um novo número aleatório de acesso
		 * a algum IF.
		 * 
		 * CheckPlayer(): Esse método é chamado após a jogada do Player X, para conferir se ouve
		 * vitória, empate ou derrota.
		 * 
		 * getNum(): Gera um número aleatório.
		 * 
		 * CheckAIPlayer(): Esse método checa se a maquina teve vitória, empate ou derrota.
		 * 
		 * AIPlayer(); Método responsável pela jogada da máquina, ela checa através de IFs se o JButton
		 * já foi setado ou não e confere se o número aleatório é o mesmo, caso contrário ela checa o 
		 * próximo IF, se o número aleatório estiver em um IF onde o JButton já foi setado, ele percorre
		 * até o método getNum() para gerar um novo número e chama o método AIPLayer novamente e
		 * percorre os IFs até dar certo em algum IF, quando ele acessar um IF ira checar se venceu ou 
		 * empatou a partida, na próxima linha seta o newNum como false para não acessar o método que
		 * gera outro número
		 * 
		 * end: Está variável controla o fluxo do jogo após seu fim, caso o Player X vença ele não chama
		 * o método getNum() e o turno começa com o Player X, caso o jogo não tenha acabado o end
		 * continua setado como false e o jogo continua com o AIPlayer.
		 */
		
		//Btn1
		if(e.getSource() == btn1) {
			if(btn1.getText().equals("")) {
				end = false;
				btn1.setText("X");
				newNum = true;
				CheckPlayer();
				if(end) {
				
				} else {
					getNum();
				}
			} else {
				msg = new Messages();
				msg.SelectionOtherPosition();
			}
		}
		
		//Btn2
		if(e.getSource() == btn2) {
			if(btn2.getText().equals("")) {
				end = false;
				btn2.setText("X");
				newNum = true;
				CheckPlayer();
				if(end) {
				
				} else {
					getNum();
				}
			} else {
				msg = new Messages();
				msg.SelectionOtherPosition();
			}
		}
		
		//Btn3
		if(e.getSource() == btn3) {
			if(btn3.getText().equals("")) {
				end = false;
				btn3.setText("X");
				newNum = true;
				CheckPlayer();
				if(end) {
				
				} else {
					getNum();
				}
			} else {
				msg = new Messages();
				msg.SelectionOtherPosition();
			}
		}
		
		//Btn4
		if(e.getSource() == btn4) {
			if(btn4.getText().equals("")) {
				end = false;
				btn4.setText("X");
				newNum = true;
				CheckPlayer();
				if(end) {
				
				} else {
					getNum();
				}
			} else {
				msg = new Messages();
				msg.SelectionOtherPosition();
			}
		}
		
		//Btn5
		if(e.getSource() == btn5) {
			if(btn5.getText().equals("")) {
				end = false;
				btn5.setText("X");
				newNum = true;
				CheckPlayer();
				if(end) {
				
				} else {
					getNum();
				}
			} else {
				msg = new Messages();
				msg.SelectionOtherPosition();
			}
		}
		
		//Btn6
		if(e.getSource() == btn6) {
			if(btn6.getText().equals("")) {
				end = false;
				btn6.setText("X");
				newNum = true;
				CheckPlayer();
				if(end) {
				
				} else {
					getNum();
				}
			} else {
				msg = new Messages();
				msg.SelectionOtherPosition();
			}
		}
		
		//Btn7
		if(e.getSource() == btn7) {
			if(btn7.getText().equals("")) {
				end = false;
				btn7.setText("X");
				newNum = true;
				CheckPlayer();
				if(end) {
				
				} else {
					getNum();
				}
			} else {
				msg = new Messages();
				msg.SelectionOtherPosition();
			}
		}
		
		//Btn8
		if(e.getSource() == btn8) {
			if(btn8.getText().equals("")) {
				end = false;
				btn8.setText("X");
				newNum = true;
				CheckPlayer();
			if(end) {
				
			} else {
				getNum();
			}
		} else {
			msg = new Messages();
			msg.SelectionOtherPosition();
		}
	}
		
		//Btn9
		if(e.getSource() == btn9) {
			if(btn9.getText().equals("")) {
				end = false;
				btn9.setText("X");
				newNum = true;
				CheckPlayer();
				if(end) {
				
				} else {
					getNum();
				}
			} else {
				msg = new Messages();
				msg.SelectionOtherPosition();
			}
		}
	}
	
	public void AIPlayer() {
		if(btn1.getText().equals("") && num == 0) {
			btn1.setText("O");
			CheckAIPlayer();
			newNum = false;
		}
		if(btn2.getText().equals("") && num == 1) {
			btn2.setText("O");
			CheckAIPlayer();
			newNum = false;
		}
		if(btn3.getText().equals("") && num == 2) {
			btn3.setText("O");
			CheckAIPlayer();
			newNum = false;
		}
		if(btn4.getText().equals("") && num == 3) {
			btn4.setText("O");
			CheckAIPlayer();
			newNum = false;
		}
		if(btn5.getText().equals("") && num == 4) {
			btn5.setText("O");
			CheckAIPlayer();
			newNum = false;
		}
		if(btn6.getText().equals("") && num == 5) {
			btn6.setText("O");
			CheckAIPlayer();
			newNum = false;
		}
		if(btn7.getText().equals("") && num == 6) {
			btn7.setText("O");
			CheckAIPlayer();
			newNum = false;
		}
		if(btn8.getText().equals("") && num == 7) {
			btn8.setText("O");
			CheckAIPlayer();
			newNum = false;
		}
		if(btn9.getText().equals("") && num == 8) {
			btn9.setText("O");
			CheckAIPlayer();
			newNum = false;
		}
		if(newNum) {
			getNum();
		}
	}
	public void getNum() {
		num = (int) (Math.random() * (8 - 0));
		CheckAIPlayer();
		AIPlayer();
	}
	
	public void CheckPlayer() {
		if (((btn1.getText().equals("X")) && (btn2.getText().equals("X")) && (btn3.getText().equals("X"))) || 
		((btn4.getText().equals("X")) && (btn5.getText().equals("X")) && (btn6.getText().equals("X"))) || 
		((btn7.getText().equals("X")) && (btn8.getText().equals("X")) && (btn9.getText().equals("X"))) || 
					      
		((btn1.getText().equals("X")) && (btn4.getText().equals("X")) && (btn7.getText().equals("X"))) || 
		((btn2.getText().equals("X")) && (btn5.getText().equals("X")) && (btn8.getText().equals("X"))) || 
		((btn3.getText().equals("X")) && (btn6.getText().equals("X")) && (btn9.getText().equals("X"))) || 
					      
		((btn1.getText().equals("X")) && (btn5.getText().equals("X")) && (btn9.getText().equals("X"))) || (
		(btn3.getText().equals("X")) && (btn5.getText().equals("X")) && (btn7.getText().equals("X")))) {
					
			msg = new Messages();
			msg.Wins();
			end = true;
			CleanTray();
					
		} else if ((!btn1.getText().equals("")) && (!btn2.getText().equals("")) && (!btn3.getText().equals("")) && 
		(!btn4.getText().equals("")) && (!btn5.getText().equals("")) && (!btn6.getText().equals("")) && 
		(!btn7.getText().equals("")) && (!btn8.getText().equals("")) && (!btn9.getText().equals(""))) {
			
			msg = new Messages();
			msg.Drawn();
			end = true;
			CleanTray();
		}
	}
	public void CheckAIPlayer() {
		if (((btn1.getText().equals("O")) && (btn2.getText().equals("O")) && (btn3.getText().equals("O"))) || 
		((btn4.getText().equals("O")) && (btn5.getText().equals("O")) && (btn6.getText().equals("O"))) || 
		((btn7.getText().equals("O")) && (btn8.getText().equals("O")) && (btn9.getText().equals("O"))) || 
							      
		((btn1.getText().equals("O")) && (btn4.getText().equals("O")) && (btn7.getText().equals("O"))) || 
		((btn2.getText().equals("O")) && (btn5.getText().equals("O")) && (btn8.getText().equals("O"))) || 
		((btn3.getText().equals("O")) && (btn6.getText().equals("O")) && (btn9.getText().equals("O"))) || 
							      
		((btn1.getText().equals("O")) && (btn5.getText().equals("O")) && (btn9.getText().equals("O"))) || (
		(btn3.getText().equals("O")) && (btn5.getText().equals("O")) && (btn7.getText().equals("O")))) {
			
			msg = new Messages();
			msg.Lose();
			end = true;
			CleanTray();
			
		} else if ((!btn1.getText().equals("")) && (!btn2.getText().equals("")) && (!btn3.getText().equals("")) && 
		(!btn4.getText().equals("")) && (!btn5.getText().equals("")) && (!btn6.getText().equals("")) && 
		(!btn7.getText().equals("")) && (!btn8.getText().equals("")) && (!btn9.getText().equals(""))) {
			msg = new Messages();
			msg.Drawn();
			end = true;
			CleanTray();
		}
	}
	public void CleanTray() {
		btn1.setText("");
		btn2.setText("");
		btn3.setText("");
		btn4.setText("");
		btn5.setText("");
		btn6.setText("");
		btn7.setText("");
		btn8.setText("");
		btn9.setText("");
	}
}