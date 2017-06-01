package shapes;

/**
 * class ShapesMain - classe principal.
 */
public class ShapesMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];

        shapes[0] = new Square(1.0);
        shapes[1] = new Triangle(1.0, 1.0);
        shapes[2] = new Circle(1.0);
        shapes[3] = new Sphere(1.0);
        shapes[4] = new Cube(1.0);
        shapes[5] = new Tetrahedron(1.0);

        for (Shape s : shapes) {
            if (s instanceof TwoDimensionalShape) {
                System.out.printf("%sÁrea: %.2f\n\n", s.toString(), ((TwoDimensionalShape) s).calculateArea());
            } else if (s instanceof ThreeDimensionalShape) {
                System.out.printf("%sÁrea da superfície: %.2f\nVolume: %.2f\n\n", s.toString(),
                        ((ThreeDimensionalShape) s).calculateArea(),
                        ((ThreeDimensionalShape) s).calculateVolume());
            }
        }
    }
}
