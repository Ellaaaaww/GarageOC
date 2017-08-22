package garageOpenClassroom;

public class D4 extends Vehicule {
	
	public D4(){
	super();
    super.setNom("D4");
    super.setPrix(VehiclePrice.A300B.getPriceValue());
    super.nomMarque = Marque.TROEN;
    
    System.out.println("Vous avez cree une D4");
	}
}
