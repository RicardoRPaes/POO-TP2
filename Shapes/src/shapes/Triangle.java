package shapes;

/**
 * class Circle - classe do triângulo, herda de TwoDimensionalShape.
 */
public class Triangle extends TwoDimensionalShape {
    /**
     * param radius - parâmetro de um triângulo.
     */
    private double base;
    /**
     * param radius - parâmetro de um triângulo.
     */
    private double height;

    /**
     * constructor Circle - inicializa o objeto triângulo.
     */
    public Triangle() {
        setBase(0.0);
        setHeight(0.0);
    }

    /**
     * initialize Circle - da ao parâmetro do objeto triângulo criado duas variáveis b e h.
     */
    public Triangle(double b, double h) {
        setBase(b);
        setHeight(h);
    }

    /**
     * method setBase - seta a base para o valor do parâmetro.
     */
    public void setBase(double b) {
        base = b;
    }

    /**
     * method setHeight - seta a altura para o valor do parâmetro.
     */
    public void setHeight(double h) {
        height = h;
    }

    /**
     * method getBase - retorna a base.
     */
    public double getBase() {
        return base;
    }

    /**
     * method getHeight - retorna a altura.
     */
    public double getHeight() {
        return height;
    }

    /**
     * method calculateArea - calcula a área do triângulo.
     */
    @Override
    public double calculateArea() {
        return (getBase() * getHeight()) / 2;
    }

    /**
     * method toString - imprime as informações do triângulo.
     */
    @Override
    public String toString() {
        return String.format("%sBase: %.2f\nAltura: %.2f\n", super.toString(), getBase(), getHeight());
    }

}
