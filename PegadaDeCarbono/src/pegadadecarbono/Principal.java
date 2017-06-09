package pegadadecarbono;

import java.util.ArrayList;

/**
 * Classe respons�vel criar um array com uma lista edificios e veiculos e mostra
 * a quantidade de carbono gasto por cada elemento da lista
 * 
 * @version 0.9.0
 * @author Ricardo Paes
 * @author Thiago Alves
 */

public class Principal {

	public static void main(String[] args) {

		// cria lista de elementos
		ArrayList<CarbonFootprint> Lista = new ArrayList<CarbonFootprint>();

		// adiciona na lista os elementos e suas respectivas informa��es
		Lista.add(new Bicycle(190.00));
		Lista.add(new Building(3900.42));
		Lista.add(new Car(6245.15, 19.5));

		// visualiza��o da lista e seus resultados
		System.out.println("Dados de cada �tem de estudo: ");
		for (CarbonFootprint obj : Lista) {
			System.out.printf("\n%s: %s \n%s %s: %.2f\n", "Valores para", obj.getClass().getName(), obj.toString(),
					"Pegada de carbono", obj.getCarbonFootprint());
		}
	}
}
