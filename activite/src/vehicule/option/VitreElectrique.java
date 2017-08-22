package vehicule.option;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable{

	private OptionPrice prix;
    private String nom;

    public VitreElectrique() {
        this.prix = OptionPrice.VITREELECTRIQUE;
        this.nom = "Vitre éléctrique";
    }

   
    public Double getPrix() {
        return this.prix.getPriceValue();
    }

    
    public String getNom() { 
    	return this.nom;
    	}
}
