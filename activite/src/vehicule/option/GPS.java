package vehicule.option;

import java.io.Serializable;

public class GPS implements Option, Serializable{
	
	 private OptionPrice prix;
	    private String nom;

	    public GPS() {
	        this.prix = OptionPrice.GPS;
	        this.nom = "GPS";
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
