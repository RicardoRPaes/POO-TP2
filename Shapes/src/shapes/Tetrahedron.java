package shapes;

/**
 * class Tetrahedron - classe do tetraedro, herda de ThreeDimensionalShape.
 */
public class Tetrahedron extends ThreeDimensionalShape {
    /**
     * param edge - parâmetro de um tetraedro.
     */
    private double edge;

    /**
     * constructor Tetrahedron - inicializa o objeto tetraedro.
     */
    public Tetrahedron() {
        setEdge(0.0);
    }

    /**
     * initialize Tetrahedron - da ao parâmetro do objeto tetraedro criado uma variável e.
     */
    public Tetrahedron(double e) {
        setEdge(e);
    }

    /**
     * method setEdge - seta a borda para o valor do parâmetro.
     */
    public void setEdge(double e) {
        edge = e;
    }

    /**
     * method getEdge - retorna a borda.
     */
    public double getEdge() {
        return edge;
    }

    /**
     * method calculateArea - calcula a área do tetraedro.
     */
    public double calculateArea() {
        return Math.sqrt(3) * Math.pow(getEdge(), 2);
    }

    /**
     * method calculateVolume - calcula o volume do tetraedro.
     */
    public double calculateVolume() {
        return Math.pow(getEdge(), 3) / (6 * Math.sqrt(2));
    }

    /**
     * method toString - imprime as informações do tetraedro.
     */
    @Override
    public String toString() {
        return String.format("%sBorda: %.2f\n", super.toString(), getEdge());
    }

}
