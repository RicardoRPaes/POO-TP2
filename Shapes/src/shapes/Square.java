package shapes;

/**
 * class Square - classe do quadrado, herda de TwoDimensionalShape.
 */
public class Square extends TwoDimensionalShape {
    /**
     * param length - parâmetro de um quadrado.
     */
    private double length;

    /**
     * constructor Square - inicializa o objeto quadrado.
     */
    public Square() {
        setLength(0.0);
    }

    /**
     * initialize Square - da ao parâmetro do objeto quadrado criado uma variável l.
     */
    public Square(double l) {
        setLength(l);
    }

    /**
     * method setLength - seta o comprimento para o valor do parâmetro.
     */
    public void setLength(double l) {
        length = l;
    }

    /**
     * method getLength - retorna o comprimento.
     */
    public double getLength() {
        return length;
    }

    /**
     * method calculateArea - calcula a área do quadrado.
     */
    @Override
    public double calculateArea() {
        return Math.pow(getLength(), 2);
    }

    /**
     * method toString - imprime as informações do quadrado.
     */
    @Override
    public String toString() {
        return String.format("%sComprimento: %.2f\n", super.toString(), getLength());
    }
}
