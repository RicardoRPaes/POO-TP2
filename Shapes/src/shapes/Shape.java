package shapes;

/**
 * class Shape - classe pai, da origem aos outros formatos.
 */
public abstract class Shape {
    
    /**
     * method toString - imprime as informações do formato.
     */
    @Override
    public String toString() {
        return String.format("%s\n", getClass().getName());
    }
}
