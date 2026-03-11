package entitiens;

public class UserIndividual extends User{

    private double healthexpenditures;

    public UserIndividual(String name, double anualicome, double healthexpenditures) {
        super();
        this.healthexpenditures = this.healthexpenditures;
    }

    public double getHealthexpenditures() {
        return healthexpenditures;
    }

    public void setHealthexpenditures(double healthexpenditures) {
        this.healthexpenditures = healthexpenditures;
    }

    @Override
    public double tax(){

        /// guardar o cálculo do imposto da pessoa física///
        double basicTax;

        if( getAnualincome() < 20000.0){

            basicTax = getAnualincome() * 0.15;
        }
        else {
            basicTax = getAnualincome() * 0.25;
        }
        basicTax =- healthexpenditures *0.5;

        return basicTax;
    }
}

