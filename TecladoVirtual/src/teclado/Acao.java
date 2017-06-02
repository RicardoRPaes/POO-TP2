package teclado;

import java.awt.Component;
import javax.swing.JButton;

/**
 * Classe responsável por identificar o caracter digitado e destacá-lo no teclado virtual
 *
 * @author Ricardo Paes & Thiago Alves
 */
public class Acao {

    protected int cod;
    protected String letter;
    protected Component[] components;

    public Acao(Component components[], int keycode) {
        setCod(keycode);
        setLetter(getBtnSymbol());
        setComponents(components);
    }

    private void setCod(int cod) {
        this.cod = cod;
    }

    private void setLetter(String letter) {
        this.letter = letter;
    }

    private void setComponents(Component[] comp) {
        this.components = comp;
    }

    private int getCod() {
        return this.cod;
    }
    
    private String getLetter(){
        return this.letter;
    }

    private Component[] getComponents() {
        return this.components;
    }
    
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
                return ">";
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
                return Character.toString((char)getCod());
        }
    }
    
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

