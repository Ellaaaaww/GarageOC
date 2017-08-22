package vehicule.option;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable{

	 private OptionPrice prix;
	    private String nom;

	    public SiegeChauffant() {
	        this.prix = OptionPrice.SIEGECHAUFFANT;
	        this.nom = "Siège chauffant";
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
