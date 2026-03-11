package entitiens;

public abstract class User {

    private String name;
    private double anualincome;

    public User() {
        this.name = name;
        this.anualincome = anualincome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualincome() {
        return anualincome;
    }

    public void setAnualincome(double anualincome) {
        this.anualincome = anualincome;
    }

    public abstract double tax();
}
