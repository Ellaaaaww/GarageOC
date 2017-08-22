package garageOpenClassroom;

public enum VehiclePrice {
	 	A300B(0d),
	    D4(0d),
	    LAGOUNA(0d);

	    private double priceValue;

	    VehiclePrice(double price) {
	        this.priceValue = price;
	    }

	    public double getPriceValue() {
	        return this.priceValue;
	    }
}
