package shapes;

/**
 * class Circle - classe do círculo, herda de TwoDimensionalShape.
 */
public class Circle extends TwoDimensionalShape{
    /**
     * param radius - parâmetro de um círculo.
     */
    private double radius;

    /**
     * constructor Circle - inicializa o objeto círculo.
     */
    public Circle(){
        setRadius(0.0);
    }
    
    /**
     * initialize Circle - da ao parâmetro do objeto círculo criado uma variável r.
     */
    public Circle(double r){
        setRadius(r);
    }

    /**
     * method setRadius - seta os radianos para o valor do parâmetro.
     */
    public void setRadius(double r){
        radius = r;
    }

    /**
     * method getRadius - retorna os radianos.
     */
    public double getRadius(){
        return radius;
    }

    /**
     * method calculateArea - calcula a área do círculo.
     */
    public double calculateArea(){
        return Math.PI * (Math.pow(radius, 2));
    }

    /**
     * method toString - imprime as informações do círculo.
     */
    @Override
    public String toString(){
        return String.format("%sRaio: %.2f\n",super.toString(),getRadius());
    }
}