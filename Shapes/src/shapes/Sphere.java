package shapes;

/**
 * class Sphere - classe da esfera, herda de ThreeDimensionalShape.
 */
public class Sphere extends ThreeDimensionalShape {
    /**
     * param radius - parâmetro de uma esfera.
     */
    private double radius;
    
    /**
    * constructor Sphere - inicializa o objeto esfera.
    */
    public Sphere() {
        setRadius(0.0);
    }
    
    /**
     * initialize Sphere - da ao objeto esfera criado uma variável r.
     */
    public Sphere(double r) {
        setRadius(r);
    }

    /**
     * method setRadius - seta o radiano para o valor do parâmetro.
     */
    public void setRadius(double r) {
        radius = r;
    }

    /**
     * method getRadius - retorna o raio.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * method calculateArea - calcula a área da esfera.
     */
    public double calculateArea() {
        return (4 * Math.PI) * (Math.pow(getRadius(), 2));
    }

    /**
     * method calculateVolume - calcula o volume da esfera.
     */
    public double calculateVolume() {
        double v = 4 / 3;
        return (1.3333 * Math.PI) * (Math.pow(getRadius(), 3));
    }

    /**
     * method toString - imprime as informações da esfera.
     */
    @Override
    public String toString() {
        return String.format("%sRaio: %.2f\n", super.toString(), getRadius());
    }
}
