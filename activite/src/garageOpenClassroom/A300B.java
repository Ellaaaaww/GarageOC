package garageOpenClassroom;

public class A300B extends Vehicule{
	
	public A300B() {
        super();
        super.setNom("A300B");
        super.setPrix(VehiclePrice.A300B.getPriceValue());
        super.nomMarque = Marque.PIGEOT;
        System.out.println("Vous avez cree une A300B");
    }
}
