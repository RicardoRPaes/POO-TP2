package shapes;

/**
 * class ThreeDimensionalShape - classe pai, da origem aos formatos tri-dimensionais e herda de Shape.
 */
public abstract class ThreeDimensionalShape extends Shape {

    /**
     * method calculateVolume - método abstrato do calculo do volume.
     */
    public abstract double calculateVolume();

    /**
     * method calculateArea - método abstrato do calculo da área.
     */
    public abstract double calculateArea();
}
