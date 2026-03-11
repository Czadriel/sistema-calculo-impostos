package entitiens;

public class UserCompany extends User{

    private Double numberofemployees;

    public UserCompany(String name, double anualicome, double numberofemployees) {
        super();
        this.numberofemployees = this.numberofemployees;
    }

    public double getNumberofemployees() {
        return numberofemployees;
    }

    public void setNumberofemployees(double numberofemployees) {
        numberofemployees = numberofemployees;
    }

    @Override
    public double tax(){
        if(getNumberofemployees() > 10){
            return getAnualincome() * 0.14;
        }
        else{
            return getAnualincome() * 0.16;
        }
    }
}

