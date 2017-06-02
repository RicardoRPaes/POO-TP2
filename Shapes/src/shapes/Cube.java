package shapes;

/**
 * class Cube - classe do cubo, herda de ThreeDimensionalShape.
 */
public class Cube extends ThreeDimensionalShape{
    /**
     * param edge - parâmetro de um cubo.
     */
    private double edge;

    /**
     * constructor Cube - inicializa o objeto cubo.
     */
    public Cube() {
        setEdge(0.0);
    }
    
    /**
     * initialize Circle - da ao parâmetro do objeto cubo criado uma variável e.
     */
    public Cube(double e) {
        setEdge(e);
    }

    /**
     * method setRadius - seta a borda para o valor do parâmetro.
     */
    public void setEdge(double e) {
        edge = e;
    }

    /**
     * method getRadius - retorna a borda.
     */
    public double getEdge() {
        return edge;
    }

    /**
     * method calculateArea - calcula a área do cubo.
     */
    public double calculateArea() {
        return 6 * Math.pow(getEdge(), 2);
    }

    /**
     * method calculateVolume - calcula o volume do cubo.
     */
    public double calculateVolume() {
        return Math.pow(getEdge(), 3);
    }

    /**
     * method toString - imprime as informações do cubo.
     */
    @Override
    public String toString() {
        return String.format("%sBorda: %.2f\n", super.toString(), getEdge());
    }
}