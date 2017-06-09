package teclado;

import java.awt.Component;
import javax.swing.JButton;

/**
 * Acao Classe responsável tratar o código da teclado pressionada de acordo com
 * seu conteúdo
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
	 * responsável por chamar os métodos setCod, setLetter, e setComponents
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
	 * identifica se a tecla é um caracter especial e retorna o texto
	 * correspondente a ele, caso contrário chama o metodo mapeamento
	 * 
	 * @return conteúdo do botão (String)
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
			return "´";
		case 59:
			return ":";
		default:
			return Character.toString((char) getCod());
		}
	}

	/*
	 * metodo responsável por mapear nos componentes do teclado, o botão
	 * correspondente ao caracter.
	 * 
	 * @return btn (ponteiro do botão) - JButton
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
