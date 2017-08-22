package garageOpenClassroom;
import vehicule.option.Option;
import vehicule.moteur.Moteur;
import vehicule.moteur.MoteurHybride;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehicule implements Option, Serializable{

	protected double prix;
	protected String nom;
	protected Marque nomMarque;
	private Moteur moteur;
	
	private ArrayList<Option> options;
	
	//Constructeur par defaut
	
	public Vehicule(){
		options = new ArrayList<Option>();
		
	}
	//Surcharge de constructeur
	
	public Vehicule(double prix, String nom, ArrayList<Option> options, Marque nomMarque){
		this.prix= prix;
		this.nom = nom;
		this.options = options;
		this.nomMarque = nomMarque;
				
	}
	
	//methode pour ajouter des options
	public void addOption( Option opt){
		options.add(opt);
		
	}
	
	/**public String toString() {
        return "+ "+this.nomMarque+": "+this.nom+" - "+this.moteur.getType()+" "+this.moteur.cylindre+" ("+this.moteur.prixMoteur+"€) \n"
        +"--------------"+ this.options + ", valeure totale: "+getPrixTotal() + "€";
        */
	
	public Marque getMarque(){
		return this.nomMarque;
	}
	
	public List<Option> getOption(){
		return this.options;
	}
	
//getter et setter pour le prix
	
	public Double getPrix(){
		return this.prix;
	}
	public void setPrix(double prix){
		this.prix = prix;
	}
// getter et setter pour le nom
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom(){
		return this.nom;
	}

	 public void setMoteur(Moteur moteur) {
	        this.moteur = moteur;
	    }


		
	
	
}
