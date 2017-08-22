package vehicule.option;
import java.io.Serializable;

public class Climatisation implements Option, Serializable {
	
	 private OptionPrice prix;
	    private String nom;

	    public Climatisation() {
	        this.prix = OptionPrice.CLIMATISATION;
	        this.nom = "Climatisation";
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
