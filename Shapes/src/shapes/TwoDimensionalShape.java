package shapes;

/**
 * class ThreeDimensionalShape - classe pai, da origem aos formatos bi-dimensionais e herda de Shape.
 */
public abstract class TwoDimensionalShape extends Shape {

    /**
     * param area - parâmetro de um formato bi-dimensional.
     */
    private double area;

    /**
     * method toString - retorna a área.
     */
    public double getArea() {
        return area;
    }

    /**
     * method calculateArea - método abstrato do calculo da área.
     */
    public abstract double calculateArea();

}
