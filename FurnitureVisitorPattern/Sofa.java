package FurnitureVisitorPattern;

public class Sofa implements Furniture{

    private double price;
    private double distance;

    public Sofa(double price, double distance) {

        this.price = price;
        this.distance = distance;

    }

    public double getPrice() {

        return price;

    }

    public double getDistance() {

        return distance;

    }

    @Override
    public double accept(ShippingCalc cost) {

        return cost.sofaCost(this);

    }

}
