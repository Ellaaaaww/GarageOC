package vehicule.moteur;
import java.io.Serializable;

public class Moteur implements Serializable{

	private TypeMoteur type;
    protected String cylindre;
    protected Double prix;

    public Moteur(String cylindre, Double prix) {
        this.cylindre = cylindre;
        this.prix = prix;
    }

    public String toString() {
        return super.toString();
    }

    public Double getPrix() {
        return this.prix;
    }
    public String getCylindre() { 
    	return this.cylindre;
    }
}
