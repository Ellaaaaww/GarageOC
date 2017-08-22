package vehicule.option;

import java.io.Serializable;

public enum OptionPrice implements Serializable {
	
    BARREDETOIT(29.9d),
    CLIMATISATION(347.3d),
    GPS(113.56d),
    SIEGECHAUFFANT(562.9d),
    VITREELECTRIQUE(212.35d);

    private double priceValue;

    OptionPrice(double price) {
        this.priceValue = price;
    }

    public double getPriceValue() {
        return this.priceValue;
    }

}
