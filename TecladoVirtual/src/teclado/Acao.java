package teclado;

import java.awt.Component;
import javax.swing.JButton;

/**
 * Acao Classe respons�vel tratar o c�digo da teclado pressionada de acordo com
 * seu conte�do
 * 
 * @version 0.9.0
 * @author Ricardo Paes
 * @author Thiago Alves
 */

public class Acao {

	protected int cod;
	protected String letter;
	protected Component[] components;

	/*
	 * Construtor da classe Acao
	 *
	 * respons�vel por chamar os m�todos setCod, setLetter, e setComponents
	 */

	public Acao(Component components[], int keycode) {
		setCod(keycode);
		setLetter(getBtnSymbol());
		setComponents(components);
	}

	/*
	 * @params cod (codigo) - int
	 */
	private void setCod(int cod) {
		this.cod = cod;
	}

	/*
	 * @params letter (letra) - String
	 */
	private void setLetter(String letter) {
		this.letter = letter;
	}

	/*
	 * @params comp (componentes do teclado) - Array Component
	 */
	private void setComponents(Component[] comp) {
		this.components = comp;
	}

	/*
	 * @return cod (codigo)
	 */
	private int getCod() {
		return this.cod;
	}

	/*
	 * @return letter (String com letra)
	 */
	private String getLetter() {
		return this.letter;
	}

	/*
	 * @return components (array com os componentes)
	 */
	private Component[] getComponents() {
		return this.components;
	}

	/*
	 * identifica se a tecla � um caracter especial e retorna o texto
	 * correspondente a ele, caso contr�rio chama o metodo mapeamento
	 * 
	 * @return conte�do do bot�o (String)
	 */
	private String getBtnSymbol() {
		switch (getCod()) {
		case 32:
			return "space";
		case 9:
			return "Tab";
		case 20:
			return "Caps";
		case 16:
			return "Shift";
		case 37:
			return "<";
		case 38:
			return "^";
		case 39:
			return ">";
		case 40:
			return "v";
		case 8:
			return "Backspace";
		case 10:
			return "ENTER";
		case 0:
			return "?";
		case 129:
			return "�";
		case 59:
			return ":";
		default:
			return Character.toString((char) getCod());
		}
	}

	/*
	 * metodo respons�vel por mapear nos componentes do teclado, o bot�o
	 * correspondente ao caracter.
	 * 
	 * @return btn (ponteiro do bot�o) - JButton
	 */
	public JButton mapeamento() {
		for (Component component : getComponents()) {
			if (component instanceof JButton) {
				JButton btn = (JButton) component;
				if (btn.getText().equals(getLetter())) {
					return btn;
				}
			}
		}
		return null;
	}

}
