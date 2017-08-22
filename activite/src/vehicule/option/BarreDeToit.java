package vehicule.option;
import java.io.Serializable;

public class BarreDeToit implements Option, Serializable {

    private OptionPrice prix;
    private String nom;

    public BarreDeToit() {
        this.prix = OptionPrice.BARREDETOIT;
        this.nom = "Barre de toit";
    }

    /* Return the price of the option */
    @Override
    public Double getPrix() {
        return this.prix.getPriceValue();
    }

    @Override
    public String getNom() {
    	return this.nom;
    }

}
