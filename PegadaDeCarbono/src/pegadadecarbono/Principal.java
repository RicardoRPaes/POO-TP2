package pegadadecarbono;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<CarbonFootprint> Lista = new ArrayList<CarbonFootprint>();

        //Cria lista de objetos do tipo CarbonFootprint.
        Lista.add(new Bicycle(190.00));
        Lista.add(new Building(3900.42));
        Lista.add(new Car(6245.15, 19.5));

        System.out.println(" Dados de cada Objeto:\n ");
        for( CarbonFootprint obj : Lista ){
            System.out.printf("\n%s: %s \n%s %s: %.2f\n",
                "informações de ", obj.getClass().getName(),
                obj.toString(),
                "Carbon footprint is ", obj.getCarbonFootprint());
        }//end for loop        
    }//end of main
}


