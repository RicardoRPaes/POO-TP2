package pegadadecarbono;


public class Bicycle implements CarbonFootprint{
    
    private double KmAnuais;
    private final int caloriasPorKM = 30;

    //Contrutor
    public Bicycle(double KmAnuais) {
        this.KmAnuais = KmAnuais;
    }

    public double getKmAnuais() {
        return KmAnuais;
    }

    public void setKmAnuais(double KmAnuais) {
        this.KmAnuais = KmAnuais;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "KmAnuais = " + KmAnuais + '}';
    }
    
    
    
    @Override
    public double getCarbonFootprint() {
        return KmAnuais * caloriasPorKM;
    }
    
    
}
